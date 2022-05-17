package ciclos;

import javax.swing.JOptionPane;

public class CicloDoWhile {

	public static void main(String[] args) {
		
		String clave = "Pedro";
		
		String comparacion = "";
		
		do {
				
				comparacion = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
				
				if(clave.equals(comparacion)== false) {
					System.out.println("La contraseña es incorrecta");
				}
			
		}
				while ((clave.equals(comparacion)== false));
		
		System.out.println("La contraseña es correcta");//clave == comparacion

	}
			
}
