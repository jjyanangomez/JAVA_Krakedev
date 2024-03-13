package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Directorio {
	private ArrayList<Contacto> listContactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	
	public Directorio() {
		listContactos = new ArrayList<Contacto>();
		fechaModificacion=new Date();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
		
	}
	public ArrayList<Contacto> getListContactos() {
		return listContactos;
	}
	public void setListContactos(ArrayList<Contacto> listContactos) {
		this.listContactos = listContactos;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}
	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}
	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}
	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	public boolean agregarContacto(Contacto c){
		Contacto objContacto;
		if(listContactos.size()==0) {
			listContactos.add(c);
			return true;
		}else {
			for (int i = 0; i < listContactos.size(); i++) {
				objContacto = listContactos.get(i);
				if(objContacto.getCedula().equals(c.getCedula())) {
					return false;
				}else {
					listContactos.add(c);
					return true;
				}
			}
			return false;
		}
	}
	public Contacto buscarPorCedula(String cedula) {
		Contacto contactoEncontrado = null;
		for (int i = 0; i < listContactos.size(); i++) {
			if(cedula.equalsIgnoreCase(listContactos.get(i).getCedula())) {
				contactoEncontrado = listContactos.get(i);
			}
		}
		return contactoEncontrado;
	}
	
	public String consultarUltimaModificacion() {
		String Fecha;
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		Fecha = formateador.format(fechaModificacion);
		return Fecha;
	}
	
	public int contarPerdidos() {
		Contacto objContacto = null;
		int cont = 0;
		for (int i = 0; i < listContactos.size(); i++) {
			objContacto = listContactos.get(i);
			if(objContacto.getDireccion()==null) {
				cont++;
			}
		}
		return cont;
	}
	public int contarFijos() {
		Contacto objContacto = null;
		int cont = 0;
		ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
		for (int i = 0; i < listContactos.size(); i++) {
			objContacto = listContactos.get(i);
			telefonos = objContacto.getListTelefonos();
			if(telefonos.size()>0) {
				Telefono tel;
				for (int j = 0; j < telefonos.size(); j++) {
					tel = telefonos.get(j);
					if(tel.getTipo().equals("Convencional") && tel.getEstado().equals("C")) {
						cont++;
					}
				}
			}
		}
		return cont;
	}
	public void depurar() {
		for (int i = 0; i < listContactos.size(); i++) {
			Contacto contacto = listContactos.get(i);
			if (contacto.getDireccion() == null) {
				incorrectos.add(contacto);
				listContactos.remove(i);
				i--;
			} else {
				correctos.add(contacto);
				listContactos.remove(i);
				i--;
			}
		}
	}
	
}
