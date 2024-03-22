package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.servicios.AdminUsuarios;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarUser {
	public static void main(String[] args) {
		Usuario user = new Usuario();
		user.setCedula("1105348976");
		user.setNombre("Sebastian");
		user.setApellido("Pañi");
		user.setHoras_trabajadas(8);
		user.setSaldo(new BigDecimal(1200));
		try {
			Date fecha = Convertidor.convertirFecha("2024/03/22");
			user.setFecha_creacion(fecha);
			AdminUsuarios.actualizarUser(user);
			System.out.println("Usuario actualizado:"+user);
		} catch (Exception e) {
			System.out.println("Error al insertar el usuario: "+e);
		}
	}
}
