package com.krakedev.herencia;

public class Gato extends Animal{
	public Gato() {
		
	}
	
	@Override
	public void dormir() {
		System.out.println("El gato se encuentra dormido");
	}
	
	public void maullar() {
		System.out.println("El gato se puso a maullar en el tejado");
	}
	public void maullar(String adjetivo) {
		System.out.println("El gato "+adjetivo +" se puso a maullar en el tejado");
	}
}
