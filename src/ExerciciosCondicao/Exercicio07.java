package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		/*
		 * Receber valores de base e altura de um tri�ngulo e 
		 * verificar se s�o valores v�lidos (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a �rea do tri�ngulo.

		 */
		
		float base = 0, altura = 0, areaTriangulo;
		
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("\n Informe o valor da base do triangulo: ");
		base = read.nextFloat();

		
		while (base <= 0) {
			System.out.println("\n Valor n�o � valido, Informe um valor v�lido da base do triangulo: ");
			base = read.nextFloat();
		}
		
		System.out.println("\n Informe o valor da altura do triangulo: ");
		altura = read.nextFloat();

		
		while (altura <= 0) {
			System.out.println("\n Valor n�o � valido, Informe um valor v�lido da altura do triangulo: ");
			altura = read.nextFloat();
		}
		
		
		areaTriangulo = (base * altura) / 2;
		
		System.out.printf("\n A �rea do Triangulo medindo na base %.2f CM e altura de %.2f CM � de %.2f CM.", base, altura, areaTriangulo);
		
	}

}
