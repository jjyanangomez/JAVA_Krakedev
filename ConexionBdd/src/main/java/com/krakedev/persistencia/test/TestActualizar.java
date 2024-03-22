package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {
	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "UNION LIBRE");
		Persona p = new Persona("1765834921", "Julio", "Pani", ec);

		try {
			Date fechaNac = Convertidor.convertirFecha("1936/12/13");
			Date HoraNac = Convertidor.convertirHora("05:00:04");
			p.setEstatura(1.71);
			p.setFecha_nacimiento(fechaNac);
			p.setHora_nacimiento(HoraNac);
			p.setCantidad_ahorrada(new BigDecimal(3000));
			p.setNumero_hijos(3);
			AdminPersona.actualizar(p);
			System.out.println("Persona actualizada: " + p.getNombre() + " " + p.getApellido());
		} catch (Exception e) {

			System.err.println("Error en el sistema: " + e.getMessage());
		}

	}
}
