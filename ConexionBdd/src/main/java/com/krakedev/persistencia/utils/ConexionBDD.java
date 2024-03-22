package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/";
	private final static String USER = "postgres";
	private final static String PASSWORD = "root123";
	private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);
	public static Connection conectar(String baseDatos) throws Exception{
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection=DriverManager.getConnection(URL+baseDatos,USER,PASSWORD);
			LOGGER.debug("Conexion Exitosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error al establecer la conexion", e);
			throw new Exception("Error en la Infraestructura(Conexion)");
		} catch (SQLException e) {
			LOGGER.error("Error al conectarse revise usuario y clave", e);
			throw new Exception("Error al conectarse, revise usuario y clave");
		}
		return connection;
	}
}
