package portoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {

		String nome;
		int idade = 29;
		float altura;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ola Mundo, em português!");
		
		System.out.println("\nInforme o seu nome: ");
		nome = leia.nextLine(); // que garanta que insira apenas String
		
		System.out.println("\nInforme sua altura: ");
		altura = leia.nextFloat(); // que garanta que insira apenas float
		
		System.out.println("\nMeu nome é "+nome+
				" e tenho "+idade+" anos e minha altura é "+altura+"m");
		
		// utilidade do printf, com o % para usar a string dentro da string que sera escrita
		// usando o %.5f, estou limitando a quantidade de casas decimais.
		System.out.printf("Meu nome é %s e tenho %d e minha altura é %.2fm", nome, idade, altura);
		
		
	}

}
