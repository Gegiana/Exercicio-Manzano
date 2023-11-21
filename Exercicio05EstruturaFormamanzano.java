package exercicio;

import java.util.Scanner;

public class Exercicio05EstruturaFormamanzano {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor da base B: ");
	        int base = scanner.nextInt();

	        System.out.print("Digite o valor do expoente E: ");
	        int expoente = scanner.nextInt();

	        int resultado = 1;

	        for (int i = 1; i <= expoente; i++) {
	            resultado *= base; 
	        }

	        System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
	    }
	

	}

