package com.pokemon;

public abstract class Pokemon {//cuando es abstracta ya no se puede instanciar
	//atributos
	private int id;
	private int edad;
	private int nivel;
	private String nombre;
	private boolean evolucion;
	
	//constructor
	public Pokemon (int id, int edad, int nivel, String nombre, boolean evolucion) {
		this.id = id;
		this.edad = edad;
		this.nivel = nivel;
		this.nombre = nombre;
		this.evolucion = evolucion;
	}
	
	//metodos
	public void comer() {
		System.out.println(nombre+ " esta comiendo");
	}
	public void comer(String comida) {
		System.out.println(nombre+ " esta comiendo "+comida);
	}
	public void atacar() {
		System.out.println(nombre+ " esta atacando");
	}
	
	
	public void dormir() {
		System.out.println(nombre+ " esta dormido ZZZZZZZ");
	}
	
	//metodo abstracto
	//no lleva las llaves solo lleva el nomrbe
	public abstract void saludar(String mensaje); 

	//getter y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEvolucion() {
		return evolucion;
	}

	public void setEvolucion(boolean evolucion) {
		this.evolucion = evolucion;
	}
	
}
