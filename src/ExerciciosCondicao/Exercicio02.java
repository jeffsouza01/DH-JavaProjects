package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio02 {
	/*
	 * Elabore um sistema que leia as variáveis C e N, respectivamente CODIGO e
	 * NUMERO DE HORAS trabalhadas de um operário. E calcule o salário sabendo-se
	 * que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50
	 * calcule o excesso de pagamento armazenando-o na variável E, caso contrário
	 * zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
	 * No final do processamento imprimir o salário total e o salário excedente.
	 */

	public static void main(String[] args) {

		int C, N;
		float E, salTotal, salExcedent = 0;
		int valExc = 20, horaExc = 50;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nInforme o codigo do trabalhador: ");
		C = leia.nextInt();

		System.out.println("\nInforme o numero de horas trabalhadas: ");
		N = leia.nextInt();
		
		if (N > horaExc) {
			E = N - horaExc;
			salExcedent = E * valExc;
			salTotal = (50 * 10) + salExcedent;
		} else {
			salTotal = N * 10;
		}

		System.out.printf("\n Trabalhador de código: %d", C);
		System.out.printf("\n Foram trabalhadas %d Horas", N);
		System.out.printf("\n O Salário total foi R$ %.2f.", salTotal);
		if (salExcedent > 0) {
			System.out.printf("\n O Salário excedente foi de R$ %.2f.", salExcedent);			
		}
	}

}
