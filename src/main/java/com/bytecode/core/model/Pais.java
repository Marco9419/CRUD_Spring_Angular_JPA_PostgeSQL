package com.bytecode.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombrePa;
	

	public Pais(int id, String nombrePa) {
		super();
		this.id = id;
		this.nombrePa = nombrePa;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombrePa() {
		return nombrePa;
	}
	public void setNombrePa(String nombrePa) {
		this.nombrePa = nombrePa;
	}
	
	

}
