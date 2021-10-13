package com.hermes.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ciudades")
public class Ciudad {
	@Id
	private Integer idciudad;
	private String nombreciudad;
	
	@ManyToOne()
	@JoinColumn(name="codigodep")
	private Departamento departamento ;
	
	public Integer getIdciudad() {
		return idciudad;
	}
	public void setIdciudad(Integer idciudad) {
		this.idciudad = idciudad;
	}
	public String getNombreciudad() {
		return nombreciudad;
	}
	public void setNombreciudad(String nombreciudad) {
		this.nombreciudad = nombreciudad;
	}
	public Departamento getDepartamentos() {
		return departamento;
	}
	public void setDepartamentos(Departamento departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Ciudades [idciudad=" + idciudad + ", nombreciudad=" + nombreciudad + ", departamentos=" + departamento
				+ ", getIdciudad()=" + getIdciudad() + ", getNombreciudad()=" + getNombreciudad()
				+ ", getDepartamentos()=" + getDepartamentos() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
