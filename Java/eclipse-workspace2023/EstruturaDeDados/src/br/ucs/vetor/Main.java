package br.ucs.vetor;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		vetor[0] = 3;
		vetor[1] = 5;
		vetor[2] = 4;

		
		//System.out.println(vetor);
		
		for(int i = 0 ; i <= 9 ; i ++) {
			//System.out.print(vetor[i]);
			
		}
		
		String[] estados = {"MG","RS","AM","BH","RJ","SP"};
		for(int i=0; i<= 5 ; i++) {
			 
			System.out.println(estados[i] +  " Posição: " + i);
		}
		
		System.out.println("digite a sigla: ");
		String siglaBusca = input.nextLine();
		input.close();
		
		for(int i=0; i<= 5 ; i++) {
				
			if ( siglaBusca.equalsIgnoreCase(estados[i])){
				System.out.println("Estados contém: " + estados[i]);
				break;
			}
			else {
				System.out.println("Erro, "+ siglaBusca +" não encontrado.");
				break;
			}
		}
		
		
	}//main
}
