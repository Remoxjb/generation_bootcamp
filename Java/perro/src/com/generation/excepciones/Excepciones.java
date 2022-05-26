package com.generation.excepciones;

public class Excepciones {

	public static void main(String[] args) {
		int num1 = 10;
		Integer num2 = null;
		
		float division;
		
		//try-catch-fanally
		try {
			division = num1 / num2;
			//codigo que vamos a probar
		}catch(ArithmeticException ex) {//la excepcion a observar siempre poner ex que es un objeto 
			//lo que se va a realizar o se puede cambiar el codigo para que no se pause la ejecucion del programa
			division = 0.0f;
			System.out.println("Error: "+ex.getMessage());//muestra el nombre del error
		}catch(NullPointerException ex){
			
			division = 0.0f;
			System.out.println("Error: "+ex.getMessage());
		}finally {//no es necesario que se agregue y al final se va a mostrar
			System.out.println("Finalizo el try catch");
		}

	}

}
