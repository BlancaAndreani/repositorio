package com.example.demo.modelo.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="socio")
public class Socio {
	@Id
	private int idSocio;
	private String nombre;
	private String apellidos;
	private int telefono;
	
	
	public Socio() {
		super();
	}
	public Socio(int idSocio, String nombre, String apellidos, int telefono) {
		super();
		this.idSocio = idSocio;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}
	public int getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Socio [idSocio=" + idSocio + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono="
				+ telefono + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, idSocio, nombre, telefono);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return Objects.equals(apellidos, other.apellidos) && idSocio == other.idSocio
				&& Objects.equals(nombre, other.nombre) && telefono == other.telefono;
	}
	
	
	

}
