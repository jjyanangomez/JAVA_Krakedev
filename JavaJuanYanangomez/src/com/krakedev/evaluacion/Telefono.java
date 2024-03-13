package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	
	
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		this.estado="E";
		if(numero!=null && tipo!=null) {
			if(tipo.equals("Movil") || tipo.equals("Convencional")) {
				if (tipo.equals("Movil") && numero.length()==10) {
					this.estado="C";
				}else if(tipo.equals("Convencional") && numero.length()==7) {
					this.estado="C";
				}
			}
		}
	}
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	
	
}
