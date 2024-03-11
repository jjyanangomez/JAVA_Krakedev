package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
	public static void main(String[] args) {
		//Usuario no activado
		System.out.println("---********************---");
		Telefono telef = new Telefono(10, "movi", "0992111606");
		Contacto c = new Contacto("Juan", "Yanangomez", telef, 56.4);
		AdminContactos ac = new AdminContactos();
		ac.activarUsuario(c);
		c.imprimir();
		//Usuario Activado
		System.out.println("---********************---");
		Telefono telef2 = new Telefono(10, "movi", "0986311957");
		Contacto c2 = new Contacto("Nancy", "Salinas", telef2, 56.4);
		AdminTelefono at = new AdminTelefono();
		at.activarMensajeria(telef2);
		ac.activarUsuario(c2);
		c2.imprimir();
	}
}
