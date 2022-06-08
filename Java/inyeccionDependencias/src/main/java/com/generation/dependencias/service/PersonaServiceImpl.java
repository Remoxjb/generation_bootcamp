package com.generation.dependencias.service;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {
	// aqui solo se ponen los metodos que se usaran de la interfaz
	@Override
	public String registro(String nombre) {
		return "El usuario " + nombre + " ha sido registrado";
	}

	@Override
	public int calcular(int a, int b) {
		
		return a + b;
	}
	
	

}
