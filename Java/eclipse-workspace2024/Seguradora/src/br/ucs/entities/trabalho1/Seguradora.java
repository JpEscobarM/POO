package br.ucs.entities.trabalho1;

public class Seguradora {

	private Cliente[] listaClientes = new Cliente[100];
	private int qtdCliente= 0;
	
	private Seguro[] listaSeguros = new Seguro[100];
	private int qtdSeguro = 0 ;
	
	
	
	//GETTERS AND SETTERS
	
	public int getQtdClientes() {
		return this.qtdCliente;
	}
	
	public int getQtdSeguro() {
		return qtdSeguro;
	}
	
	public void setQtdSeguro(int qtdSeguro) {
		this.qtdSeguro = qtdSeguro;
	}
	
	public Cliente getCliente(int pos) {
		
		if(pos <= this.qtdCliente) {
			return listaClientes[pos];
		}
		
		return null;
	}
	
	public Seguro getSeguro(int pos) {
		
		if(pos<= this.qtdSeguro) {
			return listaSeguros[pos];
		}
		return null;
	}
	
	//METODOS
	
	public boolean verificaCadastro(Cliente c) {
		
		for (int i=0 ; i <this.qtdCliente; i++) {
			if(c.getCpf().equalsIgnoreCase(listaClientes[i].getCpf())) {
				return true;
			}
		}
		
		return false;
	}
	public int  adicionaCliente(Cliente cli) {
		
		if( qtdCliente < 100 && this.verificaCadastro(cli) == false ) {
		
			this.listaClientes[qtdCliente++] = cli;
		return 1;
		
		}
		
		return 0;
	}
		public int  adicionaSeguro(Seguro seg) {
		
		if( this.qtdSeguro < 100 ) {
		
			this.listaSeguros[qtdSeguro++] = seg;
		return 1;
		
		}
		
		return 0;
	}
	public Cliente buscaPorCpf(String cpfBusca) {
		
		for(int i = 0 ; i <this.qtdCliente ; i++) {
			
			if(this.listaClientes[i].getCpf().equalsIgnoreCase(cpfBusca)) {
				return this.listaClientes[i];
			}
			
		}
		
		return null;
	}
	
	
	
}
