package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 =new Cuadrado();
		Cuadrado c2 =new Cuadrado();
		Cuadrado c3 =new Cuadrado();
		c1.lado=4;
		c2.lado=8;
		c3.lado=2;
		System.out.println("---------Area del Cuadrado 1---------");
		double calcularAreaCuadrado1 = c1.calcularArea();
		double calcularPerimetroCuadrado1 = c1.calcularPerimetro();
		System.out.println("Area C1:"+calcularAreaCuadrado1);
		System.out.println("Perimetro C1:"+calcularPerimetroCuadrado1);
		
		System.out.println("---------Area del Cuadrado 2---------");
		double calcularAreaCuadrado2 = c2.calcularArea();
		double calcularPerimetroCuadrado2 = c2.calcularPerimetro();
		System.out.println("Area C2:"+calcularAreaCuadrado2);
		System.out.println("Perimetro C2:"+calcularPerimetroCuadrado2);
		
		System.out.println("---------Area del Cuadrado 3---------");
		double calcularAreaCuadrado3 = c3.calcularArea();
		double calcularPerimetroCuadrado3 = c3.calcularPerimetro();
		System.out.println("Area C3:"+calcularAreaCuadrado3);
		System.out.println("Perimetro C3:"+calcularPerimetroCuadrado3);
				
	}

}
