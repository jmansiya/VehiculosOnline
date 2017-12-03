package com.jmansilla.vehiculos.data.converters.implementacion;

import com.jmansilla.vehiculos.data.converters.GenericConverter;
import com.jmansilla.vehiculos.data.model.Automovil;
import com.jmansilla.vehiculos.model.funcional.concret.AutomovilDiesel;
import com.jmansilla.vehiculos.model.funcional.concret.AutomovilElectricidad;
import com.jmansilla.vehiculos.utiles.Color;

public class AutomovilDieselConverter implements GenericConverter<Automovil, AutomovilDiesel>{

	@Override
	public Automovil createFrom(AutomovilDiesel dto) {
		// TODO Auto-generated method stub
		return updateEntity(new Automovil(), dto);
	}

	@Override
	public AutomovilDiesel createFrom(Automovil entity) {
		// TODO Auto-generated method stub
		AutomovilDiesel automovilDTO = new AutomovilDiesel();
		automovilDTO.setId(entity.getId());
		automovilDTO.setColor(Color.getByCodigo(entity.getColor()));
		automovilDTO.setEspacio(entity.getEspacio());
		automovilDTO.setModelo(entity.getModelo());
		automovilDTO.setPotencia(entity.getPotencia());
		
		return automovilDTO;
	}

	@Override
	public Automovil updateEntity(Automovil entity, AutomovilDiesel dto) {
		// TODO Auto-generated method stub
		entity.setColor(dto.getColor().getCodigo());
		entity.setEspacio(dto.getEspacio());
		entity.setModelo(dto.getModelo());
		entity.setPotencia(dto.getPotencia());
		entity.setTipo(dto.getTipo().getTipo());
		return entity;
	}

}
