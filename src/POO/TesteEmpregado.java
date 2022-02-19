package POO;

public class TesteEmpregado {

	public static void main(String[] args) {

		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Jefferson da Silva", 5000);
		lista[1] = new Empregado("Adriana Maria", 4000);
		lista[2] = new Empregado("Monique Lima", 2000);
	
	
		for (Empregado roda:lista) {
			
			roda.imprimir();
		}
	
		System.out.println("\n *******************");
	
		for (Empregado roda:lista) {
			
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

	
}
