package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Solicitar a idade de várias pessoas e imprimir: 
		// Total de pessoas com menos de 21 anos. 
		// Total de pessoas com mais de 50 anos. 
		// O programa termina quando idade for =-99. (WHILE)
		
		int idade = 0, count21 = 0, count50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		while (idade != -99) {
		
			System.out.println("\n Informa a idade: (Digite -99 para sair)");
			idade = leia.nextInt();
			
			if (idade >= 50 ) {
				count50++;
			} else if (idade <= 21 && idade != -99) {
				count21++;
			}
		}
		
		System.out.printf("\n Foram informadas %d pessoas com idade inferior à 21 anos.", count21);
		System.out.printf("\n Foram informadas %d pessoas com idade superior à 50 anos.", count50);

	}

}
