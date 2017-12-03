package com.jmansilla.vehiculos.model.fabricaAbstracta;
/**
 * 
 * @author josemansilla
 * Interface que servirá para generar vehiculos independientemente de su familia.
 * Patron Abstract Factory
 */

import com.jmansilla.vehiculos.model.funcional.abstracta.AutomovilDto;
import com.jmansilla.vehiculos.model.funcional.abstracta.ScooterDto;
import com.jmansilla.vehiculos.utiles.Color;

public interface FabricaVehiculo {
	AutomovilDto crearAutomovil(String modelo, Color color, int potencia, double espacio);
	
	ScooterDto crearScooter(String modelo, Color color, int potencia);
}
