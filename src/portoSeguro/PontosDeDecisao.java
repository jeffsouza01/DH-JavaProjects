package portoSeguro;

import java.util.Scanner;

public class PontosDeDecisao {

	public static void main(String[] args) {
		
		String nome;
		float nota1, nota2, nota3, media;
		double raiz;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("\nInforme seu nome");
		nome = scan.nextLine();
		
		System.out.println("\n Digite a primeira nota: ");
		nota1 = scan.nextFloat();
		
		System.out.println("\n Digite a segunda nota: ");
		nota2 = scan.nextFloat();
		
		System.out.println("\n Digite a terceira nota: ");
		nota3 = scan.nextFloat();

		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("\n Sua média total é: %2.2f", media);
		
		
		raiz = Math.sqrt(media); // raiz quadrada
		
		System.out.printf("\nRaiz Quadrada: %f", raiz);

		double potencia;
		
		potencia = Math.pow(media, nota1); //potencia
		
		System.out.println("\nPotencia dos valores: " + potencia);
		
		
		// simbolo % (modulo) calcula o resto da divisao
		

	}

}
