package com.krakedev.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio1 {
	public static void main(String[] args) {
		String valorRecupedado;
		ArrayList<String> cadenas = new ArrayList<String>();
		System.out.println(cadenas.size());
		
		cadenas.add("uno");
		cadenas.add("dos");
		System.out.println(cadenas.size());
		
		valorRecupedado = cadenas.get(1);
		System.out.println(valorRecupedado);
		String cadena;
		for (int i = 0; i < cadenas.size(); i++) {
			cadena = cadenas.get(i);
			System.out.println("cadena: "+cadena);
		}
	}
}
