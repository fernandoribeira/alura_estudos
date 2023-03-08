package br.com.fernandoribeira.teste;

import br.com.fernandoribeira.model.Aluno;
import br.com.fernandoribeira.model.Aula;
import br.com.fernandoribeira.model.Curso;

public class TesteMap {
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
		
		Aluno a = javaColecoes.buscaMatriculado(123456);
		System.out.println(a);
		
		System.out.println();
		
	}
}
