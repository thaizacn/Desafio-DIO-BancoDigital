package br.com.dominios;

import java.util.List;

import br.com.servicos.impl.ContaImpl;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
	
	private String nome;
	
	private static List<ContaImpl> contas;

	public static void main(String args[]) {
		List<ContaImpl> Array = contas;
        System.out.println(Array);
	}

}
