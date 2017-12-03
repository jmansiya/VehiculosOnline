package com.jmansilla.vehiculos.model.funcional.concret;

import java.text.MessageFormat;

import com.jmansilla.vehiculos.model.funcional.abstracta.ScooterDto;
import com.jmansilla.vehiculos.utiles.Color;
import com.jmansilla.vehiculos.utiles.Mensajes;

public class ScooterDiesel extends ScooterDto {
	
	public ScooterDiesel(String modelo, Color color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public String mostrarCaracteristicas() {
		return MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_SCOOTER_DIESEL, modelo, color, potencia);
	}

}
