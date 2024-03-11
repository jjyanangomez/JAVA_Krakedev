package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {
	public static void main(String[] args) {
		Validador val = new Validador();
		val.validadEdad(18);
		val.validadEdad(10);
		val.validadEdad(20);
		val.validadEdad(16);
		val.validadEdad(-6);
		val.validadEdad(14);
	}
}
