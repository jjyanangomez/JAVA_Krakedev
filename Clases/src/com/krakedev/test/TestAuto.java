package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/******* Se invoca al constructor con parametros en donde se 
		 * 		ingresa los parametros para inicializar el objeto*******/
		Auto a1 = new Auto("Toyota",2019,15.900);
		Auto a2 = new Auto("Hyundai",2019,38.500);
		//Atributos del carro 1
		/*a1.setMarca("Toyota");;
		a1.setAnio(2019);;
		a1.setPrecio(15.900);*/
		//Atributos del carro 2
		/*a2.setMarca("Hyundai");
		a2.setAnio(2019);
		a2.setPrecio(38.500);*/
		//Presentar los atributos en consola
		System.out.println("-------------- Auto 1 ---------------");
		System.out.println("Marca:"+a1.getMarca());
		System.out.println("año:"+a1.getAnio());
		System.out.println("precio:"+a1.getPrecio());
		System.out.println("-------------- Auto 2 ---------------");
		System.out.println("Marca:"+a2.getMarca());
		System.out.println("año:"+a2.getAnio());
		System.out.println("precio:"+a2.getPrecio());
	}

}
