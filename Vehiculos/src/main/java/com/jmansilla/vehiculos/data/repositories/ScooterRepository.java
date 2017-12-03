package com.jmansilla.vehiculos.data.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jmansilla.vehiculos.data.model.Scooter;

public interface ScooterRepository extends MongoRepository<Scooter, String> {
	public Scooter findByModelo(String modelo);
	public List<Scooter> findByColor(int codColor);
}
