package ciclos;

import java.util.Scanner;

public class EjercicioCiclosforma2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroInicial = 0;
		int numeroAleatorio = (int)(Math.random()*100);
		
		System.out.println("Introduce un numero entre 0 y 100");
		
		numeroInicial = sc.nextInt();
		
		while (numeroInicial != numeroAleatorio) {
			if (numeroInicial > numeroAleatorio) {
				System.out.println("El numero es mas pequeño, prueba otra vez");
				numeroInicial= sc.nextInt();
			}else if (numeroInicial < numeroAleatorio) {
				System.out.println("El numero es mas grande, prueba otra vez");
				numeroInicial= sc.nextInt();
				
			}
		}
		sc.close();
		System.out.println("Felicidades lo adivinaste");
		

	}

}
