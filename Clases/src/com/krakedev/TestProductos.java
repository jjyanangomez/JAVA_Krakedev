package com.krakedev;

public class TestProductos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creacion de variables de tipo producto e instancia de la clase
		Productos productoA = new Productos();
		Productos productoB = new Productos();
		Productos productoC = new Productos();
		//Atributos del producto A
		productoA.Nombre = "Protector Solar Eucerin";
		productoA.descripcion="Para protejer la piel";
		productoA.precio=29.83;
		productoA.stockActual=10;
		//Atributos del producto B
		productoB.Nombre = "LemonFlu";
		productoB.descripcion="LemonFlu caja de sobres (6) de 10 gr.";
		productoB.precio=2.8;
		productoB.stockActual=6;
		//Atributos del producto C
		productoC.Nombre = "Jarabe para la toc";
		productoC.descripcion="jarabe sabor a mora";
		productoC.precio=9.4;
		productoC.stockActual=8;
		//Presentar los atributos en consola
		System.out.println("-------------- Producto A ---------------");
		System.out.println("Nombre:"+productoA.Nombre);
		System.out.println("Descripción:"+productoA.descripcion);
		System.out.println("precio: $"+productoA.precio);
		System.out.println("Stock:"+productoA.stockActual);
		System.out.println("-------------- Producto B ---------------");;
		System.out.println("Nombre:"+productoB.Nombre);
		System.out.println("Descripción:"+productoB.descripcion);
		System.out.println("precio: $"+productoB.precio);
		System.out.println("Stock:"+productoB.stockActual);
		System.out.println("-------------- Producto C ---------------");
		System.out.println("Nombre:"+productoC.Nombre);
		System.out.println("Descripción:"+productoC.descripcion);
		System.out.println("precio: $"+productoC.precio);
		System.out.println("Stock:"+productoC.stockActual);
	}
}
