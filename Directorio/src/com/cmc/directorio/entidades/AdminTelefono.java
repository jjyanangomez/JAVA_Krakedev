package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono cell) {
		if(cell.getOperadora() =="movi") {
			cell.setTieneWhatsapp(true);
		}
	}
	public int contarMovi(Telefono cell1, Telefono cell2,Telefono cell3) {
		// TODO Auto-generated method stub
		int contador = 0;
		if(cell1.getOperadora()=="movi") {
			contador++;
		}
		if(cell2.getOperadora()=="movi") {
			contador++;	
				}
		if(cell3.getOperadora()=="movi") {
			contador++;
		}
		return contador;
	}
	public int contarClaro(Telefono cell1, Telefono cell2,Telefono cell3, Telefono cell4) {
		// TODO Auto-generated method stub
		int contador = 0;
		if(cell1.getOperadora()=="claro") {
			contador++;
		}
		if(cell2.getOperadora()=="claro") {
			contador++;	
		}
		if(cell3.getOperadora()=="claro") {
			contador++;
		}
		if(cell4.getOperadora()=="claro") {
			contador++;
		}
		return contador;
	}
}
