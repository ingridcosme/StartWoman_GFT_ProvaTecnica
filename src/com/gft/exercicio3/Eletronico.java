package com.gft.exercicio3;

public class Eletronico extends Produto {

	@Override
	public double calcularValorFinal() {
		double total = super.quantidade * super.valor;
		double imposto = 1.15; // acr�scimo de 15%
		return total * imposto;
	}
	
}
