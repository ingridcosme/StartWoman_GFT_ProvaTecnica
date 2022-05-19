package com.gft.exercicio2;

public class HospedagemVIP extends Hospedagem {
	
	private double valorAdicional;
	
	public double calcularValorHVIP() {
		return super.valor + this.valorAdicional;
	}
	
	@Override
	public void printValor() {
		System.out.println("R$ " + calcularValorHVIP());
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public String toString() {
		return "HospedagemVIP [valorAdicional=" + valorAdicional + "]";
	}

}
