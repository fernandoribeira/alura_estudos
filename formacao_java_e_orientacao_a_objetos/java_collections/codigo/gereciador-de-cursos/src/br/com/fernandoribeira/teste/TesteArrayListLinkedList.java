package br.com.fernandoribeira.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayListLinkedList {
	public static void main(String[] args) {
		
		System.out.println("*** ArrayList vs LinkedList ***");
		
		List<Integer> numerosArrayList = new ArrayList<>();
		List<Integer> numerosLinkedList = new LinkedList<>();
		int quantidadeElementos = 2000000;
		
		long tempoArrayList = insereElementos(numerosArrayList, quantidadeElementos);
		long tempoLinkedList = insereElementos(numerosLinkedList, quantidadeElementos);
		
		System.out.println("Inserção de elementos na ArrayList demorou: " + tempoArrayList);
		System.out.println("Inserção de elementos na LinbkedList demorou: " + tempoLinkedList);
		
		tempoArrayList = removePrimeirosElementos(numerosArrayList);
		tempoLinkedList = removePrimeirosElementos(numerosLinkedList);
		
		System.out.println("Remoção de 100 elementos na ArrayList demorou: " + tempoArrayList);
		System.out.println("Remoção de 100 elementos na LinbkedList demorou: " + tempoLinkedList);
		
	}
	
	public static long insereElementos(List<Integer> lista, int quantidade) {
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < quantidade; i++) {
			lista.add(i);
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
	
	public static long removePrimeirosElementos(List<Integer> lista) {
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			lista.remove(0);
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
	
}
