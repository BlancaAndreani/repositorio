package com.example.demo.modelo.entity;

import java.util.Objects;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
@Entity
@Table(name="barco")
@CrossOrigin(origins = "*")
public class Barco {
	@Id
	@Column(name="id_barco")
	private int idBarco;
	
	@Column(name="id_socio")

	private int idSocio;
	@Column(name="num_matricula")
	private	String matricula;
	@Column(name="nombre_barco")
	private String nombreBarco;
	@Column(name="num_amarre")
	private int numeroAmarre;

	public int getIdBarco() {
		return idBarco;
	}
	public Barco() {
		super();
	}
	public Barco(int idBarco, int idSocio, String matricula, String nombreBarco, int numeroAmarre, double cuota) {
		super();
		this.idBarco = idBarco;
		this.idSocio = idSocio;
		this.matricula = matricula;
		this.nombreBarco = nombreBarco;
		this.numeroAmarre = numeroAmarre;
	
	}
	public int getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombreBarco() {
		return nombreBarco;
	}
	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}
	public int getNumeroAmarre() {
		return numeroAmarre;
	}
	public void setNumeroAmarre(int numeroAmarre) {
		this.numeroAmarre = numeroAmarre;
	}
	

	public void setIdBarco(int idBarco) {
		this.idBarco = idBarco;
	}
	@Override
	public int hashCode() {
		return Objects.hash( idBarco, idSocio, matricula, nombreBarco, numeroAmarre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barco other = (Barco) obj;
		return  idBarco == other.idBarco
				&& idSocio == other.idSocio && Objects.equals(matricula, other.matricula)
				&& Objects.equals(nombreBarco, other.nombreBarco) && numeroAmarre == other.numeroAmarre;
	}
	@Override
	public String toString() {
		return "Barco [idBarco=" + idBarco + ", idSocio=" + idSocio + ", matricula=" + matricula + ", nombreBarco="
				+ nombreBarco + ", numeroAmarre=" + numeroAmarre + ", ]";
	}

	
}
