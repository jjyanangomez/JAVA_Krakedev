package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;

public class TestBuscarPorCedula {
	public static void main(String[] args) {
		try {
			Persona p = AdminPersona.buscarPorCedula("1105834079");
			System.out.println(p);
		} catch (Exception e) {
			System.out.println("Error al obtener la persona: "+e.getMessage());
		}
		
	}
}
