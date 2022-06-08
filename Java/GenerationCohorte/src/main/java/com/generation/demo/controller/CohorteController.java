package com.generation.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.demo.model.Cohorte;
import com.generation.demo.service.CohorteService;

@RestController
@RequestMapping("api/cohorte")
public class CohorteController {
	//Inyectar el servicio en el controlador
	private CohorteService cohorteService;
	
	public CohorteController (@Autowired CohorteService cohorteService) {
		this.cohorteService = cohorteService;
	}
	
	@GetMapping ("/{id}") // api/cohorte/1
	public Cohorte getCohorte(@PathVariable Integer id) {
		return cohorteService.getCohorte(id);
	}
	
	@GetMapping("/all")
	public List<Cohorte> conseguirCohorte(){
		return cohorteService.getCohortes();
	}
	
	@PostMapping
	public Cohorte saveCohorte(@RequestBody Cohorte cohorte) {
		return cohorteService.saveCohorte(cohorte);
	}
	
	@GetMapping("/city")
	public List<Cohorte> getCohortesByCiudad(@RequestParam (value = "ciudad", defaultValue = "") String ciudad){
		return cohorteService.getCohortesByCiudad(ciudad);
	}
	
	@GetMapping("/instalum")
	public List<Map<String, Object>>getInstructorAlumno() {
		return cohorteService.getInstructorAlumno();
	}

	

}
