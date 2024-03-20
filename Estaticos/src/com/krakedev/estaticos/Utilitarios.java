package com.krakedev.estaticos;

public class Utilitarios {
	public static boolean validarRango(int rango) {
		if (rango>=0 && rango<=10) {
			return true;
		}else {
			return false;
		}
	}
}
