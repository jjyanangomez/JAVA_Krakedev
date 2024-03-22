package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
			connection =  ConexionBDD.conectar();
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
			connection =  ConexionBDD.conectar();
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
			connection =  ConexionBDD.conectar();
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
}
