package br.com.servicos;

import br.com.servicos.impl.ContaImpl;

public interface Conta {
	
	void sacar(double valor);
		
	void depositar(double valor);
		
	void transferir(double valor, ContaImpl contaDestino);
	
	void imprimirExtrato();

} 
