package com.example.demo.modelo.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="amarre")

public class Amarre {
	@Id
	private int idAmarre;
	private double cuota;
	public Amarre() {
		super();
	}
	public Amarre(int idAmarre, double cuota) {
		super();
		this.idAmarre = idAmarre;
		this.cuota = cuota;
	}
	public int getIdAmarre() {
		return idAmarre;
	}
	public void setIdAmarre(int idAmarre) {
		this.idAmarre = idAmarre;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	@Override
	public String toString() {
		return "Amarre [idAmarre=" + idAmarre + ", cuota=" + cuota + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cuota, idAmarre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Amarre other = (Amarre) obj;
		return Double.doubleToLongBits(cuota) == Double.doubleToLongBits(other.cuota) && idAmarre == other.idAmarre;
	}
	
	

}
