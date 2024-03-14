package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.entidades.Utilitarios;

public class CalculadoraAmortizacion {
	
	public static double calcularCuota(Prestamo pres) {
		double cuota = 0.0;
		cuota = (pres.getMonto()*0.01)/(1-(Math.pow(1+0.01, -pres.getPlazo())));
		return cuota;
	}

	public static void generarTabla(Prestamo pre) {
		Utilitarios u = new Utilitarios();
		double resulCuota = u.redondear(calcularCuota(pre));
		double interesPrestamo = pre.getInteres() / 12 / 100; 
		ArrayList<Cuota> coutas = new ArrayList<Cuota>();
		coutas = pre.getCuotas();
		for (int i = 0; i < pre.getPlazo(); i++) {
			Cuota cuota = new Cuota(i + 1);
			cuota.setCuota(resulCuota);
			coutas.add(cuota);
			if (i == 0) {
				pre.getCuotas().get(i).setInicio(pre.getMonto());
			}
			
		}
		for(int i = 0; i < coutas.size(); i++) {
			Cuota cuota=coutas.get(i);
			if (i < coutas.size() - 1) {
				calcularValoresCuota(interesPrestamo, cuota, coutas.get(i+1));
			} else {
				calcularValoresCuota(interesPrestamo, cuota, null);
			}
		}
		
	}
	
	public static void calcularValoresCuota(double interes, Cuota cuota, Cuota cuotaSiguiente) {
		double valorInteres=0.0, abonoCapital=0.0, saldo=0.0;
		valorInteres = (interes * cuota.getInicio());
		abonoCapital = cuota.getCuota()-valorInteres;
		saldo = cuota.getInicio()-abonoCapital;
		
		cuota.setInteres(valorInteres);
		cuota.setAbonoCapital(abonoCapital);
		cuota.setSaldo(saldo);
		if (cuotaSiguiente != null) {
			cuotaSiguiente.setInicio(saldo);
		} else {
			cuota.setAbonoCapital(abonoCapital+saldo);
			cuota.setCuota(cuota.getCuota()+saldo);
			cuota.setSaldo(0);
		}
	}
	
	public static void mostrarTabla(Prestamo pre) {
		System.out.println("Tabla de Amortización:");
        System.out.println("Numero | Cuota | Inicio | Interes | Abono capital | Saldo |");
        ArrayList<Cuota> listCuotas = new ArrayList<Cuota>();
        listCuotas = pre.getCuotas();
        
        for (Cuota cuota : listCuotas) {
	           cuota.mostrarPrestamo();
	        }
	}
}
