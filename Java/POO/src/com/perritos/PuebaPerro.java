package com.perritos;

public class PuebaPerro {

	public static void main(String[] args) {
		
		//Instanciar
		Perro perro1 = new Perro("Zeus", 3);
		
		//cambiar sus atributos
		
		perro1.raza = "Husky";
		perro1.tamanio = "Mediano";
		
		perro1.ladrar();
		
		int edadP = perro1.edadPerruna();
		System.out.println("Edad perruna "+edadP);
		
		//metodo estatico
		perro1.mensaje();
		
		Perro.mensaje();
		
		Perro perro2 = new Perro("Descolorido", 1);
		
		perro2.edad = 1;
		perro2.raza = "Dalmata";
		perro2.tamanio ="Grande";
	
		perro2.ladrar();
		int edadP2 = perro2.edadPerruna();
		System.out.println("Edad perruna "+edadP2);
		
	}

}
