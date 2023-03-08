package br.com.fernandoribeira.model;

public class Aluno {

	private String nome;
	private Integer numeroMatricula;
	
	public Aluno(String nome, Integer numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", numeroMatricula=" + numeroMatricula + "]";
	}
	
}
