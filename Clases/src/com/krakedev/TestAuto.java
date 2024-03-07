package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		//Atributos del carro 1
		a1.marca="Toyota";
		a1.anio=2019;
		a1.precio= 15.900;
		//Atributos del carro 2
		a2.marca="Hyundai";
		a2.anio=2019;
		a2.precio= 38.500;
		//Presentar los atributos en consola
		System.out.println("-------------- Auto 1 ---------------");
		System.out.println("Marca:"+a1.marca);
		System.out.println("año:"+a1.anio);
		System.out.println("precio:"+a1.precio);
		System.out.println("-------------- Auto 2 ---------------");
		System.out.println("Marca:"+a2.marca);
		System.out.println("año:"+a2.anio);
		System.out.println("precio:"+a2.precio);
	}

}
