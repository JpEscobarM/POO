
public abstract class Pessoa {

	private String nome;
	
	private int idade;
	
	private String registroGeral;
	
	
	public String getNome() {
		
		return this.nome;
	}
	
	public void setNome(String nome) {
		
		this.nome=nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
}
