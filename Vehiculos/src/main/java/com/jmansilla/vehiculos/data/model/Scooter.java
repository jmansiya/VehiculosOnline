package com.jmansilla.vehiculos.data.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.jmansilla.vehiculos.utiles.Color;

@Document
public class Scooter extends BaseEntity{
	private String modelo;
	private Color color;
	private int potencia;

	public Scooter() {
		super();
	}
	public Scooter(String modelo, Color color, int potencia) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}
