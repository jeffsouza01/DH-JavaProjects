package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador 
		 * para controlar o rendimento di�rio de seu trabalho. 
		 * Toda vez que ele traz um peso de tomate maior que o estabelecido 
		 * pelo regulamento do estado de S�o Paulo (50 quilos) 
		 * deve pagar um multa de R$ 4,00 por quilo excedente. 
		 * Jo�o precisa que voc� fa�a um sistema que 
		 * leia a vari�vel P (peso de tomates) e verifique se h� excesso. 
		 * Se houver, gravar na vari�vel E (Excesso) 
		 * e na vari�vel M o valor da multa que Jo�o dever� pagar. 
		 * Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
		 */

		float P, E, M;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Informe o peso dos tomates (KG): ");
		P = leia.nextFloat();
		
		System.out.printf("\nOl�, seu peixe esta pesando %.2f KG", P);

		if (P > 50) {
			E = P - 50;
			M = E * 4;
			
			System.out.printf("\nExcedeu %.2f KG do limite total estabelecido...", E);
			System.out.printf("\nTer� que pagar a multa de R$ %.2f", M);
			
		}
		
		
	}

}
