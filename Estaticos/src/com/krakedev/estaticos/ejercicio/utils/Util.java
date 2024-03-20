package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int numero) {
		String valor = "0"+numero;
		return valor;
	}
	public static String formatearDia(int numero) {
		String valor = "";
		if (numero==0) {
			valor ="Lunes";
		}else if(numero==1) {
			valor ="Martes";
		}else if(numero==2) {
			valor ="Miercoles";
		}else if(numero==3) {
			valor ="Jueves";
		}else if(numero==4) {
			valor ="Viernes";
		}else if(numero==5) {
			valor ="Sabado";
		}else if(numero==6) {
			valor ="Domingo";
		}
		return valor;
	}
}
