package conjuntos;

import java.util.Objects;

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


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return id == other.id;
	}
	
	

	
	
	
}
