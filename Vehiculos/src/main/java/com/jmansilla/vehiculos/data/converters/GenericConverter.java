package com.jmansilla.vehiculos.data.converters;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.jmansilla.vehiculos.data.model.BaseEntity;
import com.jmansilla.vehiculos.model.funcional.abstracta.AbstractDto;

public interface GenericConverter<E extends BaseEntity, D extends AbstractDto> {
	E createFrom(D dto);
	D createFrom(E entity);
	E updateEntity(E entity, D dto);
	
	default List<D> createFromEntities(final Collection<E> entities) {
		return entities.stream()
				.map(this::createFrom)
				.collect(Collectors.toList());
	}
	
	default List<E> createFromDTos(final Collection<D> dtos) {
		return dtos.stream()
				.map(this::createFrom)
				.collect(Collectors.toList());
	}
}
