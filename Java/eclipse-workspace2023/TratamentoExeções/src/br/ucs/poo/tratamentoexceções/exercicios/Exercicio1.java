package br.ucs.poo.tratamentoexceções.exercicios;

public class Exercicio1 {
	public static void main(String[] args) {
		
	
		System.out.println("inicio do main");
		
		try{metodo1();
		
		}catch(ArrayIndexOutOfBoundsException c) {
			System.out.println("o número de usos excede o tamanho do array");
		}
		System.out.println("fim do main");
	

	}


static void metodo1() {
	System.out.println("inicio do metodo1");
	metodo2();
	System.out.println("fim do metodo1");
}

static void metodo2() {
	System.out.println("inicio do metodo2");
	int i;
	int[] array = new int [10];
	for (  i=0; i<= 15; i++) {
		array[i] = i;
		System.out.println(i);
	}
	System.out.println("fim do metodo2");
}}
