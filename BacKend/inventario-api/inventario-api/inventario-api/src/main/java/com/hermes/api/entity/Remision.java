package com.hermes.api.entity;

import java.util.Date;

import javax.persistence.CascadeType;
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
@Table(name = "remisiones")

public class Remision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idremision;
    @ManyToOne()
    @JoinColumn(name="idtercero")
    private Tercero tercero;
    private Date fecha;
    private Integer idproducto;
    private Integer cantidad;
    private Integer idubicacion;
    private Boolean entrada_salida;
    private Boolean despachado;
    
    @OneToOne(mappedBy = "remisiones", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    
	public Integer getIdremision() {
		return idremision;
	}
	public void setIdremision(Integer idremision) {
		this.idremision = idremision;
	}
	public Tercero getTercero() {
		return tercero;
	}
	public void setTercero(Tercero tercero) {
		this.tercero = tercero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getIdubicacion() {
		return idubicacion;
	}
	public void setIdubicacion(Integer idubicacion) {
		this.idubicacion = idubicacion;
	}
	public Boolean getEntrada_salida() {
		return entrada_salida;
	}
	public void setEntrada_salida(Boolean entrada_salida) {
		this.entrada_salida = entrada_salida;
	}
	public Boolean getDespachado() {
		return despachado;
	}
	public void setDespachado(Boolean despachado) {
		this.despachado = despachado;
	}
	@Override
	public String toString() {
		return "Remision [idremision=" + idremision + ", tercero=" + tercero + ", fecha=" + fecha + ", idproducto="
				+ idproducto + ", cantidad=" + cantidad + ", idubicacion=" + idubicacion + ", entrada_salida="
				+ entrada_salida + ", despachado=" + despachado + ", getIdremision()=" + getIdremision()
				+ ", getTercero()=" + getTercero() + ", getFecha()=" + getFecha() + ", getIdproducto()="
				+ getIdproducto() + ", getCantidad()=" + getCantidad() + ", getIdubicacion()=" + getIdubicacion()
				+ ", getEntrada_salida()=" + getEntrada_salida() + ", getDespachado()=" + getDespachado()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
 
	
    
    
    }

  
