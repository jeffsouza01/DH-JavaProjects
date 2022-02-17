package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		/*
		 * Faça um sistema que leia um número inteiro e mostre uma mensagem 
		 * indicando se este número é par ou ímpar, e se é positivo ou negativo.
		 */
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Informe um valor: ");
		num = leia.nextInt();
		
		
		if (num % 2 == 0 && num > 0) {
			System.out.println("\n Número digitado é par e positivo.");
		} else if (num % 2 == 0 && num < 0){
			System.out.println("\n Número digitado é par e negativo.");
		} else if (num > 0){
			System.out.println("\n Número digitado é impar e positivo.");
		} else {
			System.out.println("\n Número digitado é impar e negativo.");

		}
		
		
		
	}

}
