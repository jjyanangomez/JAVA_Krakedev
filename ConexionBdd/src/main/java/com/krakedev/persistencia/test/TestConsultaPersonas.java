package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;

public class TestConsultaPersonas {
	public static void main(String[] args) {
		try {
			ArrayList<Persona> p =  AdminPersona.buscarPorNombre("a");
			System.out.println(p);
		} catch (Exception e) {
			System.out.println("Error al obtener las personas: "+e.getMessage());
		}
	}
}
