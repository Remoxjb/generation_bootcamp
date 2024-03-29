package com.generation.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "instructor")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_instructor;
	
	@Column(nullable = false)
	private String nombre_intructor;
	
	@Column(nullable = false)
	private String supervisor;
	
	@Column(nullable = false)
	private String puesto;
	
	// Llave foranea
	
	@OneToOne
	@JoinColumn(nullable = false, name = "cohorte_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Cohorte cohorte;
	

}
