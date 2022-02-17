package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		/*
		 * A Secretaria de Meio Ambiente que controla o índice de poluição 
		 * mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente. 
		 * 
		 * O índice de poluição aceitável varia de 0,05 até 0,25. 
		 * Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas 
		 * a suspenderem suas atividades, 
		 * 
		 * se o índice crescer para 0,4 as industrias do 1º e 2º grupo 
		 * são intimadas a suspenderem suas atividades, 
		 * 
		 * se o índice atingir 0,5 todos os grupos devem ser notificados
		 *  a paralisarem suas atividades. 
		 *  
		 *  Faça um sistema que leia o índice de poluição medido e 
		 *  emita a notificação adequada aos diferentes grupos de empresas.
		 */
		
		float indPolu;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\n Informe o indice de Poluição medido: ");
		indPolu = leia.nextFloat();
		
		if (indPolu >= 0.05 && indPolu <= 0.3) {
			System.out.println("\n Indice de poluição medido esta dentro do estabelecido.");

		} else if (indPolu > 0.3 && indPolu < 0.4) {
			System.out.println("\n Necessário intimar o 1º grupo a suspenderem suas atividades");
			
		} else if (indPolu >= 0.4 && indPolu < 0.5) {
			System.out.println("\n Necessário intimar o 1º e 2º grupo a suspenderem suas atividades");

			
		} else {
			System.out.println("\n Todos os grupos devem ser notificados a paralisarem suas atividades.");

		}
		
		
		
	}

}
