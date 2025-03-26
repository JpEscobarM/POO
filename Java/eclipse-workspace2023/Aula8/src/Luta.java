import java.util.Random;
public class Luta {
	private Lutador desafiando;
	private Lutador desafiado;
	private int rounds;
	private boolean aprovada;
	
//getters and setters
	public Lutador getDesafiando() {
		return desafiando;
	}
	public void setDesafiando(Lutador a) {
		this.desafiando = a;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setRounds(int rounds) {
		this.rounds =rounds;
	}
	public int getRounds() {
		return rounds;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	public boolean getAprovada() {
		return this.aprovada;
	}
//Metodos:
	
	public void marcarLuta(Lutador desafiante,Lutador desafiado) {
		
		if ( desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiante != desafiado) {
			//if ( desafiante != desafiado) {
			this.setDesafiando(desafiante);
			this.setDesafiado(desafiado);
				this.setAprovada(true);
			}
		
		else {
			this.setAprovada(false);
			this.desafiado = null;
			this.desafiando = null;
		}
}
	//Marcaluta
	public void lutar() {
		if (this.getAprovada()) {
			System.out.println("----------DESAFIANTE----------");
			this.desafiando.apresentar();
			System.out.println("---------DESAFIADO----------");
			this.desafiado.apresentar();
			int vencedor=0;
			Random aleatorio = new Random();
			 vencedor = aleatorio.nextInt(3); // 0, 1 , 2
			switch ( vencedor ) {
			case 0: //Empate
				this.desafiado.setEmpates(desafiado.getEmpates()+1);
				this.desafiando.setEmpates(desafiado.getEmpates()+1);
				System.out.println("A luta foi empatada!");
				break;
				
			case 1:// desafiante vence
				this.desafiando.setVitorias(desafiando.getVitorias()+1);
				System.out.println("O desafiante "+this.desafiando.getNome() +" venceu!");
				break;
			case 2:
				this.desafiado.setVitorias(desafiado.getVitorias()+1);
				System.out.println("o desafiado " + this.desafiado.getNome() + " venceu!");
				break;
			
			default:
				
			}
		}
		else {
			System.out.println("Luta não pode acontecer");
		}
	}
	
}//clsse
