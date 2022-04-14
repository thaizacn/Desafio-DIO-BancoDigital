package br.com.dominios;

import br.com.servicos.impl.ContaImpl;

public class ContaPoupanca extends ContaImpl{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" ==== Extrato Conta Poupança ==== ");
		super.dadosImpressao();
	}
}
