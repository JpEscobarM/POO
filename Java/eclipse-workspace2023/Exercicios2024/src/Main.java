import java.util.Scanner;

/*
 * 
 * Exercício inicial

Elabore um programa para gerar e escrever os 5 primeiros números perfeitos. Um número perfeito é aquele que é igual à soma dos seus divisores (exceto o próprio número).

Ex: 

6 = 1+2+3 

28 = 1+2+4+7+14
 * 
 * */

public class Main {

	public static boolean ePerfeito(int numero) {

		int soma = 0;

		for (int i = 0; i < numero; i++) {
			if (numero % i == 0) {
				soma = soma + i;
			}

			if (numero == soma) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {

		int[] numerosPerfeitos = new int[5];
		int count = 0;
		int numero = 1;

		while (count < 5) {

			boolean verificaNumero = ePerfeito(numero);

			if (verificaNumero) {

				numerosPerfeitos[count] = numero;
				count++;
			}
			numero++;

		}

		for (int i = 0; i < count; i++) {
			System.out.println(numerosPerfeitos[i]);
		}

	}
}
