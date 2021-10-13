package com.hermes.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidaddemedidas")
public class Unidaddemedida {

	@Id
	private Integer idunidaddemedida;
	private String nombre;
	private String descripcion;
	public Integer getIdunidaddemedida() {
		return idunidaddemedida;
	}
	public void setIdunidaddemedida(Integer idunidaddemedida) {
		this.idunidaddemedida = idunidaddemedida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Unidaddemedidas [idunidaddemedida=" + idunidaddemedida + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", getIdunidaddemedida()=" + getIdunidaddemedida() + ", getNombre()=" + getNombre()
				+ ", getDescripcion()=" + getDescripcion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
