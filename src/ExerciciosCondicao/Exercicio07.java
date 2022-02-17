package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		/*
		 * Receber valores de base e altura de um triângulo e 
		 * verificar se são valores válidos (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a área do triângulo.

		 */
		
		float base = 0, altura = 0, areaTriangulo;
		
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("\n Informe o valor da base do triangulo: ");
		base = read.nextFloat();

		
		while (base <= 0) {
			System.out.println("\n Valor não é valido, Informe um valor válido da base do triangulo: ");
			base = read.nextFloat();
		}
		
		System.out.println("\n Informe o valor da altura do triangulo: ");
		altura = read.nextFloat();

		
		while (altura <= 0) {
			System.out.println("\n Valor não é valido, Informe um valor válido da altura do triangulo: ");
			altura = read.nextFloat();
		}
		
		
		areaTriangulo = (base * altura) / 2;
		
		System.out.printf("\n A Área do Triangulo medindo na base %.2f CM e altura de %.2f CM é de %.2f CM.", base, altura, areaTriangulo);
		
	}

}
