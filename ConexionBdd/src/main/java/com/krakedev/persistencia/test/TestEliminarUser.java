package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.servicios.AdminUsuarios;

public class TestEliminarUser {
	public static void main(String[] args) {
		Usuario user = new Usuario();
		 try {
			 user.setCedula("1105348976");
			 user.setNombre("Julio");
			 user.setApellido("Jaramillo");
			 AdminUsuarios.eliminarUser(user);
			 System.out.println("Usuario Eliminado con cedula: "+user.getCedula());
		} catch (Exception e) {
			
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	}
}
