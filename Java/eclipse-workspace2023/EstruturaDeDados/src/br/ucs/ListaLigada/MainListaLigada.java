package br.ucs.ListaLigada;

import java.util.Scanner;

public class MainListaLigada {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ListaLigada listaEstados = new ListaLigada();
		
		
		System.out.println(listaEstados.getTamanho());
		
		listaEstados.adicionar("AC");
		
		System.out.println(listaEstados.getTamanho());
		
		
		
		System.out.println("primeiro estado da lista : " + listaEstados.getPrimeiro().getValor());
		System.out.println("último estado da lista : " + listaEstados.getUltimo().getValor());
	
		listaEstados.adicionar("BH");
		listaEstados.adicionar("CE");
		listaEstados.adicionar("DF");
		listaEstados.adicionar("SP");
		listaEstados.adicionar("RJ");
		System.out.println("primeiro estado da lista : " + listaEstados.getPrimeiro().getValor());
		System.out.println("último estado da lista : " + listaEstados.getUltimo().getValor()); 
		
		System.out.println(listaEstados.getTamanho());
		
		
		System.out.println(listaEstados.get(1).getValor());
		
		System.out.println("digite um ESTADO que deseja remover: ");
		listaEstados.remover(input.nextLine());
		
		System.out.print(listaEstados);
		
	}//main
}
