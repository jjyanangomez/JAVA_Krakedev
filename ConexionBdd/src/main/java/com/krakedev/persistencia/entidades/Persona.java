package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;
	private EstadoCivil estado_civil;
	private int numero_hijos;
	private double estatura;
	private BigDecimal cantidad_ahorrada;
	private Date Fecha_nacimiento;
	private Date hora_nacimiento;
	
	public Persona() {

	}
	public Persona(String cedula, String nombre, String apellido, EstadoCivil estado_civil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estado_civil = estado_civil;
	}
	public Persona(String cedula, String nombre, String apellido, EstadoCivil estado_civil, int numero_hijos,
			double estatura, BigDecimal cantidad_ahorrada, Date fecha_nacimiento, Date hora_nacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estado_civil = estado_civil;
		this.numero_hijos = numero_hijos;
		this.estatura = estatura;
		this.cantidad_ahorrada = cantidad_ahorrada;
		Fecha_nacimiento = fecha_nacimiento;
		this.hora_nacimiento = hora_nacimiento;
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
	public EstadoCivil getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(EstadoCivil estado_civil) {
		this.estado_civil = estado_civil;
	}
	public int getNumero_hijos() {
		return numero_hijos;
	}
	public void setNumero_hijos(int numero_hijos) {
		this.numero_hijos = numero_hijos;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public BigDecimal getCantidad_ahorrada() {
		return cantidad_ahorrada;
	}
	public void setCantidad_ahorrada(BigDecimal cantidad_ahorrada) {
		this.cantidad_ahorrada = cantidad_ahorrada;
	}
	public Date getFecha_nacimiento() {
		return Fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		Fecha_nacimiento = fecha_nacimiento;
	}
	public Date getHora_nacimiento() {
		return hora_nacimiento;
	}
	public void setHora_nacimiento(Date hora_nacimiento) {
		this.hora_nacimiento = hora_nacimiento;
	}
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estado_civil="
				+ estado_civil + ", numero_hijos=" + numero_hijos + ", estatura=" + estatura + ", cantidad_ahorrada="
				+ cantidad_ahorrada + ", Fecha_nacimiento=" + Fecha_nacimiento + ", hora_nacimiento=" + hora_nacimiento
				+ "]";
	}
	
	
}
