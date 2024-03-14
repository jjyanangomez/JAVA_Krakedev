package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	
	public static double calcularCuota(Prestamo pres) {
		double cuota = 0.0;
		cuota = (pres.getMonto()*0.01)/(1-(Math.pow(1+0.01, -12)));
		return cuota;
	}
}
