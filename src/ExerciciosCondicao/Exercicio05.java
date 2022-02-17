package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		/*
		 * A Secretaria de Meio Ambiente que controla o �ndice de polui��o 
		 * mant�m 3 grupos de ind�strias que s�o altamente poluentes do meio ambiente. 
		 * 
		 * O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. 
		 * Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas 
		 * a suspenderem suas atividades, 
		 * 
		 * se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo 
		 * s�o intimadas a suspenderem suas atividades, 
		 * 
		 * se o �ndice atingir 0,5 todos os grupos devem ser notificados
		 *  a paralisarem suas atividades. 
		 *  
		 *  Fa�a um sistema que leia o �ndice de polui��o medido e 
		 *  emita a notifica��o adequada aos diferentes grupos de empresas.
		 */
		
		float indPolu;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\n Informe o indice de Polui��o medido: ");
		indPolu = leia.nextFloat();
		
		if (indPolu >= 0.05 && indPolu <= 0.3) {
			System.out.println("\n Indice de polui��o medido esta dentro do estabelecido.");

		} else if (indPolu > 0.3 && indPolu < 0.4) {
			System.out.println("\n Necess�rio intimar o 1� grupo a suspenderem suas atividades");
			
		} else if (indPolu >= 0.4 && indPolu < 0.5) {
			System.out.println("\n Necess�rio intimar o 1� e 2� grupo a suspenderem suas atividades");

			
		} else {
			System.out.println("\n Todos os grupos devem ser notificados a paralisarem suas atividades.");

		}
		
		
		
	}

}
