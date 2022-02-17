package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
			Infantil A = 5 a 7 anos
			Infantil B = 8 a 11 anos
			Juvenil A = 12 a 13 anos
			Juvenil B = 14 a 17 anos
			Adultos = Maiores de 18 anos
		 */
		
		int age;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\n Informe a idade do nadador: ");
		age = read.nextInt();
		
		
		if (age >= 5 && age <=7 ) {
			System.out.println("\n Nadador na categoria: Infantil A");
			
		} else if (age >= 8 && age <= 11) {
			System.out.println("\n Nadador na categoria: Infantil B");
			
		} else if (age >= 12 && age <= 13) {
			System.out.println("\n Nadador na categoria: Juvenil A");

			
		} else if (age >= 14 && age <= 17) {
			System.out.println("\n Nadador na categoria: Juvenil A");
			
		} else if (age >= 18) {
			System.out.println("\n Nadador na categoria: Adulto");
		
		} else {
			System.out.println("\n Idade informada não esta enquadrada em nenhuma categoria.");
		}
		
				
	}
}
