package com.krakedev;

public class TestProductos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creacion de variables de tipo producto e instancia de la clase
		/******* Se invoca al constructor con parametros en donde se 
		 * 		ingresa los parametros para inicializar el objeto*******/
		Productos productoA = new Productos("Protector Solar Eucerin","Para protejer la piel",29.83,10);
		Productos productoB = new Productos("LemonFlu","LemonFlu caja de sobres (6) de 10 gr.",2.8,6);
		Productos productoC = new Productos("Jarabe para la tos","jarabe sabor a mora",9.4,8);
		//Atributos del producto A
		/*productoA.setNombre("Protector Solar Eucerin");
		productoA.setDescripcion("Para protejer la piel");
		productoA.setPrecio(29.83);;
		productoA.setStockActual(10);;*/
		//Atributos del producto B
		/*productoB.setNombre("LemonFlu");
		productoB.setDescripcion("LemonFlu caja de sobres (6) de 10 gr.");
		productoB.setPrecio(2.8);
		productoB.setStockActual(6);*/
		//Atributos del producto C
		/*productoC.setNombre("Jarabe para la tos");
		productoC.setDescripcion("jarabe sabor a mora");
		productoC.setPrecio(9.4);
		productoC.setStockActual(8);*/
		//Presentar los atributos en consola
		System.out.println("-------------- Producto A ---------------");
		System.out.println("Nombre:"+productoA.getNombre());
		System.out.println("Descripción:"+productoA.getDescripcion());
		System.out.println("precio: $"+productoA.getPrecio());
		System.out.println("Stock:"+productoA.getStockActual());
		System.out.println("-------------- Producto B ---------------");;
		System.out.println("Nombre:"+productoB.getNombre());
		System.out.println("Descripción:"+productoB.getDescripcion());
		System.out.println("precio: $"+productoB.getPrecio());
		System.out.println("Stock:"+productoB.getStockActual());
		System.out.println("-------------- Producto C ---------------");
		System.out.println("Nombre:"+productoC.getNombre());
		System.out.println("Descripción:"+productoC.getDescripcion());
		System.out.println("precio: $"+productoC.getPrecio());
		System.out.println("Stock:"+productoC.getStockActual());
	}
}
