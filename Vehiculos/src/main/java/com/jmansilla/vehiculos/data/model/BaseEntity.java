package com.jmansilla.vehiculos.data.model;

import org.springframework.data.annotation.Id;

public class BaseEntity {
	@Id
	private String id;

	public BaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseEntity(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
