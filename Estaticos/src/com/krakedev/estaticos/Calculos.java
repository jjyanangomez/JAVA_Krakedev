package com.krakedev.estaticos;

public class Calculos {
	//Iva constante
	//final hace que el valor no se puede cambiar
	private final double IVA = 12;
	
	public double calucularIVA(double monto) {
		return monto*IVA/100;
	}
}
