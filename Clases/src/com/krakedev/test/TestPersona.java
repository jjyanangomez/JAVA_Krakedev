package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {
	public static void main(String[] args) {
		//Esto es un comentario
		Persona p = new Persona(); //1 y 2. crear una variable e intanciar la clase persona
		Persona p3 = new Persona("Juan Yanangomez");
		Persona p4 = new Persona("Juan Yanangomez",26,1.68);
		//3.Agregar valor al objeto instanciado
		p.setNombre("Albert Wesker");
		p.setEdad(45);;
		p.setEstatura(1.90);;
		System.out.println("Nombre:"+p.getNombre());
		System.out.println("Edad:"+p.getEdad());
		System.out.println("Estatura:"+p.getEstatura());
		System.out.println("--------------------------------------");
		Persona p2 = new Persona();
		p2.setNombre("Jill Valentine");
		p2.setEdad(35);
		p2.setEstatura(1.75);
		System.out.println("Nombre:"+p2.getNombre());
		System.out.println("Edad:"+p2.getEdad());
		System.out.println("Estatura:"+p2.getEstatura());
		System.out.println("--------------------------------------");
		//4. Cambiar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		//5. Acceder a los atributos
		System.out.println("Nombre:"+p.getNombre());
		System.out.println("Edad:"+p.getEdad());
		System.out.println("Estatura:"+p.getEstatura());
	}
}
