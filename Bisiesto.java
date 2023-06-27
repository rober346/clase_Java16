package Bisiesto;

import java.util.Scanner;

public class Bisiesto {
	
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cual es el año ?");
		int year = entrada.nextInt();
			
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("El año es bisiesto ");
				}else {
					System.out.println("El año NO es bisiesto ");
				}
			}else{
				System.out.println("El año es bisiesto ");
			}
		}else{
			System.out.println("El año NO es bisiesto ");
		}
		entrada.close();
	}
}
