package com.jmansilla.vehiculos.model.fabricaAbstracta.impl;

import com.jmansilla.vehiculos.model.fabricaAbstracta.FabricaVehiculo;
import com.jmansilla.vehiculos.model.funcional.abstracta.AutomovilDto;
import com.jmansilla.vehiculos.model.funcional.abstracta.ScooterDto;
import com.jmansilla.vehiculos.model.funcional.concret.AutomovilDiesel;
import com.jmansilla.vehiculos.model.funcional.concret.ScooterDiesel;
import com.jmansilla.vehiculos.utiles.Color;

public class FabricaVehiculoDiesel implements FabricaVehiculo {

	@Override
	public AutomovilDto crearAutomovil(String modelo, Color color, int potencia, double espacio) {
		return new AutomovilDiesel(modelo, color, potencia, espacio);
	}

	@Override
	public ScooterDto crearScooter(String modelo, Color color, int potencia) {
		// TODO Auto-generated method stub
		return new ScooterDiesel(modelo, color, potencia);
	}

}
