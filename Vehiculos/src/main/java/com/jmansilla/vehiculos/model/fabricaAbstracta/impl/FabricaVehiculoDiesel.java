package com.jmansilla.vehiculos.model.fabricaAbstracta.impl;

import com.jmansilla.vehiculos.model.fabricaAbstracta.FabricaVehiculo;
import com.jmansilla.vehiculos.model.funcional.Automovil;
import com.jmansilla.vehiculos.model.funcional.AutomovilDiesel;
import com.jmansilla.vehiculos.model.funcional.Scooter;
import com.jmansilla.vehiculos.model.funcional.ScooterDiesel;
import com.jmansilla.vehiculos.utiles.Color;

public class FabricaVehiculoDiesel implements FabricaVehiculo {

	@Override
	public Automovil crearAutomovil(String modelo, Color color, int potencia, double espacio) {
		return new AutomovilDiesel(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter crearScooter(String modelo, Color color, int potencia) {
		// TODO Auto-generated method stub
		return new ScooterDiesel(modelo, color, potencia);
	}

}
