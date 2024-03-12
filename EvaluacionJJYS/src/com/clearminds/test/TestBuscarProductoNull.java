package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		 
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod.getNombre());
		
		/*El problema del nullPoint es en la variable prod ya que existen 
		 * las celdas de las maquinas pero sin productos, por lo que al buscar 
		 * el producto en la celda no lo encuentra y retorna null, por lo que despues en la linea 15
		 * se quiere acceder a ver el nombre del producto no se puede por que el resultado de la busqueda fue null
		 * 
		 * La variable prod se encuentra el error
		 * */
		
		
	}
}
