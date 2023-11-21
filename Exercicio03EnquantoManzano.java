package exercicio;

public class Exercicio03EnquantoManzano {

	public static void main(String[] args) {
		
		int contadora=1;
		int soma=0;
		
	    while (contadora<501) {
		
		 if (contadora%2==0) {
			soma=+contadora;
		}
		contadora++;
	}
System.out.println("A somataria dos números pares entre 1 e 500 é:"+soma);
	}

}
