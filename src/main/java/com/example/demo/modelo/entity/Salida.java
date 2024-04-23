package com.example.demo.modelo.entity;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
@Entity
@Table(name="salida")
public class Salida {
	@Id
	@Column(name="id_salida")
	private int idSalida;
	@JoinColumn(name="id_patron")
	private int idPatron;
	@Column(name="id_barco")
	private int idBarco;
	@Column(name="fecha_hora")
	private Date fechaHora;
	
	private String destino;
	
	public Salida() {
		super();
	}

	public Salida(int idSalida, int idPatron, int idBarco, Date fechaHora, String destino) {
		super();
		this.idSalida = idSalida;
		this.idPatron = idPatron;
		this.idBarco = idBarco;
		this.fechaHora = fechaHora;
		this.destino = destino;
	}

	public int getIdSalida() {
		return idSalida;
	}

	public void setIdSalida(int idSalida) {
		this.idSalida = idSalida;
	}

	public int getIdPatron() {
		return idPatron;
	}

	public void setIdPatron(int idPatron) {
		this.idPatron = idPatron;
	}

	public int getIdBarco() {
		return idBarco;
	}

	public void setIdBarco(int idBarco) {
		this.idBarco = idBarco;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Salida [idSalida=" + idSalida + ", idPatron=" + idPatron + ", idBarco=" + idBarco + ", fechaHora="
				+ fechaHora + ", destino=" + destino + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(destino, fechaHora, idBarco, idPatron, idSalida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salida other = (Salida) obj;
		return Objects.equals(destino, other.destino) && Objects.equals(fechaHora, other.fechaHora)
				&& idBarco == other.idBarco && idPatron == other.idPatron && idSalida == other.idSalida;
	}
	
	
	
}
