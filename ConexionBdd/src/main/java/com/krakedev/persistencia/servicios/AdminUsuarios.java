package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminUsuarios {
	private static final Logger LOGGER = LogManager.getLogger(AdminUsuarios.class);
	public static void insertarUser(Usuario user) throws Exception{
		Connection connection = null;
		PreparedStatement ps= null;
		LOGGER.trace("Usuario a insertar: "+user);
		try {
			connection =  ConexionBDD.conectar("Ejercicios");
			ps = connection.prepareStatement("INSERT INTO usuario (cedula, nombre, apellido, fecha_creacion, horas_trabajadas, saldo) "
					+ " VALUES(?,?,?,?,?,?);");
			ps.setString(1, user.getCedula());
			ps.setString(2, user.getNombre());
			ps.setString(3, user.getApellido());
			ps.setDate(4, new Date(user.getFecha_creacion().getTime()));
			ps.setInt(5, user.getHoras_trabajadas());
			ps.setBigDecimal(6, user.getSaldo());

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
	
	public static void actualizarUser(Usuario user) throws Exception{
		Connection connection = null;
		PreparedStatement ps= null;
		LOGGER.trace("Usuario a actualizar: "+user);
		try {
			connection =  ConexionBDD.conectar("Ejercicios");
			ps = connection.prepareStatement("UPDATE usuario "
					+ " SET nombre = ?,"
					+ " apellido = ?,"
					+ "	fecha_creacion = ?,"
					+ "	horas_trabajadas = ?,"
					+ " saldo = ? "
					+ " WHERE cedula = ?;");
			ps.setString(1, user.getNombre());
			ps.setString(2, user.getApellido());
			ps.setDate(3, new Date(user.getFecha_creacion().getTime()));			
			ps.setInt(4, user.getHoras_trabajadas());
			ps.setBigDecimal(5, user.getSaldo());
			
			ps.setString(6, user.getCedula());
			
			
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
	public static void eliminarUser(Usuario user) throws Exception{
		Connection connection = null;
		PreparedStatement ps= null;
		LOGGER.trace("Usuario a eliminar con cedula: "+user.getCedula());
		try {
			connection =  ConexionBDD.conectar("Ejercicios");
			ps = connection.prepareStatement("delete from usuario where cedula= ?;");	
			ps.setString(1, user.getCedula());
			
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
