package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {
	public static void main(String[] args) {
		Telefono t2 = new Telefono(20, "movi", "098234234");
		/* Antes**/
		System.out.println("Antes de cambiar el atributo tieneWhatsapp");
		System.out.println("Codigo: " + t2.getCodigo() + "\nNumero: " + t2.getNumero() + "\nOperadora: "
				+ t2.getOperadora() + "\nPuede Mensajear: " + t2.getTieneWhatsapp());
		/* Despues***/
		AdminTelefono at = new AdminTelefono();

		at.activarMensajeria(t2);
		System.out.println("Despues de cambiar el atributo tieneWhatsapp");
		System.out.println("Codigo: " + t2.getCodigo() + "\nNumero: " + t2.getNumero() + "\nOperadora: "
				+ t2.getOperadora() + "\nPuede Mensajear: " + t2.getTieneWhatsapp());
	}
}
