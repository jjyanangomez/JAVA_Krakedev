package com.cmc.respaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("Productos actuales "+getProductosActuales()+
				"\nProductos devueltos "+ getProductosDevueltos()+
				"\nProductos vendidos "+ getProductosVendidos());
		
	}

	public void vender(int productoVendidos) {
		setProductosActuales(getProductosActuales()-productoVendidos);
		setProductosVendidos(getProductosVendidos()+productoVendidos);
	}
	public void devolver(int productoVendidos) {
		setProductosVendidos(getProductosVendidos()-productoVendidos);
		setProductosActuales(getProductosActuales()+productoVendidos);

		setProductosDevueltos(getProductosDevueltos()+productoVendidos);
	}
}
