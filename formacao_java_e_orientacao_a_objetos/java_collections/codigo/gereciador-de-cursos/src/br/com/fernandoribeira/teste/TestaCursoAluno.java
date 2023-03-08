package br.com.fernandoribeira.teste;

import br.com.fernandoribeira.model.Aluno;
import br.com.fernandoribeira.model.Aula;
import br.com.fernandoribeira.model.Curso;

public class TestaCursoAluno {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 24));
		
		javaColecoes.matriculaAluno(new Aluno("Fernando", 123456));
		javaColecoes.matriculaAluno(new Aluno("Bolacha", 456123));
		javaColecoes.matriculaAluno(new Aluno("Gabriel", 987123));
		
		System.out.println("Alunos:");
		javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
		
	}
}
