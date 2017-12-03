package com.jmansilla.vehiculos.data.converters.implementacion;

import com.jmansilla.vehiculos.data.converters.GenericConverter;
import com.jmansilla.vehiculos.data.model.Automovil;
import com.jmansilla.vehiculos.model.funcional.concret.AutomovilElectricidad;
import com.jmansilla.vehiculos.utiles.Color;

public class AutomovilElectricoConverter implements GenericConverter<Automovil, AutomovilElectricidad>{

	@Override
	public Automovil createFrom(AutomovilElectricidad dto) {
		// TODO Auto-generated method stub
		return updateEntity(new Automovil(), dto);
	}

	@Override
	public AutomovilElectricidad createFrom(Automovil entity) {
		// TODO Auto-generated method stub
		AutomovilElectricidad automovilDTO = new AutomovilElectricidad();
		automovilDTO.setId(entity.getId());
		automovilDTO.setColor(Color.getByCodigo(entity.getColor()));
		automovilDTO.setEspacio(entity.getEspacio());
		automovilDTO.setModelo(entity.getModelo());
		automovilDTO.setPotencia(entity.getPotencia());

		return automovilDTO;
	}

	@Override
	public Automovil updateEntity(Automovil entity, AutomovilElectricidad dto) {
		// TODO Auto-generated method stub
		entity.setColor(dto.getColor().getCodigo());
		entity.setEspacio(dto.getEspacio());
		entity.setModelo(dto.getModelo());
		entity.setPotencia(dto.getPotencia());
		entity.setTipo(dto.getTipo().getTipo());

		return entity;
	}

}
