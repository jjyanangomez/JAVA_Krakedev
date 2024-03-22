package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Usuario {
	private String cedula;
	private String nombre;
	private String apellido;
	private Date fecha_creacion;
	private int horas_trabajadas;
	private BigDecimal saldo;
	
	public Usuario() {

	}
	
	public Usuario(String cedula, String nombre, String apellido, Date fecha_creacion, int horas_trabajadas,
			BigDecimal saldo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_creacion = fecha_creacion;
		this.horas_trabajadas = horas_trabajadas;
		this.saldo = saldo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public int getHoras_trabajadas() {
		return horas_trabajadas;
	}

	public void setHoras_trabajadas(int horas_trabajadas) {
		this.horas_trabajadas = horas_trabajadas;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_creacion="
				+ fecha_creacion + ", horas_trabajadas=" + horas_trabajadas + ", saldo=" + saldo + "]";
	}
	
	
}
