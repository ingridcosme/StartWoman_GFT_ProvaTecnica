package com.gft.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor, digite um número de 4 dígitos: ");
		int numero = input.nextInt();
		
		while(numero < 1000 || numero > 9999) {
			System.out.println("Por favor, digite um número de 4 dígitos: ");
			numero = input.nextInt();
		}
		
		int quantidadePares = contarPares(numero);
		System.out.println("Quantidade de pares: " + quantidadePares);
		
		input.close();

	}
		
	public static int contarPares(int entrada) {
		if(entrada == 0) {
			return 0;
		} else {
			int resto = entrada % 10;
			entrada = entrada / 10;
			int cont = 0;
			if(resto % 2 == 0) {
				cont++;
			}
			return cont + contarPares(entrada);
		}
	}

}
