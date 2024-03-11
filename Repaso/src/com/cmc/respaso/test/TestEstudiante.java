package com.cmc.respaso.test;

import com.cmc.respaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante Studen = new Estudiante("Miguel");
		Studen.calificar(8);
		System.out.println(Studen.getResultado());
	}

}
