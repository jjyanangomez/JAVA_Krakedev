package com.krakedev.ConexionBdd;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {
	public static void main(String[] args) {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
