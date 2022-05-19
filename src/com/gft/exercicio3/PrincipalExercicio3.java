package com.gft.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class PrincipalExercicio3 {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();

		Produto ventiladorElet = new Eletronico();
		ventiladorElet.setNome("Ventilador");
		ventiladorElet.setQuantidade(3);
		ventiladorElet.setValor(320.00);
		produtos.add(ventiladorElet);
		
		Produto computadorElet = new Eletronico();
		computadorElet.setNome("Computador");
		computadorElet.setQuantidade(2);
		computadorElet.setValor(3999.00);
		produtos.add(computadorElet);
		
		Produto mesaMov = new Movel();
		mesaMov.setNome("Mesa");
		mesaMov.setQuantidade(2);
		mesaMov.setValor(270.00);
		produtos.add(mesaMov);
		
		Produto cadernoProd = new Produto();
		cadernoProd.setNome("Caderno");
		cadernoProd.setQuantidade(10);
		cadernoProd.setValor(10.50);
		produtos.add(cadernoProd);
		
		Produto cadeiraMov = new Movel();
		cadeiraMov.setNome("Cadeira");
		cadeiraMov.setQuantidade(2);
		cadeiraMov.setValor(234.25);
		produtos.add(cadeiraMov);
		
		Produto canetaProd = new Produto();
		canetaProd.setNome("Caneta");
		canetaProd.setQuantidade(15);
		canetaProd.setValor(0.70);
		produtos.add(canetaProd);
		
		Caixa caixa = new Caixa();
		caixa.calcularTotal(produtos);

	}

}
