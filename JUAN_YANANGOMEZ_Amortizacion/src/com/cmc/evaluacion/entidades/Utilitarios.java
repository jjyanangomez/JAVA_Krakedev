package com.cmc.evaluacion.entidades;

public class Utilitarios {
	
	public double redondear(double valor) {
		double redondeo=0.0;
		redondeo = Math.round(valor * 100.0) / 100.0;
		return redondeo;
	}
}
