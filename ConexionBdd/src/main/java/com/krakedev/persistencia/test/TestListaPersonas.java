package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;

public class TestListaPersonas {
	public static void main(String[] args) {
		try {
			ArrayList<Persona> p =  AdminPersona.ListaPersonas();
			for (Persona persona : p) {
				System.out.println(persona+"\n");
			}
		} catch (Exception e) {
			System.out.println("Error al obtener las personas: "+e.getMessage());
		}
	}
}
