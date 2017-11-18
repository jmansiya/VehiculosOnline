package com.jmansilla.vehiculos.model.fabricaAbstracta;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Before;
import org.junit.Test;

import com.jmansilla.vehiculos.model.fabricaAbstracta.impl.FabricaVehiculoElectricidad;
import com.jmansilla.vehiculos.model.funcional.Automovil;
import com.jmansilla.vehiculos.utiles.Color;
import com.jmansilla.vehiculos.utiles.Mensajes;

public class FabricaVehiculoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void tesGeneramosVehiculosElectricos() {
		FabricaVehiculo fabrica = new FabricaVehiculoElectricidad();
		
		List<Automovil> lAutomoviles = new ArrayList<>();
		lAutomoviles.add(fabrica.crearAutomovil("Opel Insignia", Color.BLANCO, 134, 551.0));
		lAutomoviles.add(fabrica.crearAutomovil("Renault Talisma", Color.NEGRO, 135, 500));
		lAutomoviles.add(fabrica.crearAutomovil("Renaul Clio", Color.ROJO, 85, 350.1));
		
		assertThat("Lista de automóviles vacia", lAutomoviles, not(IsEmptyCollection.empty()));
		
		assertThat("Contiene", 
				lAutomoviles.stream().map(e -> e.mostrarCaracteristicas()).collect(Collectors.toList()),
				contains(
						MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_AUTOMOVIL_ELECTRICO, "Opel Insignia", Color.BLANCO, 134, 551.0),
						MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_AUTOMOVIL_ELECTRICO, "Renault Talisma", Color.NEGRO, 135, 500),
						MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_AUTOMOVIL_ELECTRICO, "Renaul Clio", Color.ROJO, 85, 350.1)
						));
		
		
		assertThat("No existen vehiculos de gasolina", 
				lAutomoviles.stream().map(e -> e.mostrarCaracteristicas()).collect(Collectors.toList()),
				not (contains(
						MessageFormat.format(Mensajes.MENSAJE_MOSTRAR_AUTOMOVIL_GASOLINA, "Opel Insignia", Color.BLANCO, 134, 551.0)
						)));
					
	}


}
