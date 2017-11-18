package com.jmansilla.vehiculos.model.funcional;

import java.text.MessageFormat;

import com.jmansilla.vehiculos.utiles.Color;
import com.jmansilla.vehiculos.utiles.Mensajes;

public class AutomovilDiesel extends Automovil {
	
	public AutomovilDiesel(String modelo, Color color, int potencia, double espacio) {
		// TODO Auto-generated constructor stub
		super(modelo, color, potencia, espacio);
	}
	@Override
	public String mostrarCaracteristicas() {
		
		return MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_AUTOMOVIL_DIESEL, modelo, color, potencia, espacio);
	}

}
