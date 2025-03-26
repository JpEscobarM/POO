package br.ucs.poo.tratamentoexceções.exercicios;

public class Account {
	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
//contruct:
	public Account() {
		
	}
	
	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	
//metodos:
	public void deposit (double amount) {
		this.setBalance(this.getBalance()+amount);
	}
	public void withdraw (double amount) {
		this.setWithdrawLimit(this.getWithdrawLimit()-amount );
	}
	
	
//getters and setters:
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
}
