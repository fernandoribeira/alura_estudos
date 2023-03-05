package br.com.fernandoribeira;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaAulas03 {
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
		
		// Ordenando aulas por titulo
		System.out.println("Aulas antes de ordenar por titulo:");
		aulas.forEach(aula -> System.out.println(aula));
		aulas.sort(Comparator.comparing(Aula::getTitulo));
		System.out.println("Aulas depois de ordenar por titulo:");
		aulas.forEach(aula -> System.out.println(aula));
		System.out.println();
		
		// Ordenando aulas por tempo
		System.out.println("Aulas antes de ordenar por tempo:");
		aulas.forEach(aula -> System.out.println(aula));
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println("Aulas depois de ordenar por tempo:");
		aulas.forEach(aula -> System.out.println(aula));
		System.out.println();
			
	}
}
