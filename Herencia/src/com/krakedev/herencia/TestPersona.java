package com.krakedev.herencia;

public class TestPersona {
	public static void main(String[] args) {
		/*Persona persona = new Persona("11053834079","Julian");
		System.out.println(persona.toString());
		*/
		System.out.println("------------------- Test sobreescritura toString ----------------");
		Cuenta c = new Cuenta("22538640", 500.0);
		//Se llama al toString
		System.out.println(c);
		System.out.println(c.toString());
	}
}
