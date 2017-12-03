package com.jmansilla.vehiculos.model.funcional.concret;

import java.text.MessageFormat;

import com.jmansilla.vehiculos.model.funcional.abstracta.AutomovilDto;
import com.jmansilla.vehiculos.utiles.Color;
import com.jmansilla.vehiculos.utiles.Mensajes;
import com.jmansilla.vehiculos.utiles.TiposAutomoviles;

public class AutomovilElectricidad extends AutomovilDto {
	public AutomovilElectricidad(String modelo, Color color, int potencia, double espacio) {
		// TODO Auto-generated constructor stub
		super(modelo, color, potencia, espacio, TiposAutomoviles.ELECTRICO);
	}
	public AutomovilElectricidad() {
		// TODO Auto-generated constructor stub
		super();
		this.setTipo(TiposAutomoviles.ELECTRICO);
	}
	
	@Override
	public String mostrarCaracteristicas() {
	
		return MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_AUTOMOVIL_ELECTRICO, modelo, color, potencia, espacio);
	}

}
