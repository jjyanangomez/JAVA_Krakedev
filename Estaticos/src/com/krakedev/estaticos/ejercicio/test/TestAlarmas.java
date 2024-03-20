package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {
	public static void main(String[] args) {
		Alarma alarma1 = new Alarma(DiasSemana.LUNES, 9, 30);
		Alarma alarma2 = new Alarma(DiasSemana.DOMINGO, 9, 30);
		Alarma alarma3 = new Alarma(DiasSemana.MARTES, 9, 0);
		Alarma alarma4 = new Alarma(DiasSemana.VIERNES, 10, 45);
		Alarma alarma5 = new Alarma(DiasSemana.LUNES, 7, 30);
		AdminAlarmas aa = new AdminAlarmas();
		aa.agregarAlarma(alarma1);
		aa.agregarAlarma(alarma2);
		aa.agregarAlarma(alarma3);
		aa.agregarAlarma(alarma4);
		aa.agregarAlarma(alarma5);
		//Recuperar
		ArrayList<Alarma> alarmas = aa.getAlarmas();
		System.out.println(alarmas);
		
		/*for (int i = 0; i < alarmas.size(); i++) {
			System.out.println(alarmas.get(i).toString());
		}*/
	}
}
