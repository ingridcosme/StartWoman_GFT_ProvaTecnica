package com.gft.exercicio3;

public class Movel extends Produto {

	@Override
	public double calcularValorFinal() {
		double total = super.quantidade * super.valor;
		double imposto;
		if(quantidade < 10) {
			imposto = 1.11; // acréscimo de 11%
		} else {
			imposto = 1.05;  // acréscimo de 5%
		}
		return total * imposto;
	}
	
}
