package br.com.fernandoribeira.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.fernandoribeira.model.Aula;

public class TesteListaAulas02 {
	public static void main(String[] args) {
		
		// Declarando as aulas
		Aula aula1 = new Aula("Ordenando listas", 20);
		Aula aula2 = new Aula("Conhecendo mais de listas", 15);
		Aula aula3 = new Aula("Trabalhando com Cursos e Sets", 25);
		Aula aula4 = new Aula("Modelando a classe aula", 5);
		
		// Criando a lista de aulas
		ArrayList<Aula> aulas = new ArrayList<>();
		
		// Adicionando aulas a lista
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		// Criando comparator alternativo por titulo
		Comparator<Aula> comparadorTitulo = new Comparator<Aula>() {
			@Override
			public int compare(Aula aula, Aula outraAula) {
				return aula.getTitulo().compareTo(outraAula.getTitulo());
			}
		};
		
		// Ordenando aulas por titulo
		System.out.println("Aulas antes de ordenar por titulo:");
		aulas.forEach(aula -> System.out.println(aula));
		Collections.sort(aulas, comparadorTitulo);
		System.out.println("Aulas depois de ordenar por titulo:");
		aulas.forEach(aula -> System.out.println(aula));
		System.out.println();
		
		// Criando comparador alternativo por tempo
		Comparator<Aula> comparadorTempo = new Comparator<Aula>() {
			@Override
			public int compare(Aula aula, Aula outraAula) {
				return aula.getTempo().compareTo(outraAula.getTempo());
			}		
		};
		
		// Ordenando aulas por tempo
		System.out.println("Aulas antes de ordenar por tempo:");
		aulas.forEach(aula -> System.out.println(aula));
		Collections.sort(aulas, comparadorTempo);
		System.out.println("Aulas depois de ordenar por tempo:");
		aulas.forEach(aula -> System.out.println(aula));
		System.out.println();
			
	}
}
