package br.com.fernandoribeira.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformanceSet {
	public static void main(String[] args) {
		
		long inicio;
		long fim;
		long tempoExecucao;
		
		// Tesrte ArrayList
		Collection<Integer> numerosArrayList = new ArrayList<>();
		System.out.println("Inicio dos testes com ArrayList...");
		inicio = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			numerosArrayList.add(i);
		}
		for (Integer numero : numerosArrayList) {
			numerosArrayList.contains(numero);
		}
		fim = System.currentTimeMillis();
		tempoExecucao = fim - inicio;
		System.out.println("Tempo gasto: " + tempoExecucao);
		
		System.out.println();
		
		Collection<Integer> numerosHashSet = new HashSet<>();
		System.out.println("Inicio dos testes com HashSet...");
		inicio = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			numerosHashSet.add(i);
		}
		for (Integer numero : numerosHashSet) {
			numerosHashSet.contains(numero);
		}
		fim = System.currentTimeMillis();
		tempoExecucao = fim - inicio;
		System.out.println("Tempo gasto: " + tempoExecucao);
		
	}
}
