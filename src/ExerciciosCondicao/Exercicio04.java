package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		/*
		 * Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem 
		 * indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.
		 */
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Informe um valor: ");
		num = leia.nextInt();
		
		
		if (num % 2 == 0 && num > 0) {
			System.out.println("\n N�mero digitado � par e positivo.");
		} else if (num % 2 == 0 && num < 0){
			System.out.println("\n N�mero digitado � par e negativo.");
		} else if (num > 0){
			System.out.println("\n N�mero digitado � impar e positivo.");
		} else {
			System.out.println("\n N�mero digitado � impar e negativo.");

		}
		
		
		
	}

}
