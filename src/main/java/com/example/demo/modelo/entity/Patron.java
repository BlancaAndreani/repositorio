package com.example.demo.modelo.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="patron")
public class Patron {
	@Id 
	private int idPatron;
	private String nombrePat;
	private String apellidoPat;
	private int telefono;
	
	
	public Patron() {
		super();
	}


	public Patron(int idPatron, String nombrePat, String apellidoPat, int telefono) {
		super();
		this.idPatron = idPatron;
		this.nombrePat = nombrePat;
		this.apellidoPat = apellidoPat;
		this.telefono = telefono;
	}


	public int getIdPatron() {
		return idPatron;
	}


	public void setIdPatron(int idPatron) {
		this.idPatron = idPatron;
	}


	public String getNombrePat() {
		return nombrePat;
	}


	public void setNombrePat(String nombrePat) {
		this.nombrePat = nombrePat;
	}


	public String getApellidoPat() {
		return apellidoPat;
	}


	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Patron [idPatron=" + idPatron + ", nombrePat=" + nombrePat + ", apellidoPat=" + apellidoPat
				+ ", telefono=" + telefono + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellidoPat, idPatron, nombrePat, telefono);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patron other = (Patron) obj;
		return Objects.equals(apellidoPat, other.apellidoPat) && idPatron == other.idPatron
				&& Objects.equals(nombrePat, other.nombrePat) && telefono == other.telefono;
	}
	
	
}
