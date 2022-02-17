package ExerciciosRepeticao;

public class Exercicio1 {

	public static void main(String[] args) {
		
// Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)


		int count = 0;
		
		for(int x = 1000; x <= 1999; x++) {
			
			if(x % 11 == 5) {
				count ++;
			}
		}
		
		System.out.println("De 1000 a 1999, " + count + " números que divididos por 11 sobra 5.");
	}

}
