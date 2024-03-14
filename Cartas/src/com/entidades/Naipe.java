package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	private Palos palos = new Palos();
	
	public Naipe() {
		numerosPosibles = new ArrayList<>();
		cartas = new ArrayList<>();
		CargarNumeros();
		CargarCartas(palos.getCorazonNegro());
		CargarCartas(palos.getCorazonRojo());
		CargarCartas(palos.getDiamante());
		CargarCartas(palos.getTrebol());
	}
	
	
	public void CargarNumeros() {
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));
	}
	
	public void CargarCartas(String Palo) {
		Numero objNumero = null;
		for (int i = 0; i < numerosPosibles.size(); i++) {
			objNumero = numerosPosibles.get(i);
			cartas.add(new Carta(objNumero, Palo));
		}
	}
	
	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		Random r = null;
		for (int i = 1; i <= 100; i++) {
			int posicion = r.obtenerPosicion();
			if (cartas.get(posicion).getEstado().equals("N")) {
				auxiliar.add(cartas.get(posicion));
				cartas.get(posicion).setEstado("C");
			}
			
		}
		for (int i = 0; i <cartas.size(); i++) {
			if (cartas.get(i).getEstado().equals("N")) {
				auxiliar.add(cartas.get(i));
				cartas.get(i).setEstado("C");
			}
        }
		return auxiliar;
	}
}
