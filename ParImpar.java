package parimpar;

import java.util.Scanner;


public class ParImpar {
	
	public static void main(String [] args) {
			
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cual es el numero ?");
		int num = entrada.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El numero es par");	
			
		}else {
			System.out.println("El numero es impar");
			
		}
						
		for (int i = 2; i < num;) {
			
			if (num % i == 0) {
				System.out.println("El numero NO ES primo");
				break;
			}else{
				System.out.println ("El numero es primo");
				break;
			}
		}
		entrada.close();
	}
}
