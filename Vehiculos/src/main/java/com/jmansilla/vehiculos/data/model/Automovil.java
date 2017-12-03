package com.jmansilla.vehiculos.data.model;

import com.jmansilla.vehiculos.utiles.TiposAutomoviles;
import org.springframework.data.mongodb.core.mapping.Document;

import com.jmansilla.vehiculos.utiles.Color;

@Document
public class Automovil extends BaseEntity{
	private String modelo;
	private int color;
	private int potencia;
	private double espacio;
	private String tipo;

	public Automovil() {
		super();
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
