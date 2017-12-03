package com.jmansilla.vehiculos.model.funcional.concret;

import java.text.MessageFormat;

import com.jmansilla.vehiculos.model.funcional.abstracta.AutomovilDto;
import com.jmansilla.vehiculos.utiles.Color;
import com.jmansilla.vehiculos.utiles.Mensajes;
import com.jmansilla.vehiculos.utiles.TiposAutomoviles;

public class AutomovilDiesel extends AutomovilDto {

	public AutomovilDiesel() {
		this.setTipo(TiposAutomoviles.DIESEL);
	}

	public AutomovilDiesel(String modelo, Color color, int potencia, double espacio) {
		// TODO Auto-generated constructor stub
		super(modelo, color, potencia, espacio, TiposAutomoviles.DIESEL);
	}
	@Override
	public String mostrarCaracteristicas() {
		
		return MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_AUTOMOVIL_DIESEL, modelo, color, potencia, espacio);
	}

	@Override
	public void setTipo(TiposAutomoviles tipo) {
		super.setTipo(tipo);
	}
}
