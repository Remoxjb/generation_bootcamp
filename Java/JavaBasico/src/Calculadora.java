import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		System.out.println("Introduce el numero de la operacion a realizar");
		System.out.println("1) Suma   2) Resta   3) Multiplicacion   4) Division");
		
		int operacion = datos.nextInt();
		
		switch (operacion) {
		case 1:
			System.out.println("Vas a sumar");
			System.out.println("Ingresa el primer numero:");
			int a = datos.nextInt();
			System.out.println("Ingresa el segundo numero:");
			int b = datos.nextInt();
			int resultado = (a+b);
			System.out.println("Resultado");
			System.out.println(resultado);
			break;
		case 2:
			System.out.println("Vas a restar");
			System.out.println("Ingresa el primer numero:");
			int c = datos.nextInt();
			System.out.println("Ingresa el segundo numero:");
			int d = datos.nextInt();
			int resultadoResta = (c-d);
			System.out.println("Resultado");
			System.out.println(resultadoResta);
			break;
		case 3:
			System.out.println("Vas a multiplicar");
			System.out.println("Ingresa el primer numero:");
			int e = datos.nextInt();
			System.out.println("Ingresa el segundo numero:");
			int f = datos.nextInt();
			int resultadomultiplicacion = (e*f);
			System.out.println("Resultado");
			System.out.println(resultadomultiplicacion);
			break;	
		case 4:
			System.out.println("Vas a dividir");
			System.out.println("Ingresa el primer numero:");
			int g = datos.nextInt();
			System.out.println("Ingresa el segundo numero:");
			int h = datos.nextInt();
			if(h ==0) {
				System.out.println("No puedes dividir entre 0");
			}else {
			double resultadodivision = (float)g/(float)h;
			System.out.println("Resultado");
			System.out.println(resultadodivision);
			}break;	
			default:
			System.out.println("Operacion no valida");
			datos.close();
		}
		
			
	}

}
