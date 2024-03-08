package com.krakedev;

public class Calculadora {
	public int sumar(int valor1, int valor2) {
		int resultado = valor1+valor2;
		return resultado;
	}
	public int resta(int valor1, int valor2) {
		int resultado = valor1-valor2;
		return resultado;
	}
	//Metodos extra
	public double multiplicar(double valor1, double valor2) {
		double resultado = valor1*valor2;
		return resultado;
	}
	public double dividir(double dividendo, double divisor) {
		double resultado = dividendo/divisor;
		return resultado;
	}
	public double promediar(double valor1, double valor2, double valor3) {
		double resultado = (valor1+valor2+valor3)/3;
		return resultado;
	}
	public void mostrarResultados() {
		System.out.println("Ahorita no joven, Sali a almorzar. Regreso en 15 minutos");
	}
}
