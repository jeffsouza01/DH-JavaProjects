package portoSeguro;

import java.util.Scanner;

public class Repeticao2 {

	public static void main(String[] args) {
		
		int tabuada, x = 1, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor da tabuada que deseja montar: ");
		tabuada = leia.nextInt();
		
		
		do {
			resultado = tabuada * x;
			System.out.println("\n" + tabuada + " X " + x +" = " + resultado);
			x++;
			
		} while ( x <= 10 );
	}

}
