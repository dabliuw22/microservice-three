package com.leysoft.app.model;

import java.util.List;

public class Saludo {
	
	private String nombre;
	
	private List<Object> links;

	public Saludo() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Object> getLinks() {
		return links;
	}

	public void setLinks(List<Object> links) {
		this.links = links;
	}
}