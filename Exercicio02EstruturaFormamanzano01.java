package exercicio;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio02EstruturaFormamanzano01 {

	public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     
     System.out.println("Digite um número para saber a tabuada:");
     int valor=sc.nextInt();
     
     for (int i=1;i<11;i++) {
    	 System.out.println(valor+"x"+i+"="+valor*i);
    	 
     }

	}

}
