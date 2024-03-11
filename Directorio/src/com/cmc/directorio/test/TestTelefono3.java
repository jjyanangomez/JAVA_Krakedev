package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {
	public static void main(String[] args) {
		Telefono t1 = new Telefono(10, "movi", "0998756432");
		Telefono t2 = new Telefono(20, "claro", "098234234");
		Telefono t3 = new Telefono(30, "movi", "0992111606");
		
		AdminTelefono at = new AdminTelefono();
		int resultado = at.contarMovi(t1, t2, t3);
		System.out.println("Hay "+resultado+" telefonos con operadora movi");
	}
}
