package com.jmansilla.vehiculos.data.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jmansilla.vehiculos.data.model.Automovil;

public interface AutomovilRepository extends MongoRepository<Automovil, String> {
	public Automovil findByModelo(String modelo);
	public List<Automovil> findByColor(int codColor);
	public List<Automovil> findByTipo(String tipo);
}
