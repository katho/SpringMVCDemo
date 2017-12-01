package com.grupo4.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idusuario;
	
	@Id
	private String nombre_usuario;

	public Usuario() {

	}

	public Usuario(Integer idusuario, String nombre_usuario) {

		this.idusuario = idusuario;
		this.nombre_usuario = nombre_usuario;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", nombre_usuario=" + nombre_usuario + "]";
	}
	
	

}
