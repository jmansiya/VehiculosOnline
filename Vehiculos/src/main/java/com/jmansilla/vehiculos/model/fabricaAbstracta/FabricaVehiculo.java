package com.jmansilla.vehiculos.model.fabricaAbstracta;
/**
 * 
 * @author josemansilla
 * Interface que servirá para generar vehiculos independientemente de su familia.
 * Patron Abstract Factory
 */

import com.jmansilla.vehiculos.model.funcional.Automovil;
import com.jmansilla.vehiculos.model.funcional.Scooter;
import com.jmansilla.vehiculos.utiles.Color;

public interface FabricaVehiculo {
	Automovil crearAutomovil(String modelo, Color color, int potencia, double espacio);
	
	Scooter crearScooter(String modelo, Color color, int potencia);
}
