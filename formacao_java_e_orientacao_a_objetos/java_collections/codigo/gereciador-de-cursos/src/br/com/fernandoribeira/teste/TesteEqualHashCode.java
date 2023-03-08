package br.com.fernandoribeira.teste;

import java.util.HashSet;
import java.util.Set;

import br.com.fernandoribeira.model.Aluno;
import br.com.fernandoribeira.model.Aula;
import br.com.fernandoribeira.model.Curso;

public class TesteEqualHashCode {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 24));
		
		Aluno a1 = new Aluno("Fernando", 123456);
		Aluno a2 = new Aluno("Bolacha", 456123);
		Aluno a3 = new Aluno("Gabriel", 987123);
		
		javaColecoes.matriculaAluno(a1);
		javaColecoes.matriculaAluno(a2);
		javaColecoes.matriculaAluno(a3);
		
		Set<Aluno> alunos = new HashSet<>();
		alunos = javaColecoes.getAlunos();
		
		System.out.println("Alunos:");
		System.out.println(alunos);
		System.out.println();

		System.out.println("Aluno " + a1.getNome() + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		System.out.println();
		
		Aluno a4 = new Aluno("Fernando", 123456);
		
		System.out.println("E este aluno " + a4.getNome() + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a4));
		System.out.println();
		
		System.out.println(a1.equals(a4));
		System.out.println(a1.hashCode() == a4.hashCode());
		
	}
}
