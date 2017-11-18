package com.jmansilla.vehiculos.model.funcional.concret;

import java.text.MessageFormat;

import com.jmansilla.vehiculos.model.funcional.abstracta.Automovil;
import com.jmansilla.vehiculos.utiles.Color;
import com.jmansilla.vehiculos.utiles.Mensajes;

public class AutomovilGasolina extends Automovil {
	
	public AutomovilGasolina(String modelo, Color color, int potencia, double espacio) {
		// TODO Auto-generated constructor stub
		super(modelo, color, potencia, espacio);
	}
	@Override
	public String mostrarCaracteristicas() {
		
		return MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_AUTOMOVIL_GASOLINA, modelo, color, potencia, espacio);
	}

}
