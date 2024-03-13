package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	
	public Estudiante( String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		notas =new ArrayList<Nota>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public void agregarNota(Nota nuevaNota) {
		Nota notarecuperda;
		if (notas.size()==0) {
			notas.add(nuevaNota);
		}else {
			if(nuevaNota.getCalificacion()>=0 && nuevaNota.getCalificacion()<=10) {
				for (int i = 0; i < notas.size(); i++) {
					notarecuperda = notas.get(i);
					if(notarecuperda.getMateria().getCodigo() != nuevaNota.getMateria().getCodigo()) {
						notas.add(nuevaNota);
						break;
					}
					
				}
			}
		}
		
	}
	public void modificarNota(String codigo,double nuevaNota) {
		Nota notarecuperda;
		if(nuevaNota>=0 && nuevaNota<=10) {
			for (int i = 0; i < notas.size(); i++) {
				notarecuperda = notas.get(i);
				if(codigo.equals(notarecuperda.getMateria().getCodigo())) {
					notarecuperda.setCalificacion(nuevaNota);
					break;
				}
				
			}
		}
		
	}
	public double calcularPromedioNotasEstudiante() {
		double valorNotas = 0;
		Nota notarecuperda;
		for (int i = 0; i < notas.size(); i++) {
			notarecuperda = notas.get(i);
			valorNotas +=notarecuperda.getCalificacion();
		}
		return (valorNotas/notas.size());
	}
	
	public void mostrar() {
		String dataEstudiante = "Estudiante[ Nombre: " + getNombre() + " Apellido: " + getApellido() + " Cedula:"
				+ getCedula() + "]";
		System.out.println(dataEstudiante);
		Nota notaElemento;
		for (int i = 0; i < notas.size(); i++) {
			notaElemento = notas.get(i);
			
			notaElemento.mostrar();
		}
	}
}
