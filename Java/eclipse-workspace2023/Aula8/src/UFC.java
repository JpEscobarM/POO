import java.util.Scanner;
public class UFC {
	public static void main(String[] args) {
		Luta ufc1= new Luta();
		Lutador l[] = new Lutador [5]; 
		l[0] = new Lutador("Juliano","Caxias do Sul",23,1.70,65,3,2,0);
		l[1] = new Lutador("Alyson","Uruguaiana",25,1.68,70,2,2,1);
		l[2] = new Lutador("Bruno","Caxias do Sul",22,1.70,69,3,2,2);
		l[3] = new Lutador("Joao","Uruguaiana",20,1.72,70,5,2,0);
		l[4] = new Lutador("Pedro","Caxias do Sul",25,1.70,72,1,4,3);
		
		ufc1.marcarLuta(l[1], l[2]);
		ufc1.lutar();
		
	}
}
