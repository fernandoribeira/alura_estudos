package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteComInterfaceList {
	public static void main(String[] args) {
		
		List<Conta> listaCC = new LinkedList<>();
		
		Conta cc1 = new ContaCorrente(1, 1);
		Conta cc2 = new ContaCorrente(1, 2);

		List<Conta> listaCP = new ArrayList<>();
		
		Conta cp1 = new ContaPoupanca(1, 1);
		Conta cp2 = new ContaPoupanca(1, 2);
		
		listaCC.add(cc1);
		listaCC.add(cc2);
		listaCP.add(cp1);
		listaCP.add(cp2);
		
		System.out.println("Tamanho da listaCC: " + listaCC.size());	
		System.out.println("Dados da listaCC:");
		for (int i = 0; i < listaCC.size(); i++) {
			System.out.println(listaCC.get(i));
		}
		
		System.out.println("Tamanho da listaCP: " + listaCP.size());	
		System.out.println("Dados da listaCP:");
		for (int i = 0; i < listaCP.size(); i++) {
			System.out.println(listaCP.get(i));
		}

		
	}
}
