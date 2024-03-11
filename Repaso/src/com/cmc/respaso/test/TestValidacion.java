package com.cmc.respaso.test;

import com.cmc.respaso.entidades.Validacion;

public class TestValidacion {
	public static void main(String[] args) {
		Validacion val = new Validacion();
		boolean resultado = val.validarMonto(1);
		System.out.println(resultado);
	}
}
