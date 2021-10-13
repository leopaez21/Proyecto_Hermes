package com.hermes.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idproducto;
	private String codigo;
	private String nombre;
	private String descricion;
	private Double costo;
	private Boolean habilitado;
	private Integer idunidaddemedida;
	
	@ManyToOne()
	@JoinColumn(name="idcategoria")
	private Categoria categoria;

	public Integer getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescricion() {
		return descricion;
	}

	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}

	public Integer getIdunidaddemedida() {
		return idunidaddemedida;
	}

	public void setIdunidaddemedida(Integer idunidaddemedida) {
		this.idunidaddemedida = idunidaddemedida;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto [idproducto=" + idproducto + ", codigo=" + codigo + ", nombre=" + nombre + ", descricion="
				+ descricion + ", costo=" + costo + ", habilitado=" + habilitado + ", idunidaddemedida="
				+ idunidaddemedida + ", categoria=" + categoria + ", getIdproducto()=" + getIdproducto()
				+ ", getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre() + ", getDescricion()="
				+ getDescricion() + ", getCosto()=" + getCosto() + ", getHabilitado()=" + getHabilitado()
				+ ", getIdunidaddemedida()=" + getIdunidaddemedida() + ", getCategoria()=" + getCategoria()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	
}
