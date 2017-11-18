package com.jmansilla.vehiculos.model.funcional.concret;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jmansilla.vehiculos.model.funcional.abstracta.Scooter;
import com.jmansilla.vehiculos.utiles.Color;
import com.jmansilla.vehiculos.utiles.Mensajes;

public class ScooterGasolina extends Scooter {
	
	public ScooterGasolina(String modelo, Color color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public String mostrarCaracteristicas() {
		return MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_SCOOTER_GASOLINA, modelo, color, potencia);
	}

}
