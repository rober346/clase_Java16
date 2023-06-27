package Positivonegativo;

import java.util.Scanner;

public class PositivoNegativo {
	
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cual es el numero ?");
		int num = entrada.nextInt();
		
		if (num > 0) {
			System.out.println("El numero es positivo");	
		}else if (num == 0){
			System.out.println("El numero es cero");
		}else{
			System.out.println("El numero es negativo");
		}		
		entrada.close();
	}
}
