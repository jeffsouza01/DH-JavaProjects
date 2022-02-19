package POO;

import java.text.NumberFormat;

public class Empregado {

	private String nome;
	private double salario;
	
	
	public Empregado(String nome, double salario) {
		this.setNome(nome);
		this.setSalario(salario);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual /100;
	}
	
	
	public String formatarMoeda() {
		
		// coloca a moeda do pais
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		// indica a quantidade de casas após a virgula
		nf.setMinimumFractionDigits(2);
		
		// formata um valor para uma formatação monetaria
		String formatoMoeda = nf.format(salario);
		
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome + " \t\t" + "Salário: " + this.formatarMoeda());
	}
	
}
