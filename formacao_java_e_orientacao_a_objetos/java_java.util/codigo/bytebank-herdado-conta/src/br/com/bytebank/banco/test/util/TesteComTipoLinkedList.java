package br.com.bytebank.banco.test.util;

import java.util.LinkedList;

import br.com.bytebank.banco.model.ContaCorrente;

public class TesteComTipoLinkedList {
	public static void main(String[] args) {
		
		LinkedList<ContaCorrente> lista = new LinkedList<ContaCorrente>();
		
		ContaCorrente cc1 = new ContaCorrente(1, 1);
		ContaCorrente cc2 = new ContaCorrente(1, 2);
		ContaCorrente cc3 = new ContaCorrente(1, 3);
		ContaCorrente cc4 = new ContaCorrente(1, 4);
		ContaCorrente cc5 = new ContaCorrente(1, 5);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		
		System.out.println("Tamanho da lista: " + lista.size());	
		System.out.println("Dados da lista:");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		lista.remove(1);
		System.out.println();
		
		System.out.println("Tamanho da lista: " + lista.size());	
		System.out.println("Dados da lista:");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		
		lista.add(cc4);
		lista.add(cc5);
		System.out.println("Tamanho da lista: " + lista.size());	
		System.out.println("Dados da lista:");
		for (ContaCorrente conta : lista) {
			System.out.println(conta);
		}
		
	}
}
