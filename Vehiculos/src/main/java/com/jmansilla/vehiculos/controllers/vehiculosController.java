package com.jmansilla.vehiculos.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class vehiculosController {
	@RequestMapping(method = RequestMethod.GET)
	public List<String> getEmpleados(){	
		List<String> lista = new ArrayList<String>();
		
		lista.add("Jose");
		lista.add("Maribel");
		
		lista.stream().filter(e -> e.equals("Jose"));
		return lista;
	}
}
