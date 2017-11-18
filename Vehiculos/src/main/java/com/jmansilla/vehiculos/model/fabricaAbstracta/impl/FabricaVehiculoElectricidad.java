package com.jmansilla.vehiculos.model.fabricaAbstracta.impl;

import com.jmansilla.vehiculos.model.fabricaAbstracta.FabricaVehiculo;
import com.jmansilla.vehiculos.model.funcional.abstracta.Automovil;
import com.jmansilla.vehiculos.model.funcional.abstracta.Scooter;
import com.jmansilla.vehiculos.model.funcional.concret.AutomovilElectricidad;
import com.jmansilla.vehiculos.model.funcional.concret.ScooterElecticidad;
import com.jmansilla.vehiculos.utiles.Color;

public class FabricaVehiculoElectricidad implements FabricaVehiculo {

	@Override
	public Automovil crearAutomovil(String modelo, Color color, int potencia, double espacio) {
		return new AutomovilElectricidad(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter crearScooter(String modelo, Color color, int potencia) {
		// TODO Auto-generated method stub
		return new ScooterElecticidad(modelo, color, potencia);
	}

}
