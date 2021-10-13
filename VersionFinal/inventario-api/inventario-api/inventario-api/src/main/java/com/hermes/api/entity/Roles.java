package com.hermes.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "roles")

public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_rol;
	private String nombre_rol;
	private String descripcion;

	@OneToMany(mappedBy = "roles", cascade = CascadeType.ALL, orphanRemoval = true)

	public Integer getId_rol() {
		return id_rol;
	}

	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre_rol() {
		return nombre_rol;
	}

	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Roles [id_rol=" + id_rol + ", nombre_rol=" + nombre_rol + ", descripcion=" + descripcion
				+ ", getId_rol()=" + getId_rol() + ", getNombre_rol()=" + getNombre_rol() + ", getDescripcion()="
				+ getDescripcion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
