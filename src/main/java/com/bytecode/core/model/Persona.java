package com.bytecode.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	
	@Id
	private int id;
	
//	@Column(name ="nombre_completo")
	
	private String nombre;
	private String apellido;
	private String edad;
	
	@ManyToOne
	@JoinColumn(name="id_pais")
	private Pais pais;
	
	@ManyToOne
	@JoinColumn(name="id_estado")
	private Estado estado;
	
	
	public Persona(String nombre, String apellido, String edad, Pais pais, Estado estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.pais = pais;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	

}
