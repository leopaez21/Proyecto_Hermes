package com.hermes.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ubicacion")
public class Ubicacion {
	
	@Id
	private Integer idubicacion;
	private Integer idproducto;
	private Integer capacidad;
	private Integer cantidad;
	private Integer idzona;
	private Integer ubicalinea;
	private Integer ubicanivel;
	private Integer ubicacelda;

	public Integer getIdubicacion() {
		return idubicacion;
	}

	public void setIdubicacion(Integer idubicacion) {
		this.idubicacion = idubicacion;
	}

	public Integer getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getIdzona() {
		return idzona;
	}

	public void setIdzona(Integer idzona) {
		this.idzona = idzona;
	}

	public Integer getUbicalinea() {
		return ubicalinea;
	}

	public void setUbicalinea(Integer ubicalinea) {
		this.ubicalinea = ubicalinea;
	}

	public Integer getUbicanivel() {
		return ubicanivel;
	}

	public void setUbicanivel(Integer ubicanivel) {
		this.ubicanivel = ubicanivel;
	}

	public Integer getUbicacelda() {
		return ubicacelda;
	}

	public void setUbicacelda(Integer ubicacelda) {
		this.ubicacelda = ubicacelda;
	}

	@Override
	public String toString() {
		return "Ubicacion [idubicacion=" + idubicacion + ", idproducto=" + idproducto + ", capacidad=" + capacidad
				+ ", cantidad=" + cantidad + ", idzona=" + idzona + ", ubicalinea=" + ubicalinea + ", ubicanivel="
				+ ubicanivel + ", ubicacelda=" + ubicacelda + ", getIdubicacion()=" + getIdubicacion()
				+ ", getIdproducto()=" + getIdproducto() + ", getCapacidad()=" + getCapacidad() + ", getCantidad()="
				+ getCantidad() + ", getIdzona()=" + getIdzona() + ", getUbicalinea()=" + getUbicalinea()
				+ ", getUbicanivel()=" + getUbicanivel() + ", getUbicacelda()=" + getUbicacelda() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
