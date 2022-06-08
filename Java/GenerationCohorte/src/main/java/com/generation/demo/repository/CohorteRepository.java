package com.generation.demo.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generation.demo.model.Cohorte;

@Repository
// se relaciona el modelo con el repositorio con el ID que es integer
public interface CohorteRepository extends JpaRepository<Cohorte, Integer> {

	// podemos agregar metodos personalizados
	
	List<Cohorte> findByCiudad(String ciudad);
	
	
	//query
	@Query (value= "SELECT id_instructor, nombre_intructor, nombre_alumno FROM instructor inner join alumno on instructor.cohorte_id = alumno.cohorte_id;")
	List<Map<String,Object>> obtenerInstructorAlumno();
}
