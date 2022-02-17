package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int numb, par = 0, impar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x = 1; x <= 10; x++) {
			System.out.println("\n Informe um valor: ");
			numb = leia.nextInt();
			
			if (numb % 2 == 0 ) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.printf("\n Pelos números informados, no total temos %d números pares "
				+ "e %d números impares.", par, impar);

	}

}
