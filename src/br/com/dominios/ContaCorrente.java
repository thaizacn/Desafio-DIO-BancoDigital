package br.com.dominios;

import br.com.servicos.impl.ContaImpl;

public class ContaCorrente extends ContaImpl{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" ==== Extrato Conta Corrente ==== ");
		super.dadosImpressao();
	}
}
