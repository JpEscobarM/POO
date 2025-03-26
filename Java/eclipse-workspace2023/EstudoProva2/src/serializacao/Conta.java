package serializacao;

import java.io.Serializable;

public class Conta implements Serializable {
	public String nome;
	public String cpf;
	private Double saldo;
	
	
	public Conta() {
		
	}
	public Conta(String nome, String cpf, Double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.setSaldo(saldo);
		
	}
	public Double getSaldo() {
		return saldo;
	}
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", cpf=" + cpf + ", saldo=" + saldo + "]";
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
}
