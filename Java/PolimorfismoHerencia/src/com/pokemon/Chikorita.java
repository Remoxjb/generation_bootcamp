package com.pokemon;

public class Chikorita extends TipoPlanta {
	
	//atributos especificos
	private int numeroCuernitos;
	
	
	//constructor
	public Chikorita(int id, int edad, int nivel, String nombre, boolean evolucion, int numeroHojas, int numeroCuernitos){
		
		super(id, edad, nivel, nombre, evolucion, numeroHojas);
		this.numeroCuernitos = numeroCuernitos;
	} 
		
	//metodos
	public void latigo() {
		System.out.println(getNombre()+ " uso latigo");
	}
	public void atacar() {
		System.out.println(getNombre()+ " Tipo planta esta atacando x2");
	}

	//getters y setters
	public int getNumeroCuernitos() {
		return numeroCuernitos;
	}

	public void setNumeroCuernitos(int numeroCuernitos) {
		this.numeroCuernitos = numeroCuernitos;
	}

	@Override
	public String toString() {
		return "Chikorita [numeroCuernitos=" + numeroCuernitos + "]";
	}
	
	
}
