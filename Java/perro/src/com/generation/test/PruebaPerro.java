package com.generation.test;

import com.generation.model.Perro;

public class PruebaPerro {

	public static void main(String[] args) {
		
		Perro pelusa = new Perro("Pelusa", "french", "chico", 4, "Blanco");
		
		Perro zeus = new Perro ("Zeus", "Husky", "Grande",4, "Gris con blanco");
		
		pelusa.setHumano("Amy");
		zeus.setHumano("Juan");
		
		System.out.println(pelusa);
		System.out.println(zeus);
		
		pelusa.comer();
		zeus.dormir();
		
		System.out.println(Perro.buscarHumano(2));
		System.out.println(Perro.buscarHumano(1));
		

	}

}
