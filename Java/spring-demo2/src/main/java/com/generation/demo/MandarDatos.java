package com.generation.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// este es para poner un controlador RestController
// te permite poner un prefijo para todas las peticiones

@RestController
@RequestMapping("api/mandardatos")
public class MandarDatos {

	@GetMapping("/saludo")
	public String saludo() {
		return "Te vuelvo a saludar";
	}
	
	// Pedir datos
	
	@GetMapping("/mandarsaludos")
	public String mandarSaludos( @RequestParam(value = "nombre", defaultValue= "C12") String nombre,
								@RequestParam(value = "apellido", defaultValue= "México") String apellido){
		return "Le mando saludos a " + nombre  + " " + apellido;
	}	
}
