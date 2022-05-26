package com.pokemon;

public class TipoPlanta extends Pokemon {
	
	//atributos
	int numeroHojas;
	
	//constructor
	//el constructor hijo debe coincidir con la clase padre
	public TipoPlanta(int id, int edad, int nivel, String nombre, boolean evolucion, int numeroHojas) {
		//se le pasan los atributos de la clase padre (no funcionaria)	
	super (id,edad,nivel,nombre,evolucion);
	this.numeroHojas = numeroHojas;
	}
	
	//metodos
		public void envenenar() {
			System.out.println(getNombre()+" esta envenenando");
		}
		public void paralizar() {
			System.out.println(getNombre()+" esta paralizando");
		}
		public void atacar() {
			System.out.println(getNombre()+ " Tipo planta esta atacando");
		}
		@Override
		public void saludar(String mensaje) {
			System.out.println(mensaje);
		}
		
		
		//getter y setters
		public int getNumeroHojas() {
			return numeroHojas;
		}
		public void setNumeroHojas(int numeroHojas) {
			this.numeroHojas = numeroHojas;
		}

		
}
