import java.util.Scanner;

public class Fibonacci {
	
	
	
	
	public static void main(String[] args) {
		
	int anterior1=1, anterior2=0,contador;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Deseja escrever quantos números da série de fibbonacci?: ");
		contador=input.nextInt();
		
		
		System.out.print(anterior2 +" "+ anterior1);
		
		int atual = anterior1+anterior2;
		
		
	
		
		for(int i=3; i < contador; i++) {
		
			System.out.print(" "+atual);
			anterior2 = anterior1;
			anterior1=atual;
			
			atual = anterior1+anterior2;
			
	
		
		
		
		}
		
	}
}
