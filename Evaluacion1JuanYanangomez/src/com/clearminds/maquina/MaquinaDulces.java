package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void agregarCelda(Celda c) {
		celdas.add(c);
	}
	
	public void mostrarConfiguracion() {
		Celda objCelda;
		int cont=0;
		for (int i = 0; i < celdas.size(); i++) {
			cont++;
			objCelda = celdas.get(i);
			System.out.println("Celda"+cont+": "+objCelda.getCodigo());
		}
	}
	
	public Celda buscarCelda(String codigo) {
		Celda objCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			if (codigo.equals(celdas.get(i).getCodigo())) {
				objCelda = celdas.get(i);
			}
		}
		return objCelda;
	}
	
	public void cargarProducto(Producto p, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(p, cantidad);
	}
	public void mostrarProductos() {
		Celda objCelda;
		for (int i = 0; i < celdas.size(); i++) {
			objCelda = celdas.get(i);
			if(objCelda.getProducto()!= null) {
				System.out.println("Celda: "+objCelda.getCodigo()+" Stock: "+objCelda.getStock()+" Producto: "+objCelda.getProducto().getCodigo()+" Precio: "+objCelda.getProducto().getPrecio());
			}else {
				System.out.println("Celda: "+objCelda.getCodigo()+" Stock: "+objCelda.getStock()+" Sin producto asignado");
			}
		}
		System.out.println("\nSaldo:"+saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		Producto objPro = null;
		for (int i = 0; i < celdas.size(); i++) {
			if (codigo.equals(celdas.get(i).getCodigo())) {
				objPro = celdas.get(i).getProducto();
			}
		}
		return objPro;
	}
	
	public double consultarPrecio(String codigo) {
		double precio = 0.0;
		for (int i = 0; i < celdas.size(); i++) {
			if (codigo.equals(celdas.get(i).getCodigo())) {
				precio = celdas.get(i).getProducto().getPrecio();
			}
		}
		return precio;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda objCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			if (celdas.get(i).getProducto()!=null) {
				if(codigoProducto.equals(celdas.get(i).getProducto().getCodigo())) {
					
				}
				objCelda = celdas.get(i);
			}
		}
		return objCelda;
	}
	public void incrementarProductos(String codigoProducto, int cantidad) {
	 	Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
	 	celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidad);
	}
	public void vender(String codigoCelda) {
		
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double valorProducto = celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = getSaldo()+valorProducto;
		mostrarProductos();
	}
	public double venderConCambio(String codigoCelda,double valorIngresado) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double valorProducto = celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = getSaldo()+valorProducto;
		return valorIngresado-valorProducto;
	}
}
