package com.cmc.respaso.entidades;

public class Validacion {
	public boolean validarMonto(int Monto) {
		if(Monto>0) {
			return true;
		}else {
			return false;
		}
	}
}
