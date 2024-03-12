package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Juan", "Yanangomez"));
		personas.add(new Persona("Albert", "Wesker"));
		personas.add(new Persona("Jill", "Valentine"));
		
		Persona objPersona;
		for (int i = 0; i < personas.size(); i++) {
			objPersona = personas.get(i);
			System.out.println("Persona: "+objPersona.getNombre()+" - "+objPersona.getApellido());
		}
	}
}
