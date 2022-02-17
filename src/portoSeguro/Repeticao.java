package portoSeguro;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {

		float n1, n2, n3, media, somaMedia = 0, mediaGeral;
		
		Scanner leia = new Scanner(System.in);
		
		
		for (int x = 1; x <= 5; x++) {
			
			System.out.printf("\nAluno %d", x);
			
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			
			while(n1 < 0 || n1 > 10) {
				System.out.println("\nValor incorreto, digite entre 0 a 10.  \nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
			}
			
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			
			while(n2 < 0 || n2 > 10) {
				System.out.println("\nValor incorreto, digite entre 0 a 10.  \nEntre com a segunda nota: ");
				n2 = leia.nextFloat();
			}
			
			
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			while(n3 < 0 || n3 > 10) {
				System.out.println("\nValor incorreto, digite entre 0 a 10.  \nEntre com a terceira nota: ");
				n3 = leia.nextFloat();
			}
			
			
			media = (n1+n2+n3) / 3;
			
			somaMedia = somaMedia + media;
		}
		
		mediaGeral = somaMedia / 5;
		
		System.out.printf("\n A Média geral das notas é: %2.2f", mediaGeral);
	}

}
