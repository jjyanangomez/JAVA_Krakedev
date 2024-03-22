package com.krakedev.ConexionBdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestInsertJava {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps= null;
		PreparedStatement ps2= null;
		try {
			Class.forName("org.postgresql.Driver");
			//El usuario es postgress no root
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Ejercicios","postgres","root123");
			System.out.println("Conexion exitosa");
			ps = connection.prepareStatement("INSERT INTO usuario (cedula, nombre, apellido, fecha_creacion, horas_trabajadas, saldo)"
					+ "			VALUES(?,?,?,?,?,?);");
			ps.setString(1, "1134567890");
			ps.setString(2, "Juan");
			ps.setString(3, "Yanangomez");
			java.sql.Date fechaSQL = fechaFormateada("2024/02/20");
			ps.setDate(4, fechaSQL);
			ps.setInt(5, 6);
			ps.setBigDecimal(6, new BigDecimal(1000.00));
			
			ps.executeUpdate();
			System.out.println("Ejecuta insert 1");
			
			//Segunda consulta
			ps2 = connection.prepareStatement("INSERT INTO usuario (cedula, nombre, apellido, fecha_creacion, horas_trabajadas, saldo)"
					+ "			VALUES(?,?,?,?,?,?);");
			ps2.setString(1, "1176543210");
			ps2.setString(2, "María");
			ps2.setString(3, "Santín");
			java.sql.Date fechaSQLRegistro2 = fechaFormateada("2023/12/25");
			ps2.setDate(4, fechaSQLRegistro2);
			ps2.setInt(5, 5);
			ps2.setBigDecimal(6, new BigDecimal(1500.50));
			
			ps2.executeUpdate();
			System.out.println("Ejecuta insert 2");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static java.sql.Date fechaFormateada(String fechastc){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date fecha = sdf.parse(fechastc);
			long fechaMilis = fecha.getTime();
			System.out.println(fechastc);
			//crear una date de la clase utilDate a una date de la clase sqlDate
			java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
			return fechaSQL;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
}
