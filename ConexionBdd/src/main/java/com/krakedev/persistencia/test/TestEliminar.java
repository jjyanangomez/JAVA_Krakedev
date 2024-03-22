package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;

public class TestEliminar {
	public static void main(String[] args) {
		 Persona p = new Persona();
		 try {
			 p.setCedula("1105348976");
			 p.setNombre("Julio");
			 p.setApellido("Jaramillo");
			 AdminPersona.eliminar(p);
			 System.out.println("Persona Eliminada con cedula: "+p.getCedula());
		} catch (Exception e) {
			
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		 
		
	}
}
