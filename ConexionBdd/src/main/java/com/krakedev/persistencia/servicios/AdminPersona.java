package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersona {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersona.class); 
	public static void insertar(Persona per) throws Exception{
		//Prohibido usar el System.out.println(); si no es test
		Connection connection = null;
		PreparedStatement ps= null;
		LOGGER.trace("Persona a insertar: "+per);
		try {
			connection =  ConexionBDD.conectar("postgres");
			ps = connection.prepareStatement("insert into personas (cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
					+ "			values(?,?,?,?,?,?,?,?,?);");
			ps.setString(1, per.getCedula());
			ps.setString(2, per.getNombre());
			ps.setString(3, per.getApellido());
			ps.setString(4, per.getEstado_civil().getCodigo());
			ps.setInt(5, per.getNumero_hijos());
			ps.setDouble(6, per.getEstatura());
			ps.setBigDecimal(7, per.getCantidad_ahorrada());
			ps.setDate(8, new Date(per.getFecha_nacimiento().getTime()));
			ps.setTime(9, new Time(per.getHora_nacimiento().getTime()));

			ps.executeUpdate();			
			
		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void actualizar(Persona per) throws Exception{
		//Prohibido usar el System.out.println(); si no es test
		Connection connection = null;
		PreparedStatement ps= null;
		LOGGER.trace("Persona a actualizar: "+per);
		try {
			connection =  ConexionBDD.conectar("postgres");
			ps = connection.prepareStatement("UPDATE personas"
					+ " SET nombre = ?,"
					+ " apellido = ?,"
					+ "	estatura = ?,"
					+ " fecha_nacimiento = ?,"
					+ "	hora_nacimiento = ?,"
					+ " cantidad_ahorrada = ?,"
					+ "	numero_hijos = ?,"
					+ "	estado_civil_codigo = ? "
					+ " WHERE cedula = ?;");
			ps.setString(1, per.getNombre());
			ps.setString(2, per.getApellido());
			ps.setDouble(3, per.getEstatura());
			ps.setDate(4, new Date(per.getFecha_nacimiento().getTime()));
			ps.setTime(5, new Time(per.getHora_nacimiento().getTime()));
			ps.setBigDecimal(6, per.getCantidad_ahorrada());
			ps.setInt(7, per.getNumero_hijos());
			ps.setString(8, per.getEstado_civil().getCodigo());
			
			ps.setString(9, per.getCedula());
			
			
			ps.executeUpdate();			
			
		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
	}
	
	public static void eliminar(Persona per) throws Exception{
		//Prohibido usar el System.out.println(); si no es test
		Connection connection = null;
		PreparedStatement ps= null;
		LOGGER.trace("Persona a eliminar con cedula: "+per.getCedula());
		try {
			connection =  ConexionBDD.conectar("postgres");
			ps = connection.prepareStatement("delete from personas where cedula= ?;");	
			ps.setString(1, per.getCedula());
			
			ps.executeUpdate();			
			
		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar");
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
	}
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection connection = null;
		PreparedStatement ps= null;
		ResultSet rs= null;
		try {
			connection =  ConexionBDD.conectar("postgres");
			ps = connection.prepareStatement("Select * from personas where nombre like ?;");
			ps.setString(1, "%"+nombreBusqueda+"%");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				personas.add(p);
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar: ", e);
			throw new Exception("Error al consultar el nombre");
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return personas;
	}
	/*
	 * 
	 * 
	 *  Metodos solicitados para el reto 34
	 * 
	 * Metodos que devuelva todas las personas y metodo que busque por clave primaria(Cedula)
	 * 
	 */
	
	//Sacar todas las personas de la base de datos
	public static ArrayList<Persona> ListaPersonas() throws Exception{
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection connection = null;
		PreparedStatement ps= null;
		ResultSet rs= null;
		try {
			connection =  ConexionBDD.conectar("postgres");
			ps = connection.prepareStatement("Select * from personas;");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				String apellido = rs.getString("apellido");
				String codigo = rs.getString("estado_civil_codigo");
				EstadoCivil ec = new EstadoCivil(codigo,"");
				int numeroHijos = rs.getInt("numero_hijos");
				String cantidad = rs.getString("cantidad_ahorrada");
				Persona p = new Persona(cedula, nombre, apellido, ec);
				p.setNumero_hijos(numeroHijos);
				
				if(cantidad==null) {
					cantidad = "0.0";
				}
				cantidad = cantidad.replaceAll("[^0-9\\.]", "");
				LOGGER.trace("Cantidad Ahorrada: "+cantidad);
				p.setCantidad_ahorrada(new BigDecimal(cantidad));
				personas.add(p);
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar: ", e);
			throw new Exception("Error al traer todos las personas");
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return personas;
	}
	
	//Buscar a persona por su cedula
	public static Persona buscarPorCedula(String cedula) throws Exception{
		Persona objPersona = new Persona();
		Connection connection = null;
		PreparedStatement ps= null;
		ResultSet rs= null;
		try {
			connection =  ConexionBDD.conectar("postgres");
			ps = connection.prepareStatement("Select * from personas Where cedula = ?;");
			ps.setString(1, cedula);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String codigo = rs.getString("estado_civil_codigo");
				EstadoCivil ec = new EstadoCivil(codigo,"");
				int numeroHijos = rs.getInt("numero_hijos");
				String cantidad = rs.getString("cantidad_ahorrada");
				Persona p = new Persona(cedula, nombre, apellido, ec);
				p.setNumero_hijos(numeroHijos);
				
				if(cantidad==null) {
					cantidad = "0.0";
				}
				cantidad = cantidad.replaceAll("[^0-9\\.]", "");
				LOGGER.trace("Cantidad Ahorrada: "+cantidad);
				p.setCantidad_ahorrada(new BigDecimal(cantidad));
				objPersona = p;
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar la persona por su cedula: ", e);
			throw new Exception("Error al traer la persona por su cedula");
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return objPersona;
	}
}
