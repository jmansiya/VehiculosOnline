package com.jmansilla.vehiculos.model.funcional.concret;

import java.text.MessageFormat;

import com.jmansilla.vehiculos.model.funcional.abstracta.AutomovilDto;
import com.jmansilla.vehiculos.utiles.Color;
import com.jmansilla.vehiculos.utiles.Mensajes;
import com.jmansilla.vehiculos.utiles.TiposAutomoviles;

public class AutomovilGasolina extends AutomovilDto {

	public AutomovilGasolina() {
		super();
		this.setTipo(TiposAutomoviles.GASOLINA);
	}

	public AutomovilGasolina(String modelo, Color color, int potencia, double espacio) {
		// TODO Auto-generated constructor stub
		super(modelo, color, potencia, espacio, TiposAutomoviles.GASOLINA);
	}
	@Override
	public String mostrarCaracteristicas() {
		
		return MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_AUTOMOVIL_GASOLINA, modelo, color, potencia, espacio);
	}

}
