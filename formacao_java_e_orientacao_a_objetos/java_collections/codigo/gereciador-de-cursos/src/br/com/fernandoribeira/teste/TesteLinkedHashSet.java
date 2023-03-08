package br.com.fernandoribeira.teste;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.fernandoribeira.model.Aluno;

public class TesteLinkedHashSet {
	public static void main(String[] args) {
		
		Set<Aluno> alunos = new LinkedHashSet<>();
		Aluno a1 = new Aluno("Fernando", 123456);
		Aluno a2 = new Aluno("Bolacha", 456123);
		Aluno a3 = new Aluno("Gabriel", 987123);
		Aluno a4 = new Aluno("Caminhao", 565656);
		Aluno a5 = new Aluno("Pomada", 121478);
		Aluno a6 = new Aluno("Minhoca", 325632);
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);
		alunos.add(a6);
		
		System.out.println(alunos);
		
	}
}
