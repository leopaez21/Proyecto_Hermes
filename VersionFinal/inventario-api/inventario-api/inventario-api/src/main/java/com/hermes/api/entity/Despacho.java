package com.hermes.api.entity;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "despachos")

public class Despacho {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddespacho;
	@JoinColumn(name = "idremision")
	@OneToOne(fetch = FetchType.LAZY)
	private Remision remision ;
	private String direccion;
	@ManyToOne()
	@JoinColumn(name="idciudad")
	private Ciudad ciudad;
	private String placavehiculo;
	@ManyToOne()
	@JoinColumn(name="conductor")
	private Conductor conductor;
	private Boolean entregado;
	public Integer getIddespacho() {
		return iddespacho;
	}
	public void setIddespacho(Integer iddespacho) {
		this.iddespacho = iddespacho;
	}
	public Remision getRemision() {
		return remision;
	}
	public void setRemision(Remision remision) {
		this.remision = remision;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public String getPlacavehiculo() {
		return placavehiculo;
	}
	public void setPlacavehiculo(String placavehiculo) {
		this.placavehiculo = placavehiculo;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	public Boolean getEntregado() {
		return entregado;
	}
	public void setEntregado(Boolean entregado) {
		this.entregado = entregado;
	}
	@Override
	public String toString() {
		return "Despacho [iddespacho=" + iddespacho + ", remision=" + remision + ", direccion=" + direccion
				+ ", ciudad=" + ciudad + ", placavehiculo=" + placavehiculo + ", conductor=" + conductor
				+ ", entregado=" + entregado + ", getIddespacho()=" + getIddespacho() + ", getRemision()="
				+ getRemision() + ", getDireccion()=" + getDireccion() + ", getCiudad()=" + getCiudad()
				+ ", getPlacavehiculo()=" + getPlacavehiculo() + ", getConductor()=" + getConductor()
				+ ", getEntregado()=" + getEntregado() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	
	

	
}
