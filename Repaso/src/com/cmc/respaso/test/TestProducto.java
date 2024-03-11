package com.cmc.respaso.test;

import com.cmc.respaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto producto = new Producto("Xbox ONE", 1000);
		//producto.setPrecio(-2200);
		System.out.println("Despues de cambiar precio");
		System.out.println("Nombre: "+producto.getNombre());
		System.out.println("Precio: "+producto.getPrecio());
	}
}
