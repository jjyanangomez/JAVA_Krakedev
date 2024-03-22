package com.krakedev.ConexionBdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps= null;
		try {
			Class.forName("org.postgresql.Driver");
			//El usuario es postgress no root
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root123");
			System.out.println("Conexion exitosa");
			ps = connection.prepareStatement("insert into personas (cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
					+ "			values(?,?,?,?,?,?,?,?,?);");
			ps.setString(1, "1102664370");
			ps.setString(2, "Nancy");
			ps.setString(3, "Salinas");
			ps.setString(4, "C");
			ps.setInt(5, 1);
			ps.setDouble(6, 1.6);
			ps.setBigDecimal(7, new BigDecimal(50000));
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechastc="2020/03/22 10:05:04";
			try {
				Date fecha = sdf.parse(fechastc);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				//crear una date de la clase utilDate a una date de la clase sqlDate
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				Time t = new Time(fechaMilis);
				System.out.println(t);
				
				ps.setDate(8, fechaSQL);
				ps.setTime(9, t);
				
				
				ps.executeUpdate();
				System.out.println("Ejecuta insert");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
