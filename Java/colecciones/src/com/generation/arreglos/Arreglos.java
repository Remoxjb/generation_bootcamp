package com.generation.arreglos;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		
		//matrices//arreglos
		//solo pueden tener un tipo de dato 
		//debemos especificar su tamaño
		/*numero - 0
		 * String - null
		 * boolean - false
		 */
		//para imprimir los valores dentro de java
		//System.out.println(Arrays.toString(arrNumeros));
		
		int [] arrNumeros =  new int [5];
		
		//inician de la numercion basada en 0
		arrNumeros[0] = 1;
		arrNumeros[1] = Integer.parseInt("1"); //se hizo ya que en java no se pueden agregar string debido a que se inicializa con numeros int
		arrNumeros[2] = 2121221;
		arrNumeros[3] = 1511221;
		arrNumeros[4] = 5115151;
		
		
		
		System.out.println(Arrays.toString(arrNumeros));
		
		System.out.println(arrNumeros[4]);
		
		for(int i=0; i<arrNumeros.length; i++) {
			System.out.println(arrNumeros[i]);
		}
		
		//forEach
		int conteo = 0;
		for(int elemento : arrNumeros) {
			conteo++;
			System.out.println("Elemento  " +conteo +"="+ elemento);
		}
		
		//arreglo que guarda objetos
		
		Persona persona1 = new Persona("Juan",30);
		Persona persona2 = new Persona("Raul",31);
		
		//Object arrPersona[] = new Object [3];
		
		Persona arrPersonas[] = new Persona[3];
		
		arrPersonas[0] = persona1;
		arrPersonas[1] = persona2;
		arrPersonas[2] = new Persona("Somer", 27);
		
		System.out.println(Arrays.toString(arrPersonas));
		
		for(Persona elemento: arrPersonas) {
			System.out.println(elemento.nombre +" - "+ elemento.edad);
		}
		
		
		//Arreglos literales
		String []arrString = {"Hola", "Mi", "Nombre", "es"};
		System.out.println(Arrays.toString(arrString));
	}
	

}
