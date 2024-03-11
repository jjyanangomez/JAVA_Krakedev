package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {
	public static void main(String[] args) {
		Telefono telef = new Telefono(10, "movi", "0992111606");
		Contacto c = new Contacto("Juan", "Yanangomez", telef, 56.4);
		c.imprimir();
	}
}
