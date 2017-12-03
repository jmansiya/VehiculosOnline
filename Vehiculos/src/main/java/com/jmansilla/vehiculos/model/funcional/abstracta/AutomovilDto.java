package com.jmansilla.vehiculos.model.funcional.abstracta;

import com.jmansilla.vehiculos.utiles.Color;
import com.jmansilla.vehiculos.utiles.TiposAutomoviles;

public abstract class AutomovilDto extends AbstractDto {
	protected String modelo;
	protected Color color;
	protected int potencia;
	protected double espacio;
	protected TiposAutomoviles tipo;
	
	public AutomovilDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AutomovilDto(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public AutomovilDto(String modelo, Color color, int potencia, double espacio, TiposAutomoviles tipo) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
		this.espacio = espacio;
		this.tipo = tipo;
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

	public TiposAutomoviles getTipo() {
		return tipo;
	}

	public void setTipo(TiposAutomoviles tipo) {
		this.tipo = tipo;
	}
}
