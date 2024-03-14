package com.cmc.evaluacion.entidades;

public class Cuota {
	private int numero;
	private double cuota, capital, inicio, interes, abonoCapital, saldo;
	
	
	public Cuota(int numero) {
		this.numero = numero;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double inicio) {
		this.inicio = inicio;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public void mostrarPrestamo() {
		Utilitarios u = new Utilitarios();
		System.out.println(numero+"      | "+u.redondear(cuota)+" | "+u.redondear(inicio)+" | "+u.redondear(interes)+" | "+u.redondear(abonoCapital)+" | "+u.redondear(saldo));
	}
}
