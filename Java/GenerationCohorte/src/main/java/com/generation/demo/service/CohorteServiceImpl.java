package com.generation.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.demo.model.Cohorte;
import com.generation.demo.repository.CohorteRepository;

@Service
public class CohorteServiceImpl implements CohorteService{

	// No podemos crear un objeto a partir de una interface
	CohorteRepository cohorteRepository;
	
	public CohorteServiceImpl(@Autowired CohorteRepository cohorteRepository) {
		this.cohorteRepository = cohorteRepository;
	}
	
	@Override
	public Cohorte getCohorte(Integer id) {
		Optional<Cohorte> cohorte = cohorteRepository.findById(id);
		return cohorte.orElse(null);
	}

	@Override
	public List<Cohorte> getCohortes() {
		return cohorteRepository.findAll();
	}

	@Override
	public Cohorte saveCohorte(Cohorte cohorte) {
		return cohorteRepository.save(cohorte);
	}

	@Override
	public List<Cohorte> getCohortesByCiudad(String ciudad) {
		return cohorteRepository.findByCiudad(ciudad);
	}

	@Override
	public List<Map<String, Object>> getInstructorAlumno() {
		return cohorteRepository.obtenerInstructorAlumno()
;
	}

}
