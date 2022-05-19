package com.gft.exercicio2;

public class PrincipalExercicio2 {

	public static void main(String[] args) {
		Hospedagem hospedagem = new Hospedagem();
		hospedagem.setValor(430.00);
		
		HospedagemVIP hospedagemVIP = new HospedagemVIP();
		hospedagemVIP.setValor(430.00);
		hospedagemVIP.setValorAdicional(155.00);
		
		System.out.print("Hospedagem:");
		hospedagem.printValor();
		
		System.out.print("Hospedagem VIP:");
		hospedagemVIP.printValor();
	}

}
