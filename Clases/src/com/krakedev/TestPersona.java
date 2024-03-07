package com.krakedev;

public class TestPersona {
	public static void main(String[] args) {
		//Esto es un comentario
		Persona p = new Persona(); //1 y 2. crear una variable e intanciar la clase persona
		//3.Agregar valor al objeto instanciado
		p.nombre ="Albert Wesker";
		p.edad = 45;
		p.estatura = 1.90;
		System.out.println("Nombre:"+p.nombre);
		System.out.println("Edad:"+p.edad);
		System.out.println("Estatura:"+p.estatura);
		System.out.println("--------------------------------------");
		Persona p2 = new Persona();
		p2.nombre ="Jill Valentine";
		p2.edad = 35;
		p2.estatura = 1.75;
		System.out.println("Nombre:"+p2.nombre);
		System.out.println("Edad:"+p2.edad);
		System.out.println("Estatura:"+p2.estatura);
		System.out.println("--------------------------------------");
		//4. Cambiar los atributos
		p.nombre ="Mario";
		p.edad = 45;
		p.estatura = 1.56;
		//5. Acceder a los atributos
		System.out.println("Nombre:"+p.nombre);
		System.out.println("Edad:"+p.edad);
		System.out.println("Estatura:"+p.estatura);
	}
}
