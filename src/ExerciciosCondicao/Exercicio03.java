package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		/*
		 * Desenvolva um sistema em que:
		   Leia 4 (quatro) números;
		   Calcule o quadrado de cada um;
		   Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		   Caso contrário, imprima os valores lidos e seus respectivos quadrados.

		 */
		
		float val1, val2, val3, val4;
		double num1, num2, num3, num4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o numero a ser realizado o calculo do quadrado: ");
		val1 = leia.nextFloat();
		
		System.out.println("\nInforme o numero a ser realizado o calculo do quadrado: ");
		val2 = leia.nextFloat();
		
		System.out.println("\nInforme o numero a ser realizado o calculo do quadrado: ");
		val3 = leia.nextFloat();
		
		System.out.println("\nInforme o numero a ser realizado o calculo do quadrado: ");
		val4 = leia.nextFloat();
		
		num1 = Math.pow(val1, 2);
		num2 = Math.pow(val2, 2);
		num3 = Math.pow(val3, 2);
		num4 = Math.pow(val4, 2);
		
		if (num3 >= 1000) {
			System.out.println("\n o Valor do 3º item foi maior que 1000, sendo o resultado: " + num3);

		} else {
			System.out.printf("\n o Valor do 1º item %.2f e sua raiz quadrada: %.2f", val1, num1);
			System.out.printf("\n o Valor do 2º item %.2f e sua raiz quadrada: %.2f", val2, num2);
			System.out.printf("\n o Valor do 3º item %.2f e sua raiz quadrada: %.2f", val3, num3);
			System.out.printf("\n o Valor do 4º item %.2f e sua raiz quadrada: %.2f", val4, num4);

		}

		
	}

}
