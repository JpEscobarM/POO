package br.ucs.entities.academico;

public class Local {
	
	private String nomeBloco;
	private int numeroBloco;
	private Sala[] salas = new Sala[10];
	//CONSTRUTOR
	public Local() {
		this.nomeBloco = "Bloco";
		Sala sala1 = new Sala();
		
		
		for(int i = 0 ; i < 10; i++) {
			sala1.setNomeSala("Sala");
			sala1.setNumero(i);
			salas[i] = sala1;
		}
	}
	
	
	public void setNumeroBloco(int numero) {
		this.numeroBloco = numero;
	}
	
	public String getNomeBloco() {
		return nomeBloco;
	}
	public void setNomeBloco(String bloco) {
		this.nomeBloco = bloco;
	}

	
	
}
