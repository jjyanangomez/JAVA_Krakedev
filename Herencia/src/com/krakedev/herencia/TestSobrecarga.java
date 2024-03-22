package com.krakedev.herencia;

public class TestSobrecarga {
	public static void main(String[] args) {
		Gato g = new Gato();
		//Invitar al primer metodo maullar
		g.maullar();
		//Invocar al segundo metodo maullar
		g.maullar("GORDO");
		
		
	}
}
