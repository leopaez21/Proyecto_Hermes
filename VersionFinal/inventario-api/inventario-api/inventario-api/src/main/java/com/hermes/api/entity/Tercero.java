package com.hermes.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "terceros")
public class Tercero {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idtercero;
	private String nombretercero;
	@ManyToOne()
	@JoinColumn(name="iddocumento")
	private Tipodocumento  tipodocumento;
	private String identificacion;
	private String telefono;
	private String email;
	@ManyToOne()
	@JoinColumn(name="idciudades")
	private Ciudad ciudad;
	private String direccion;
	
	@OneToMany(mappedBy = "terceros", cascade = CascadeType.ALL, orphanRemoval = true)
	public Integer getIdtercero() {
		return idtercero;
	}
	public void setIdtercero(Integer idtercero) {
		this.idtercero = idtercero;
	}
	public String getNombretercero() {
		return nombretercero;
	}
	public void setNombretercero(String nombretercero) {
		this.nombretercero = nombretercero;
	}
	public Tipodocumento getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(Tipodocumento tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Tercero [idtercero=" + idtercero + ", nombretercero=" + nombretercero + ", tipodocumento="
				+ tipodocumento + ", identificacion=" + identificacion + ", telefono=" + telefono + ", email=" + email
				+ ", ciudad=" + ciudad + ", direccion=" + direccion + ", getIdtercero()=" + getIdtercero()
				+ ", getNombretercero()=" + getNombretercero() + ", getTipodocumento()=" + getTipodocumento()
				+ ", getIdentificacion()=" + getIdentificacion() + ", getTelefono()=" + getTelefono() + ", getEmail()="
				+ getEmail() + ", getCiudad()=" + getCiudad() + ", getDireccion()=" + getDireccion() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	
	
	
	



}
