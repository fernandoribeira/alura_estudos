package br.com.fernandoribeira.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas;
	private Set<Aluno> alunos;
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
		this.aulas = new ArrayList<Aula>();
		this.alunos = new HashSet<>();
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public void adiciona(Aula aula) {
		aulas.add(aula);
	}
	
	public Integer getTempoTotal() {
		Integer tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	public void matriculaAluno(Aluno aluno) {
		alunos.add(aluno);
	}	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Curso: ");
		sb.append(nome);
		sb.append(", instrutor: ");
		sb.append(instrutor);
		sb.append(", tempo total de ");
		sb.append(getTempoTotal());
		sb.append(" minutos\n");
		sb.append("Aulas:\n");
		sb.append(aulas);	
		return sb.toString();
	}
	
}
