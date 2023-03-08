package br.com.fernandoribeira.teste;

import java.util.List;

import br.com.fernandoribeira.model.Aula;
import br.com.fernandoribeira.model.Curso;

public class TesteCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(aulas);
		
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 24));
		
		System.out.println(aulas);
		
	}
}
