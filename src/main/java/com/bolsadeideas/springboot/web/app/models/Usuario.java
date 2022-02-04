package com.bolsadeideas.springboot.web.app.models;

public class Usuario {
	
	private String nombre;
	private String apellido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append("]");
		return builder.toString();
	}

}
