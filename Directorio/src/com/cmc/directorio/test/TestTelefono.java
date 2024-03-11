package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {
	public static void main(String[] args) {
		Telefono t1 = new Telefono(10,"movi","09941234123");
		//Imprimir en consola los datos
		System.out.println("Codigo: "+t1.getCodigo()+"\nNumero: "+t1.getNumero()+"\nOperadora: "+t1.getOperadora());
		
		
	}
}
