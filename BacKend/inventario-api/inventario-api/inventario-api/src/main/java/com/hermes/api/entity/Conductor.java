package com.hermes.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "conductores")
public class Conductor {
	@Id
	private int iddocumento;
	private String descripcion;
	private String nombrecorto;
	
	@OneToMany(mappedBy = "conductores", cascade = CascadeType.ALL, orphanRemoval = true)
	public int getIddocumento() {
		return iddocumento;
	}
	public void setIddocumento(int iddocumento) {
		this.iddocumento = iddocumento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombrecorto() {
		return nombrecorto;
	}
	public void setNombrecorto(String nombrecorto) {
		this.nombrecorto = nombrecorto;
	}
	@Override
	public String toString() {
		return "Conductor [iddocumento=" + iddocumento + ", descripcion=" + descripcion + ", nombrecorto=" + nombrecorto
				+ ", getIddocumento()=" + getIddocumento() + ", getDescripcion()=" + getDescripcion()
				+ ", getNombrecorto()=" + getNombrecorto() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
