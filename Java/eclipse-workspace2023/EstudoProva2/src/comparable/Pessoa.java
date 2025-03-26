package comparable;

public class Pessoa implements Comparable<Pessoa>{
	
	private long id;
	
	private String nome;

	
	public Pessoa(String nome, long id) {
		this.nome = nome;
		this.id = id;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long n) {
		this.id = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int compareTo(Pessoa pessoa) {
		if (this.getId() < pessoa.getId()) {
			
			return -1;
		}
		if (this.getId()> pessoa.getId()) {
			return 1;
		}
		return 0;	
	}
	
	public String toString() {
		return this.nome + this.id;
	}
	
}
