package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	ArrayList<Estudiante> estudiantes;

	
	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public String buscarEstudiantePorCedula(Estudiante student) {
		Estudiante objEstudiante = null;
		Estudiante estudianteEncontrado = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			objEstudiante = estudiantes.get(i);
			if(objEstudiante.getCedula().equals(student.getCedula())) {
				estudianteEncontrado = objEstudiante;
			}
		}
		if(estudianteEncontrado==null) {
			return null;
		}else {
			return "El estudiante ya se encuentra en este curso";
		}
	}
	public void matricularEstudiante(Estudiante student) {
		String objEstudiante = buscarEstudiantePorCedula(student);
		if(objEstudiante==null) {
			estudiantes.add(student);
		}else {
			System.out.println(objEstudiante);
		}
	}
	public double calcularPromedioCurso(){
		double valor = 0.0;
		Estudiante objEstudiante = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			objEstudiante = estudiantes.get(i);
			valor+=objEstudiante.calcularPromedioNotasEstudiante();
		}
		return valor/estudiantes.size();
	}
	public void mostrar() {
		Estudiante elementoEstudiante;
		System.out.print("Curso [ ");
		
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante=estudiantes.get(i);
		elementoEstudiante.mostrar();
		}
		System.out.print("]");
	}
		
}
