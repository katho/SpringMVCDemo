package com.grupo4.pojo;

public class Usuario {

	private Integer idusuario;

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
