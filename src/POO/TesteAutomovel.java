package POO;

public class TesteAutomovel {

	public static void main(String[] args) {

		Automovel auto = new Automovel("Jefferson", "BMW", "JEF2235", 2020);
		
		auto.imprimirInfo();
		System.out.println("\n *****************************");
		System.out.println("\n Transferencia de Proprietário");
		System.out.println("\n *****************************");
		auto.setNomeProprietario("Jamal Diogo");
		auto.imprimirInfo();
	}

}
