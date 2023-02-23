package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;
import br.com.bytebank.banco.model.GuardadorDeObjetos;

public class TesteGuardadorDeObjetos {
	public static void main(String[] args) {
		
		GuardadorDeObjetos guardador = new GuardadorDeObjetos(5);
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		ContaPoupanca cp = new ContaPoupanca(333, 444);
		Cliente c = new Cliente();
		
		guardador.adicionaObjeto(cc);
		guardador.adicionaObjeto(cp);
		guardador.adicionaObjeto(c);
		
		System.out.println(guardador.quantidadeDeItens());
		ContaCorrente ccNova = (ContaCorrente) guardador.devolveObjeto(0);
		System.out.println(ccNova.getAgencia());
	}
}
