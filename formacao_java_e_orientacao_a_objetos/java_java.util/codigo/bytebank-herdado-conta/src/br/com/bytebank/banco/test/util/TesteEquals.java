package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteEquals {
	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(1, 1);
		Conta cc2 = new ContaCorrente(1, 2);
		Conta cc3 = new ContaCorrente(1, 1);

		boolean cc1IgualCC2 = cc1.equals(cc2);
		System.out.println(cc1IgualCC2);
		
		boolean cc1IgualCC3 = cc1.equals(cc3);
		System.out.println(cc1IgualCC3);
		
	}
}
