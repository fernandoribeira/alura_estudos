package br.com.fernandoribeira.teste;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Fernando");
		alunos.add("Minhoca");
		alunos.add("Bolacha");
		alunos.add("Caminhão");
		alunos.add("Bicicleta");
		alunos.add("Aviao");
		
		System.out.println();
		
		System.out.println(alunos);

		// Percorrendo listas com "enhanced for"
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println();
		
		// Percorrendo listas com "foreach" (expressão lambda)
		alunos.forEach(aluno -> System.out.println(aluno));
		
		System.out.println();
		System.out.println("Tamanho antes: " + alunos.size());
		alunos.add("Fernando");
		System.out.println("Tamanho depois: " + alunos.size());
		
	}
}
