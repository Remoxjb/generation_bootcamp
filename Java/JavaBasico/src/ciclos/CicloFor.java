package ciclos;

public class CicloFor {

	public static void main(String[] args) {
		
//		for(int i=0; i<5; i++) {
//			
//			System.out.println("Hola "+ i);
//			
//		}
//		
//		for (int i=5; i>0; i--) {
//			
//			System.out.println("Holax2 "+ i);
//			
//		}
//		
//		for (int i=0; i<20; i+=2) {
//			
//			System.out.println("Holax3 "+ i);
//			
//		}
		
		//continue && break
		
		for(int i=0; i<10; i++) {
			if(i%2 == 0 ) { 
				continue; // cuando es un numero par salte al numero impar 0 y si ponemos 1 son pares
				//break; //termina o rompe el ciclo
			}
			System.out.println(i);
		}
		
	}

}
