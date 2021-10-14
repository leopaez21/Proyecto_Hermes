package com.hermes.api.entity;

import java.util.Date;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")

public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idusuario;
	private String usuario;
	private Integer identificacion;
	private String nombre;
	private String apellidos;
	private String mail;
	private String password;
	private Date fecha_creacion;
	private String estado;
	
	@ManyToOne()
	@JoinColumn(name="idroll")
	private Roles roles ;
	
	
	
	public Integer getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Integer getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", usuario=" + usuario + ", identificacion=" + identificacion
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", mail=" + mail + ", password=" + password
				+ ", fecha_creacion=" + fecha_creacion + ", estado=" + estado + ", roles=" + roles + ", getIdusuario()="
				+ getIdusuario() + ", getUsuario()=" + getUsuario() + ", getIdentificacion()=" + getIdentificacion()
				+ ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getMail()=" + getMail()
				+ ", getPassword()=" + getPassword() + ", getFecha_creacion()=" + getFecha_creacion() + ", getEstado()="
				+ getEstado() + ", getRoles()=" + getRoles() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	


	

	

}
