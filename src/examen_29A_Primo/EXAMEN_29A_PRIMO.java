package examen_29A_Primo;

import java.util.Scanner;

public class EXAMEN_29A_PRIMO {
	
	public static void main(String[] args) {
		
		System.out.println("Buenos días Ceinmark, soy Micaela Torre Durán");
		
		System.out.println("Introduce un número para averiguar si es primo o no");
		Scanner ent = new Scanner(System.in);
		int numero = ent.nextInt();
		        
		        if (esPrimo(numero)) {
		            System.out.println(numero + " es primo.");
		        } else {
		            System.out.println(numero + " no es primo.");
		        }
		    }//fin main

		    public static boolean esPrimo(int n) {
		        if (n <= 1) return false;
		        for (int i = 2; i <= Math.sqrt(n); i++) {
		            if (n % i == 0) {
		                return false; 
		            }
		        }
		        return true; 
		    }
}
		

