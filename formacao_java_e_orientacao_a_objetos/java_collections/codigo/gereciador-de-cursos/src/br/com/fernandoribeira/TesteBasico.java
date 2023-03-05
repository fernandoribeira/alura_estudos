package br.com.fernandoribeira;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteBasico {
	public static void main(String[] args) {
		
		// Declarando aulas
		String aula1 = "Modelando a classe aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		String aula4 = "Aula que será removida";
		
		// Criando lista
		ArrayList<String> aulas = new ArrayList<>();
		
		// Adicionando aulas
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		// Mostrando aulas
		System.out.println(aulas);
		System.out.println();
		
		// Removendo aula
		aulas.remove(3);
		
		// Mostrando aula individual
		System.out.println(aulas.get(2));
		System.out.println();
		
		// Mostrando aulas
		System.out.println(aulas);
		System.out.println();
		
		// Percorrendo listas com "for"
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}
		System.out.println();
		
		// Percorrendo listas com "enhanced for"
		for (String aula : aulas) {
			System.out.println(aula);
		}
		System.out.println();
		
		// Percorrendo listas com "foreach"
		aulas.forEach(aula -> System.out.println(aula));
		System.out.println();
		
		// Ordenando aulas com "Collections"
		System.out.print("Antes de ordenar: ");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.print("Depois de ordenar: ");
		System.out.println(aulas);
		
	}
}
