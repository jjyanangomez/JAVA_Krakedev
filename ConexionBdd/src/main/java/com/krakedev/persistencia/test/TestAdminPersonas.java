package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersonas {
	 public static void main(String[] args) {
		 EstadoCivil ec = new EstadoCivil("C","Casado");
		 Persona p = new Persona("1105348976","Julio","Jaramillo",ec);
		 
		 try {
			Date fechaNac = Convertidor.convertirFecha("1936/12/13");
			Date HoraNac = Convertidor.convertirHora("03:53:04");
			 p.setFecha_nacimiento(fechaNac);
			 p.setHora_nacimiento(HoraNac);
			 p.setCantidad_ahorrada(new BigDecimal(5000));
			 p.setNumero_hijos(50);
			 AdminPersona.insertar(p);
			 System.out.println("Persona insertada");
		} catch (Exception e) {
			
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		 
		
	}
}
