package com.generation.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		
		//list  - ArrayList
		//picoparéntesis
		List <String> miArray = new ArrayList <String>();
		
		miArray.add("Pedro");
		miArray.add("Pablo");
		miArray.add("Leticia");
		miArray.add(1, "Juan");
		
		System.out.println(miArray);
		
		System.out.println(miArray.size());//length numero total de elementos
		
		String elemento = miArray.remove(1);
		
		System.out.println(miArray);
		
		System.out.println(miArray.size());//length numero total de elementos
		System.out.println(elemento);
	
		imprimir(miArray);
		
		/*coleccion de numeros
		 * no se puede crear un arreglo con valores primitivos se una clases wrappers
		 * clases Wrappers
		 * long ==>Long
		 * double==>Double
		 * int==>Integer
		 * boolean ==> Boolean*/
		
		System.out.println("\t list Integer");
		
		int num1 = 10;
		Integer num2 = 10;
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(num2.getClass().getSimpleName());//muestra el tipo de clase
		
		//coleccion de numeros
		List<Integer> miArray2 = new ArrayList <Integer>();
		
		miArray2.add(3);
		miArray2.add(1312123);
		miArray2.add(4566);
		
		imprimir(miArray2);
		
		
		/*Coleccion Hashset*/
		System.out.println("\t set ----HashSet");
		
		Set <String> miSet = new HashSet<String>();
		
		miSet.add("Martha");
		miSet.add("Martha");
		miSet.add("Juan");
		miSet.add("Gabriel");
		
		miSet.remove("Juan");
		
		System.out.println(miSet);
		
		
		//Map -- HashMap -- Indice
		//<Key/llave, value/valor>
		System.out.println("\t set ----HashMap");
		
		Map <String, Integer> miMap = new HashMap <String, Integer> ();
		
		miMap.put("Valor 1", 30);
		miMap.put("Valor 1", 180);
		miMap.put("Valor 2", 40);
		miMap.put("Valor 3", 280);
		miMap.put("Valor 4", 480);
		
		System.out.println(miMap); //impreme todo como un diccionario
		System.out.println(miMap.values());	//regresa todos los valores
		System.out.println(miMap.keySet());	//regresa todas la llaves
		
		//busacr una llave en especifico usando get te mostrara el valor
		System.out.println(miMap.get("Valor 1"));
		
		for (String llave : miMap.keySet()) {
			System.out.println(llave  + " : " + miMap.get(llave));
		}
		
	}
	
	public static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion) {
			System.out.println("Elemento = " + elemento);
		}
	}
	
	
}
