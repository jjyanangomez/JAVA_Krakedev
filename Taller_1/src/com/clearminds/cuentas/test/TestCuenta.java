package com.clearminds.cuentas.test;

import com.clearminds.cuentas.Cuenta;

public class TestCuenta {
	public static void main(String[] args) {
		//Creo el objeto y lo referencio con cuenta1
		Cuenta cuenta1 = new Cuenta("03476");
		//coloco un valor de saldo en la cuenta1
		cuenta1.setSaldo(675);
		//Creo el objeto y lo referencio con cuenta2
		Cuenta cuenta2 = new Cuenta("03476","C",98);
		//Creo el objeto y lo referencio con cuenta3
		Cuenta cuenta3 = new Cuenta("03476");
		//MOdifico el tipo de cuenta
		cuenta3.setTipo("C");
		//Imprimo cuenta 1, cuenta 2 y cuenta 3
		System.out.println("------Valores Iniciales-----");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("------Valores modificados-----");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		//Imprimir
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
	
		//Crear la cuenta 4
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setSaldo(10);
		
		//Crear la cuenta 5
		Cuenta cuenta5 = new Cuenta("0557","C",10);
		
		//Crear la cuenta 6
		Cuenta cuenta6 = new Cuenta("0666");
		cuenta2.setTipo("A");
		System.out.println("-\n-\n------Valores con mi estilo-----");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}
}
