package com.hermes.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tiposdocumento")
public class Tipodocumento {
    @Id
	private Integer iddocumento;
	private String descripcion;
	private String nombrecorto;
	
	@OneToMany(mappedBy = "tiposdocumento", cascade = CascadeType.ALL, orphanRemoval = true)
	public Integer getIddocumento() {
		return iddocumento;
	}
	public void setIddocumento(Integer iddocumento) {
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
		return "Tipodocumento [iddocumento=" + iddocumento + ", descripcion=" + descripcion + ", nombrecorto="
				+ nombrecorto + ", getIddocumento()=" + getIddocumento() + ", getDescripcion()=" + getDescripcion()
				+ ", getNombrecorto()=" + getNombrecorto() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
