package ciclos;

import java.util.Scanner;

public class EjercicioCiclos {

	public static void main(String[] args) {
//Adivina el número

//Escribe un programa en Java que te pida introducir un número y lo compare con otro número que puede ser aleatorio o establecido por tí.
//Mientras que el número no sea igual al establecido como base, el programa se seguirá ejecutando.
//Una vez que ambos números sean iguales, el programa se detendrá y mostrará lo siguiente en consola:
//
//"Felicidades, adivinaste el número."

		Scanner teclado = new Scanner(System.in);
		
		int numeroAdivinar = 0;
		
		int usuario = 20;
		
		do {
			System.out.println("Introduce un numero para adivinar");
			int num = teclado.nextInt();
			numeroAdivinar = num;
			if(usuario == numeroAdivinar) {
				System.out.println("Numeros iguales");
			}else {
				System.out.println("Numeros diferentes");
			}
		}while((usuario == numeroAdivinar) == false);
		 System.out.println("Adivinaste el numero");
		
		 teclado.close();
		
	}

}
