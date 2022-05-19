package com.gft.exercicio3;

public class Produto {
	
	protected String nome;
	protected double valor;
	protected int quantidade;
	
	public double calcularValorFinal() {
		double total = this.quantidade * this.valor;
		double imposto = 1.10; // acréscimo de 10%
		return total * imposto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}
	
}
