package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.servicios.AdminUsuarios;
import com.krakedev.persistencia.utils.Convertidor;

public class TestInsertarUser {
	public static void main(String[] args) {
		/*Nota: al metodo conectar lo modifique para que recibiera un valor de 
		  tipo String en donde se indique a que base de datos debe de conectarse*/
		Usuario user = new Usuario();
		user.setCedula("1105348976");
		user.setNombre("Julio");
		user.setApellido("Pañi");
		user.setHoras_trabajadas(6);
		user.setSaldo(new BigDecimal(800));
		try {
			Date fecha = Convertidor.convertirFecha("2024/03/22");
			user.setFecha_creacion(fecha);
			AdminUsuarios.insertarUser(user);
			System.out.println("Usuario insertado");
		} catch (Exception e) {
			System.out.println("Error al insertar el usuario: "+e);
		}
	}

}
