package com.generation.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity // representacion de la informacion que nosotros necesitamos (molde)
@Table(name = "cohorte")
public class Cohorte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cohorte;
	
	@Column(nullable= false)
	private Integer numeroCohorte;
	
	@Column(nullable= false, length = 50)
	private String ciudad;
	
	
	// Relacionar la llave foranea
	// una cohorte le pertenece a muchos alumnos por eso se guarda en una lista
	// mapped es de donde lo esta mapeando que es de la clase cohorte
	
	@OneToMany(mappedBy = "cohorte")
	private List<Alumno> alumno;
	
	@OneToOne
	private Instructor instrustor;
	
	//GETTERS Y SETTERS	
	
	public Integer getId_cohorte() {
		return id_cohorte;
	}

	public void setId_cohorte(Integer id_cohorte) {
		this.id_cohorte = id_cohorte;
	}

	public Integer getNumeroCohorte() {
		return numeroCohorte;
	}

	public void setNumeroCohorte(Integer numeroCohorte) {
		this.numeroCohorte = numeroCohorte;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public List<Alumno> getAlumno() {
		return alumno;
	}

	public void setAlumno(List<Alumno> alumno) {
		this.alumno = alumno;
	}

	public Instructor getInstrustor() {
		return instrustor;
	}

	public void setInstrustor(Instructor instrustor) {
		this.instrustor = instrustor;
	}
	
	
}
