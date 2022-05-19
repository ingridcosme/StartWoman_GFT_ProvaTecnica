package com.gft.exercicio3;

import java.util.Iterator;
import java.util.List;

public class Caixa {

	public void calcularTotal(List<Produto> produtos) {
		double total = 0.0;
		
		Iterator<Produto> iterator = produtos.iterator();
		while(iterator.hasNext()) {
			Produto next = iterator.next();
			System.out.println("\nNome: " + next.getNome());
			System.out.println("Quantidade: " + next.getQuantidade());
			System.out.println("Valor unitário: " + next.getValor());
			System.out.println("Valor total: " + next.calcularValorFinal());
			
			total += next.getValor();
		}
		
		System.out.println("\nTOTAL: R$ " + total);
	}
}
