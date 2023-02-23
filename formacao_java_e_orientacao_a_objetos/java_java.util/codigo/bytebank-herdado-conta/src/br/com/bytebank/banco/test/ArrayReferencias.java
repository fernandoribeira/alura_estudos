package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class ArrayReferencias {
	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		ContaCorrente cc1 = new ContaCorrente(111, 222);
		ContaCorrente cc2 = new ContaCorrente(333, 444);
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println(contas[1].getNumero());
		
		System.out.println();
		// -------------------------------------
		
		Conta[] contasGenericas = new Conta[5];
		ContaCorrente cc3 = new ContaCorrente(555, 666);
		ContaPoupanca cp1 = new ContaPoupanca(777, 888);
		contasGenericas[0] = cc3;
		contasGenericas[1] = cp1;
		
		System.out.println(contasGenericas[0].getAgencia());
		System.out.println(contasGenericas[1].getAgencia());
		
		System.out.println();
		// -------------------------------------
		
		Object[] itensGenericos = new Object[5];
		Cliente cliente = new Cliente();
		itensGenericos[0] = cc1;
		itensGenericos[1] = cc2;
		itensGenericos[2] = cc3;
		itensGenericos[3] = cp1;
		itensGenericos[4] = cliente;
		
		ContaCorrente ccNova = (ContaCorrente) itensGenericos[0];
		ContaPoupanca cpNova = (ContaPoupanca) itensGenericos[3];
		Cliente clienteNovo = (Cliente) itensGenericos[4];
		clienteNovo.setNome("Fernando");
		
		System.out.println(ccNova.getAgencia());
		System.out.println(cpNova.getAgencia());
		System.out.println(clienteNovo.getNome());
		
	}
}
