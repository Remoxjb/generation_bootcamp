package com.perritos;

public class Perro {
	
	//atributos o propiedades
	String nombre = "Anonimo";
	int edad;
	String raza;
	String tamanio;
	
	//constructor
	
	public Perro(String nombre, int edad) { //para inicializar el objeto y forzoso tiene que tener el nombre
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//metodo
	
	public void ladrar () {
		System.out.println("El perro " + nombre + " hace Guauf");
	}
	
	public int edadPerruna() {
		return edad * 7;
	}
	
	//metodos estaticos
	//nos permite utilizar este metodo si instanciarlo
	public static void mensaje () {
		System.out.println("Esta es una clase Perro");
	}
}
