package com.gft.exercicio2;

public class Hospedagem {
	protected double valor;
	
	public void printValor() {
		System.out.println("R$ "+ this.valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Hospedagem [valor=" + valor + "]";
	}
	
}
