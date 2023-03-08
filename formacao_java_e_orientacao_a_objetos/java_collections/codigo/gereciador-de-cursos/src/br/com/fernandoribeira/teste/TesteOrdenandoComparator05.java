package br.com.fernandoribeira.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteOrdenandoComparator05 {
	public static void main(String[] args) {
		
		// Declarando aulas
		String aula1 = "Modelando a classe aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		// Criando lista
		ArrayList<String> aulas = new ArrayList<>();
		
		// Adicionando aulas
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		// Ordenando aulas com "Comparator" em expressão lambada direto no método "sort"
		System.out.print("Antes de ordenar: ");
		System.out.println(aulas);
		aulas.sort((String a1, String a2) -> a1.compareTo(a2));		
		System.out.print("Depois de ordenar: ");
		System.out.println(aulas);
		
	}
}
