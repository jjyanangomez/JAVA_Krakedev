package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> listTelefonos;
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		listTelefonos = new ArrayList<Telefono>();
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Telefono> getListTelefonos() {
		return listTelefonos;
	}
	public void setListTelefonos(ArrayList<Telefono> listTelefonos) {
		this.listTelefonos = listTelefonos;
	}
	
	public void imprimir() {
		if(direccion== null) {
			System.out.println("***"+nombre+" "+apellido+"***"
					+"\nNo tiene asociada una direccion");
		}else {
			/*System.out.println("***"+nombre+" "+apellido+"***"
					+"\nDireccion: "+direccion.getCallePrincipal()+" y "+direccion.getCalleSecundaria());*/
			System.out.println("\nCédula: "+cedula
					+"\nNombre: "+nombre
					+"\nApellido: "+apellido
					+"\nDireccion:\n Calle Principal"+direccion.getCallePrincipal()
					+"\n Calle Secundaria: "+direccion.getCalleSecundaria());
		}
	}
	public void agregarTelefono(Telefono telf) {
		listTelefonos.add(telf);
	}
	public void mostrarTelefonos() {
		Telefono ObjTelefono;
		String resultado = "Teléfonos con estado C:";
		for (int i = 0; i < listTelefonos.size(); i++) {
			ObjTelefono = listTelefonos.get(i);
			if(ObjTelefono.getEstado().equals("C")) {
				resultado+="\nNúmero: "+ObjTelefono.getNumero()+", Tipo: "+ObjTelefono.getTipo();
			}
		}
		System.out.println(resultado);
	}
	public ArrayList<Telefono> recuperarIncorrectos() {
		Telefono ObjTelefono;
		ArrayList<Telefono> newListTelef = new ArrayList<Telefono>();
		String resultado = "Teléfonos con estado C:";
		for (int i = 0; i < listTelefonos.size(); i++) {
			ObjTelefono = listTelefonos.get(i);
			if(ObjTelefono.getEstado().equals("E")) {
				newListTelef.add(ObjTelefono);
			}
		}
		return newListTelef;
	}
}
