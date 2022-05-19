package com.gft.exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numero;
		double valorLitro;
		
		while(true) {
			System.out.println("Por favor, digite o tipo de suco (L) LIMÃO ou (T) TAMARINDO: ");
			String textoMaiusculo = input.nextLine().toUpperCase();
		    char letra = textoMaiusculo.charAt(0);

			switch(letra) {
				case 'L':
					System.out.println("Por favor, digite o número de litros vendido de suco de LIMÃO: ");
					numero = Double.parseDouble(input.nextLine());
					System.out.println("Por favor, digite o valor do litro do suco de LIMÃO: ");
					valorLitro = Double.parseDouble(input.nextLine());
					System.out.println("Valor a ser pago: R$ " + calcularValor("L", numero, valorLitro));
					break;
				case 'T':
					System.out.println("Por favor, digite o número de litros vendido de suco de TAMARINDO: ");
					numero = Double.parseDouble(input.nextLine());
					System.out.println("Por favor, digite o valor do litro do suco de TAMARINDO: ");
					valorLitro = Double.parseDouble(input.nextLine());
					System.out.println("Valor a ser pago: R$ " + calcularValor("T", numero, valorLitro));
					break;
			}
		}

	}
	
	public static double calcularValor(String tipo, double litros, double valor) {
		double total = 0;
		
		if(tipo.equals("L")) {
			if(litros <= 2) {
				total = litros * (valor * 0.97);
			} else if(litros > 5) {
				total = litros * (valor * 0.95);
			} else {
				total = litros * valor;
			}
		}
		
		if(tipo.equals("T")) {
			if(litros <= 2) {
				total = litros * (valor * 0.96);
			} else if(litros > 5) {
				total = litros * (valor * 0.94);
			} else {
				total = litros * valor;
			}
		}
		
		return total;
	}
		
	
}
