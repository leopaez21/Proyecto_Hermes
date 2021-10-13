package com.hermes.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;


import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento {
	@Id
	private Integer codigodep;
	private String nombredep;
	@OneToMany(mappedBy = "departamentos", cascade = CascadeType.ALL, orphanRemoval = true)
	
   public Integer getCodigodep() {
		return codigodep;
	}
	public void setCodigodep(Integer codigodep) {
		this.codigodep = codigodep;
	}
	public String getNombredep() {
		return nombredep;
	}
	public void setNombredep(String nombredep) {
		this.nombredep = nombredep;
	}
	@Override
	public String toString() {
		return "Departamentos [codigodep=" + codigodep + ", nombredep=" + nombredep + ", getCodigodep()="
				+ getCodigodep() + ", getNombredep()=" + getNombredep() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
