package com.cmc.respaso.test;

import com.cmc.respaso.entidades.Item;

public class TestItem {
	public static void main(String[] args) {
		Item i = new Item();
		i.setProductosActuales(20);
		System.out.println("************Valores iniciales***************");
		i.imprimir();
		System.out.println("------------------");

		System.out.println("*************Valores modificados*******************");
		i.vender(15);
		i.devolver(10);
		i.imprimir();
		System.out.println("*******************");

	}
}
