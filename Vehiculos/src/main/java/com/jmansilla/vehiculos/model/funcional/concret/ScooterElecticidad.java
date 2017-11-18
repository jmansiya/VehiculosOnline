package com.jmansilla.vehiculos.model.funcional.concret;

import java.text.MessageFormat;

import com.jmansilla.vehiculos.model.funcional.abstracta.Scooter;
import com.jmansilla.vehiculos.utiles.Color;
import com.jmansilla.vehiculos.utiles.Mensajes;

public class ScooterElecticidad extends Scooter {
	
	public ScooterElecticidad(String modelo, Color color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public String mostrarCaracteristicas() {
		return MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_SCOOTER_ELECTRICO, modelo, color, potencia);
	}

}
