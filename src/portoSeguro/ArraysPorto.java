package portoSeguro;

import java.util.Scanner;

public class ArraysPorto {

	public static void main(String[] args) {

		float[] media = new float[5];
		String[] nomeAluno = new String[5];
		float n1, n2, n3, somaMedia = 0, mediaGeral;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 0; x<5; x++) {
			
			System.out.println("\n Informe a nota do Aluno " + (x+1));
			
			System.out.println("\n Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			
			while (n1 < 0 || n1 > 10) {
				System.out.println("\n Valor informado invalido, Informe um valor entre 0 a 10: ");
				n1 = leia.nextFloat();
			}
			
			System.out.println("\n Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			
			while (n2 < 0 || n2 > 10) {
				System.out.println("\n Valor informado invalido, Informe um valor entre 0 a 10: ");
				n2 = leia.nextFloat();
			}
			
			System.out.println("\n Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			while (n3 < 0 || n3 > 10) {
				System.out.println("\n Valor informado invalido, Informe um valor entre 0 a 10: ");
				n3 = leia.nextFloat();
			}
		
			media[x] = (n1 + n2 + n3) / 3;
			
			
			if ( media[x] >=7 && media[x] <= 10) {
				System.out.println("\n Aluno Aprovado");
			} else if (media[x] >=5 ) {
				System.out.println("\n Aluno em Recuperação");
			} else {
				System.out.println("\n Aluno Reprovado");
			}
			
			
			
			System.out.println("\n Média: "+ media[x]);			
			
			
			somaMedia += media[x];
			
		}
		
		
		mediaGeral = somaMedia / x;
		
		System.out.println("\n Média Geral: " + mediaGeral);
		

	}

}
