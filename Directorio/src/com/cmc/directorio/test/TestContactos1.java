package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef = new Telefono(10, "movi", "0992111606");
		Telefono telef2 = new Telefono(10, "claro", "0986311957");
		Contacto c1 = new Contacto("Juan", "Yanangomez", telef, 56.4);
		Contacto c2 = new Contacto("Nancy", "Salinas", telef2, 48.2);
		AdminContactos ac = new AdminContactos();
		Contacto objContacto  = ac.buscarMasPesado(c1, c2);
		objContacto.imprimir();
		boolean result = ac.compararOperadoras(c1, c2);
		if (result) {
			System.out.println("Los telefonos si son de la misma operadora ("+result+")");
		}else {
			System.out.println("Los telefonos no son de la misma operadora ("+result+")");
		}
	}

}
