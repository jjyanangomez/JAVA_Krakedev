package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	public static final String FORMATO_FECHA="yyyy/MM/dd";
	public static final String FORMATO_HORA ="hh:mm:ss";
	private static final Logger LOGGER = LogManager.getLogger(Convertidor.class);
	public static Date convertirFecha(String fechastc) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
		Date fecha  = null;
		try {
			LOGGER.trace("Fecha entrante: "+fechastc);
			fecha = sdf.parse(fechastc);
			LOGGER.trace("Fecha Saliente: "+fecha);
		} catch (ParseException e) {
			LOGGER.error("La fecha no tiene el formato correcto", e);
			throw new Exception("La fecha no tiene el formato correcto"+fechastc);
		}
		return fecha;
	}
	
	public static Date convertirHora(String Horastc) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
		Date hora  = null;
		try {
			LOGGER.debug("Hora entrante: "+Horastc);
			hora = sdf.parse(Horastc);
			LOGGER.debug("Hora Saliente: "+hora);
		} catch (ParseException e) {
			LOGGER.error("La hora no tiene el formato correcto", e);
			throw new Exception("La hora no tiene el formato correcto"+Horastc);
		}
		return hora;
	}
}
