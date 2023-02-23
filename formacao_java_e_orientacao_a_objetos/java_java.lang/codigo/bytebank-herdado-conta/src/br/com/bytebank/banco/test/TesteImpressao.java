package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteImpressao {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		ContaPoupanca cp = new ContaPoupanca(333, 444);
		
		System.out.println(cc);
		System.out.println(cp);
		
	}
}
