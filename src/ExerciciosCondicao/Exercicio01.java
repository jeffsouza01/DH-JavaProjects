package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* João Papo-de-Pescador, homem de bem, comprou um microcomputador 
		 * para controlar o rendimento diário de seu trabalho. 
		 * Toda vez que ele traz um peso de tomate maior que o estabelecido 
		 * pelo regulamento do estado de São Paulo (50 quilos) 
		 * deve pagar um multa de R$ 4,00 por quilo excedente. 
		 * João precisa que você faça um sistema que 
		 * leia a variável P (peso de tomates) e verifique se há excesso. 
		 * Se houver, gravar na variável E (Excesso) 
		 * e na variável M o valor da multa que João deverá pagar. 
		 * Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		 */

		float P, E, M;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Informe o peso dos tomates (KG): ");
		P = leia.nextFloat();
		
		System.out.printf("\nOlá, seu peixe esta pesando %.2f KG", P);

		if (P > 50) {
			E = P - 50;
			M = E * 4;
			
			System.out.printf("\nExcedeu %.2f KG do limite total estabelecido...", E);
			System.out.printf("\nTerá que pagar a multa de R$ %.2f", M);
			
		}
		
		
	}

}
