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
		
		ContaImpl 
		cc = new ContaCorrente(thaiza);
		ContaImpl cp = new ContaPoupanca(thaiza);
		
//      UTILIZANDO A CONTA
		cc.depositar(100);
		cp.depositar(300.00);
		cp.transferir(150.00, cc);
		cc.pagamento(200, "10293920389302");
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
