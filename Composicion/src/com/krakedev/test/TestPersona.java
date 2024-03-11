package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		p1.setNombre("Albert");
		p1.setApellido("Wesker");
		
		Direccion dir = new Direccion();
		dir.setCallePrincipal("Av. Salvador bustamente Celi");
		dir.setCalleSecundaria("No existe");
		dir.setNumero("N-47");
		p1.setDireccion(dir);
		
		String nombre = p1.getNombre();
		Direccion direccion = p1.getDireccion();
		
		System.out.println("nombre: "+nombre);
		System.out.println(direccion.getCallePrincipal());
		
		p1.imprimir();
		
		Persona p2 = new Persona();
		Direccion d2 = new Direccion("Av. 18 de noviembre","Eloy alfaro","n-86");
		p2.setNombre("Jill");
		p2.imprimir();
		//reducir el codigo para crear un objeto
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("aaaa","eeee","N/S"));
		p3.imprimir();
		
	}

}
