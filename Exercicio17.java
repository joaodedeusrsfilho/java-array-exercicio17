package aula19_Arrays;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		/*
		 * Ler um vetor A com 10 elementos inteiros correspondentes as idades de um
		 * grupo de pessoas. Escreva um programa que determine e escreva a quantidade de
		 * pessoas que possuem idade superior a 35 anos.
		 */
		int[] idades = new int[10];

		Scanner ler = new Scanner(System.in);

		int quantidadeDePessoasComMaisDe35Anos = 0;

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Entre com a idade da pessoa " + (i + 1));
			idades[i] = ler.nextInt();
			if (idades[i] > 35) {
				quantidadeDePessoasComMaisDe35Anos++;
			}
		}
		System.out.print("VetorA = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + ", ");
		}
		System.out.println();
		System.out.println("Pessoa acima de 35 anos = " + quantidadeDePessoasComMaisDe35Anos);
	}
}
