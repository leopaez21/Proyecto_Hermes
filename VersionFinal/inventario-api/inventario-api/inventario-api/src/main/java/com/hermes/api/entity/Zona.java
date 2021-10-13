package com.hermes.api.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zonas")
public class Zona {
	@Id
	private Integer idzona;
	private String nombrezona;
	private Date fecha;
	
	public Integer getIdzona() {
		return idzona;
	}
	public void setIdzona(Integer idzona) {
		this.idzona = idzona;
	}
	public String getNombrezona() {
		return nombrezona;
	}
	public void setNombrezona(String nombrezona) {
		this.nombrezona = nombrezona;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "zona [idzona=" + idzona + ", nombrezona=" + nombrezona + ", fecha=" + fecha + ", getIdzona()="
				+ getIdzona() + ", getNombrezona()=" + getNombrezona() + ", getFecha()=" + getFecha() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
