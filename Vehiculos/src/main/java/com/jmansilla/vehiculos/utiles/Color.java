package com.jmansilla.vehiculos.utiles;

import java.util.Optional;
import java.util.stream.Stream;

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
	
	public static Color getByCodigo(int codigo) {
		Optional<Color> optionalColor = Stream.of(Color.values()).filter(e -> e.getCodigo() == codigo)
			.findFirst();
		
		if (optionalColor.isPresent()) {
			return optionalColor.get();
		} else {
			return null;
		}
		
	}
	
}
