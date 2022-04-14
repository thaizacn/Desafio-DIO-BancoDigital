package br.com.servicos.impl;

import br.com.dominios.Cliente;
import br.com.servicos.Conta;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ContaImpl implements Conta{

	protected static int SEQUENCIAL = 1;
	private String chavePix;
	protected static final int AGENCIA_PADRAO = 3397;
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	
	public ContaImpl(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
//      o "+=" significa que saldo é igual a ele mesmo - valor.
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	
	@Override
	public void transferir(double valor, ContaImpl contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void pagamento(double valor, String codigoDeBarras) {
//      PAGAMENTO DE CONTAS A PARTIR DO CÓDIGO DE BARRAS
		this.sacar(valor);
		System.out.println(" **** PAGAMENTO REALIZADO COM SUCESSO ****");
		System.out.println("Imprima um novo extrato para saber mais");
	}
	
	protected void dadosImpressao() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Numero da conta: %d", this.conta));
		System.out.println(String.format("Saldo: %f", this.saldo));
	}
}
