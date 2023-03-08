package br.com.fernandoribeira.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fernandoribeira.model.Aula;
import br.com.fernandoribeira.model.Curso;

public class TesteCursoImutavel {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		List<Aula> aulas = javaColecoes.getAulas();
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 24));
		
		System.out.println(aulas);
		
		List<Aula> aulasImutaveis = new ArrayList<Aula>(aulas);
		Collections.sort(aulasImutaveis);
		System.out.println(aulasImutaveis);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println();
		System.out.println(javaColecoes);
		
	}
}
