package com.krakedev.test;
import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu = new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		resultadoSuma = calcu.sumar(1, 3);
		resultadoResta= calcu.resta(10, 3);
		System.out.println("Resultado SUMA:"+resultadoSuma);
		System.out.println("Resultado RESTA:"+resultadoResta);
		//Llamar a multiplicar
		double resultadoMultiplicacion;
		resultadoMultiplicacion = calcu.multiplicar(1, 3);
		System.out.println("Resultado MULTIPLICAR:"+resultadoMultiplicacion);
		//llamar a dividir
		double resultadoDividir;
		resultadoDividir = calcu.dividir(3, 3);
		System.out.println("Resultado DIVIDIR:"+resultadoDividir);
		//llamar a promediar
		double resultadoPromediar;
		resultadoPromediar = calcu.promediar(10, 9, 8);
		System.out.println("Resultado PROMEDIO:"+resultadoPromediar);
		//llamar a mostrarResultado
		calcu.mostrarResultados();
	}

}
