package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto objProducto = new Producto(456,"Jabon de manos");
		objProducto.setDescripcion("Producto para la limpieza de manos");
		objProducto.setPeso(2.3);
		
		//Mostrar valores en pantalla
		System.out.println("*************\nPRODUCTO\n*************"
				+ "\nCodigo de Producto: "+objProducto.getCodigo()
				+ "\nNombre Producto: "+objProducto.getNombre()
				+ "\nDescripcion del producto: "+objProducto.getDescripcion()
				+ "\nPeso del Producto: "+objProducto.getPeso());
	}
}
