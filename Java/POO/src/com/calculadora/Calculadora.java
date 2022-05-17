package com.calculadora;

public class Calculadora {

	//modificador de acceso metodo (void no regresa nada)
	public void sumarMensaje () {
		System.out.println("Voy a sumar");
		
	}
	
	// metodo que retorna datos 
	
	public String mensaje() {
		String mensaje = "Voy a regresar una operacion";
		return mensaje;
	}
	
	// metodo que retorna un numero siempre debe de tener un return
	public int prueba() {
		return 2;
	}
	
	
	
	//operaciones
	
	public int sumar (int a, int b) {
		return a + b;
	}
	
public void sumarM(int a, int b) {
		System.out.println("El resultado de la suma es: " + (a+b));
	}
	
	//restar
	
	public int restar (int a, int b) {
		return a - b;
		
	}
	
	//multiplicar
	
	public int multiplicar (int a, int b) {
		return a * b;
	}
	//dividir
	
	public double dividir (double a, double b) {
		if (b != 0) {
			return a / b;
		}
		else {
			return -1;
		}
	}

}
