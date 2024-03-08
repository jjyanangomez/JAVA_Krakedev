package com.krakedev;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		r1.setBase(10);
		r1.setAltura(5);
		int area1 = r1.calcularArea();
		System.out.println("Area: "+area1);
		r2.setBase(8);
		r2.setAltura(3);
		int area2 = r2.calcularArea();
		System.out.println("Area: "+area2);
		//Probar metodo perímetro
		Rectangulo r3 = new Rectangulo();
		r3.setBase(4);
		r3.setAltura(2);
		double area3 = r3.calcularPerimetro();
		System.out.println("Perimetro R3:"+area3);
	}
}
