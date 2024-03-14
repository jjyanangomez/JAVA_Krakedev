package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> listPrestamos;
	private ArrayList<Cliente> listClientes;
	
	
	public Banco() {
		listClientes = new ArrayList<Cliente>();
		listPrestamos = new ArrayList<Prestamo>();
	}
	
	public ArrayList<Prestamo> getListPrestamos() {
		return listPrestamos;
	}
	public void setListPrestamos(ArrayList<Prestamo> listPrestamos) {
		this.listPrestamos = listPrestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return listClientes;
	}
	public void setListClientes(ArrayList<Cliente> listClientes) {
		this.listClientes = listClientes;
	}
	
	public Cliente buscarCliente(String Cedula) {
		Cliente c = null;
		Cliente clienteEncontrado = null;
		for (int i = 0; i < listClientes.size(); i++) {
			c = listClientes.get(i);
			if(c.getCedula().equals(Cedula)) {
				clienteEncontrado = c;
			}
		}
		return clienteEncontrado;
	}
	
	public void registrarCliente(Cliente c) {
		boolean existe=false;
		for (Cliente cliente : listClientes) {
			
			if(cliente.getCedula().equals(c.getCedula())) {
				System.out.println("El cliente ya existe "+cliente.getCedula());
				existe=true;
			}
		}
		if (!existe) {
			listClientes.add(c);
		}
	}
	
	public void asignarPrestamo(String cedula, Prestamo pre) {
		Cliente clienteEcontrado= buscarCliente(cedula);
		if(clienteEcontrado==null) {
			System.out.println("No es cliente del banco");
		}else {
			clienteEcontrado.agregarPrestamo(pre);
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> prestamos= null;
		Cliente cl = buscarCliente(cedula);
		if(cl!= null) {
			if(cl.getPrestamos().size()>0 ||cl.getPrestamos()!=null) {
				prestamos=cl.getPrestamos();
			}else {
				System.out.println("El cliente no tiene prestamos");
			}
		}
		return prestamos;
	}
}
