package com.krakedev.Excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Inicio");
		String a = null;
		try {
			a.substring(3);
			System.out.println("Fin");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Entra al cach");
		}finally {
			System.out.println("Entra al finally");
		}
		System.out.println("Fuera del catch");

	}

}
