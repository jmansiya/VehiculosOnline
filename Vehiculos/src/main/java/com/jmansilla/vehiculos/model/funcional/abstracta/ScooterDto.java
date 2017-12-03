package com.jmansilla.vehiculos.model.funcional.abstracta;

import com.jmansilla.vehiculos.utiles.Color;

public abstract class ScooterDto extends AbstractDto{
	protected String modelo;
	protected Color color;
	protected int potencia;
	
	public ScooterDto(String modelo, Color color, int potencia) {
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
	
	public abstract String mostrarCaracteristicas();
}
