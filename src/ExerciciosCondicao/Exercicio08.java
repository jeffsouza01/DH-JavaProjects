package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/* Construa um sistema para ler uma vari�vel num�rica N 
		 * e imprimi-la somente se a mesma for maior que 100, 
		 * caso contr�rio imprimi-la com o valor zero.
		 * 
		 */
		
		int num;
		
		Scanner read = new Scanner(System.in);
		
	
		
		System.out.println("\n Informe um valor: ");
		num = read.nextInt();
		
		if (num > 100) {
			System.out.println(num);
		} else {
			System.out.println(num = 0);
		}
	}
}
