package br.com.testando;

import br.com.dominios.Cliente;
import br.com.dominios.ContaCorrente;
import br.com.dominios.ContaPoupanca;
import br.com.servicos.impl.ContaImpl;

public class PrimeiroCliente {
	
	public static void main(String[]args) {
//      COMPONDO A CONTA
		Cliente thaiza = new Cliente();
		thaiza.setNome("Thaiza");
		thaiza.setDocumento(123456789);
		
		ContaImpl PrimeiraContaCorrente = new ContaCorrente(thaiza);
		ContaImpl PrimeiraContaPoupanca = new ContaPoupanca(thaiza);
		
//      UTILIZANDO A CONTA

		PrimeiraContaCorrente.depositar(100);
		
		PrimeiraContaCorrente.imprimirExtrato();
		
		PrimeiraContaPoupanca.depositar(200);
		PrimeiraContaPoupanca.transferir(150, PrimeiraContaCorrente);
		
		PrimeiraContaPoupanca.imprimirExtrato();

	}

}
