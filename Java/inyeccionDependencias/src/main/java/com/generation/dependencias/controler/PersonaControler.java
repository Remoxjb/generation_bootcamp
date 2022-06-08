package com.generation.dependencias.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.dependencias.service.PersonaServiceImpl;

@RestController
@RequestMapping("/api")
public class PersonaControler {

	private PersonaServiceImpl personaServiceImpl; 
	
	// constructor para hacer la inyeccion de dependencias
	
	@Autowired
	public PersonaControler(PersonaServiceImpl personaServiceImpl) {
		this.personaServiceImpl = personaServiceImpl;
		}
	
	@GetMapping ("/saludo") //http://localhost:8080/api/saludo
	public String saludo() {
		return "Hi my friend";
	}
	@GetMapping("/registro") //http://localhost:8080/api/registro
	public String registro(@RequestParam(value = "nombre", defaultValue = "Desconocido") String nombre) {
		return personaServiceImpl.registro(nombre);
	}
	
	@GetMapping("/calcular") //http://localhost:8080/api/calcular
	public int calcular(@RequestParam(value = "num1", defaultValue = "0" )int a, @RequestParam(value = "num2", defaultValue = "0"	) int b) {
	return personaServiceImpl.calcular(a,b);
	}
	
	
}
