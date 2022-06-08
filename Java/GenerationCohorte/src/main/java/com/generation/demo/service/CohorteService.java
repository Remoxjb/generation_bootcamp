package com.generation.demo.service;

import java.util.List;
import java.util.Map;

import com.generation.demo.model.Cohorte;

public interface CohorteService {

	// Una interfaz contiene metodos vacios
	// Las clases que lo implemente deben cumplir con los metodos vacios declarados
	
	// Operaciones de crud se pone primero el nombre del metodo
	
	// Leer
	// Leer una cohorte solo con un ID indicado
	Cohorte getCohorte(Integer id);
	
	List<Cohorte> getCohortesByCiudad(String ciudad);
	
	// traer oy Leer todas las cohortes
	List<Cohorte> getCohortes();
	
	List<Map<String,Object>> getInstructorAlumno();
	
	// Escribir
	// Guardar una cohorte enviada
	Cohorte saveCohorte(Cohorte cohorte);
	
	// Actualizar
	
	
	//Borrar
	
}
