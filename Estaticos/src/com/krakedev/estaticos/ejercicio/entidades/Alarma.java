package com.krakedev.estaticos.ejercicio.entidades;

import com.krakedev.estaticos.ejercicio.utils.Util;

public class Alarma {
	private int dia;
	private int hora;
	private int minuto;
	
	public Alarma(int entero, int hora, int minuto) {
		super();
		this.dia = entero;
		this.hora = hora;
		this.minuto = minuto;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int entero) {
		this.dia = entero;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	@Override
	public String toString() {
		return Util.formatearDia(dia) + ", " +Util.formatearHora(hora)+ ":" + minuto + "\n";
	}
	
	
	
}
