import java.util.Scanner;

public class FlujoDeControl {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa tu edad:");
		
		int edad = sc.nextInt();
		
		
		if(edad >=18) {
			if(edad >50) {
				System.out.println("Eres un adulto mayor");
			}else {
			System.out.println("Eres mayor de edad");
			}
		}
		else {
			System.out.println("Eres menor de edad");
		}
		
		String mensaje = (edad >= 18) ? ("Eres mayor de edad x2") : ("Eres menor de edad");
		
		System.out.println(mensaje);
		
		System.out.print("¿En que dia estamos?");
		sc.nextLine();
		String dia = sc.nextLine();
		sc.close();
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("5 minutos mas");
			break;
		case "martes":
			System.out.println("No te cases ni te embarques");
			break;
		case "miercoles":
			System.out.println("Ombligo de semana");
			break;
		case "jueves":
			System.out.println("Viernes chiquito");
			break;	
		case "viernes":
			System.out.println("Chelas");
			break;
			default:
				System.out.println("Dia no valido");
		}
		
		
	}
}

