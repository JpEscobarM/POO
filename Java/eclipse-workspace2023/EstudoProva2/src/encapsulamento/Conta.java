package encapsulamento;
import java.io.Serializable;

public class Conta implements Serializable{
	private String nome;
	private String cpf;
	private double saldo;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta() {
		
	}
	public Conta(String nome, String cpf, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
		
	}
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", cpf=" + cpf + ", saldo=" + saldo + "]";
	}
	
	
}
