package com.krakedev;

public class Productos {
	private String Nombre;
	private String descripcion;
	private double precio;
	private int stockActual;
	
	/**    Constructor con parametros      **/
	public Productos(String nombre, String descripcion, double precio, int stockActual) {
		Nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stockActual = stockActual;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStockActual() {
		return stockActual;
	}
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
	
	
}
