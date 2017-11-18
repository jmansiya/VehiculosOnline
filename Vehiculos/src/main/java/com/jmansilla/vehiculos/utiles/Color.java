package com.jmansilla.vehiculos.utiles;

public enum Color {
	ROJO(1, "rojo", 100.0),
	BLANCO(2, "blanco roto", 0),
	NEGRO(3, "negro", 250.0);
	
	
	private Color(int codigo, String referencia, double precio) {
		this.codigo = codigo;
		this.referencia = referencia;
		this.precio = precio;
	}
	
	private int codigo;
	private String referencia;
	private double precio;
	
	public int getCodigo() {
		return codigo;
	}
	public String getReferencia() {
		return referencia;
	}
	public double getPrecio() {
		return precio;
	}
	
	
}
