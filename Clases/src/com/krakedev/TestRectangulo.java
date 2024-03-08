package com.krakedev;

public class TestRectangulo {
	public static void main(String[] args) {
		/******* Se invoca al constructor con parametros en donde se 
		 * 		ingresa los parametros para inicializar el objeto*******/
		Rectangulo r1 = new Rectangulo(10,5);
		Rectangulo r2 = new Rectangulo(8,3);
		/*r1.setBase(10);
		r1.setAltura(5);*/
		int area1 = r1.calcularArea();
		System.out.println("Area: "+area1);
		/*r2.setBase(8);
		r2.setAltura(3);*/
		int area2 = r2.calcularArea();
		System.out.println("Area: "+area2);
		//Probar metodo perímetro
		Rectangulo r3 = new Rectangulo(4,2);
		/*r3.setBase(4);
		r3.setAltura(2);*/
		double area3 = r3.calcularPerimetro();
		System.out.println("Perimetro R3:"+area3);
	}
}
