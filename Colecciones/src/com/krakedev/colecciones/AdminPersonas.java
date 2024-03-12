package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	ArrayList<Persona> personas;
	
	public AdminPersonas() {
		personas = new ArrayList<Persona>();
	}
	public void agregar(Persona p) {
		personas.add(p);
	}
	public void imprimir() {
		Persona objPersona;
		for (int i = 0; i < personas.size(); i++) {
			objPersona = personas.get(i);
			System.out.println("Persona: "+objPersona.getNombre()+" "+objPersona.getApellido()+" Edad: "+objPersona.getEdad());
		}
	}
	public Persona buscarPorNombre(String nombre) {
		Persona objPersona= null;
		Persona encontrada = null;
		for (int i = 0; i < personas.size(); i++) {
			objPersona = personas.get(i);
			if(objPersona.getNombre().equals(nombre)) {
				encontrada = objPersona;
			}
		}
		return encontrada;
	}
	
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> mayores = new ArrayList<Persona>();
		Persona objPersona= null;
		for (int i = 0; i < personas.size(); i++) {
			objPersona = personas.get(i);
			if(objPersona.getEdad()>edad) {
				mayores.add(objPersona);
			}
		}
		return mayores;
	}
}
