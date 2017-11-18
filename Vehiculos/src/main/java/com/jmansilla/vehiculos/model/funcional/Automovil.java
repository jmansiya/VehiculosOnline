package com.jmansilla.vehiculos.model.funcional;

import com.jmansilla.vehiculos.utiles.Color;

public abstract class Automovil {
	protected String modelo;
	protected Color color;
	protected int potencia;
	protected double espacio;
	
	public Automovil(String modelo, Color color, int potencia, double espacio) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
		this.espacio = espacio;
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

	public double getEspacio() {
		return espacio;
	}

	public void setEspacio(double espacio) {
		this.espacio = espacio;
	}
	
	public abstract String mostrarCaracteristicas();
}
