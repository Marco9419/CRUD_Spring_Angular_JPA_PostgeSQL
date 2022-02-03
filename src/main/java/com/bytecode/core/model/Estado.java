package com.bytecode.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Pais pais;
	private String nombreEs;
		
	
	public Estado(Pais pais, String nombreEs) {
		super();
		this.pais = pais;
		this.nombreEs = nombreEs;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getNombreEs() {
		return nombreEs;
	}
	public void setNombreEs(String nombreEs) {
		this.nombreEs = nombreEs;
	}
	
	

}
