package com.clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;
	
	/*Contructores*/
	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
		this.saldo = 0.0;
	}
	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	/**Principios de encapsulamiento */
	public String getId() {
		return id;
	}	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Metodos
	public void imprimir() {
		System.out.println("********************\nCUENTA\n********************"
				+ "\nNúmero de cuenta: "+id+
				"\nTipo: "+tipo+
				"\nSaldo: USD "+saldo+
				"\n********************");
	}
	public void imprimirConMiEstilo() {
		System.out.println("********************\n-----CUENTA-----\n********************"
				+ "\nNúmero de cuenta: "+id+"\n---------------------"+
				"\nTipo: "+tipo+"\n---------------------"+
				"\nSaldo: $"+saldo+"\n---------------------");
	}
	
}
