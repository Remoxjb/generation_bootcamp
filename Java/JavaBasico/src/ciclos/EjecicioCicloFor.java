package ciclos;

import java.util.Scanner;

public class EjecicioCicloFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String correo = "";
		boolean esValido = false;
		
		System.out.println("Introduce un correo");
		correo = sc.nextLine();
		for (int i=0; i<correo.length();i++) {
			if(correo.charAt(i)== '@') {
			esValido = true;
			System.out.println("Es un correo Valido");
		}
		else {
			esValido = false;
			
			continue;
			
		}
			System.out.println("Es un correo no Valido");
	  }
	}	
}
	


