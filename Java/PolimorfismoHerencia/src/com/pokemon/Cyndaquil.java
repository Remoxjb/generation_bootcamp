package com.pokemon;

public class Cyndaquil  extends Pokemon implements TipoFuego{
	
	//constructor
	public Cyndaquil(int id, int edad, int nivel, String nombre, boolean evolucion) {
		super(id,edad,nivel,nombre,evolucion);
		
	}

	@Override
	public void lanzaLlamas() {
		System.out.println(getNombre() +" Lanzallamas");
		
	}

	@Override
	public void araniar() {
		System.out.println(getNombre() +" esta araniando");
		
	}

	@Override
	public void saludar(String mensaje) {
		System.out.println("saludando");
		
	}
	
	
	
}
