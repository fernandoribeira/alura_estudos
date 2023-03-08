package br.com.fernandoribeira.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private Map<Integer,String> comidasPreferidas;
	
	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
		this.comidasPreferidas= new HashMap<>();
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public Map<Integer, String> getComidasPreferidas() {
		return Collections.unmodifiableMap(comidasPreferidas);
	}
	
	public void adicionaComidaPreferida(Integer chave, String valor) {
		this.comidasPreferidas.put(chave, valor);
	}
	
	public void removeComidaPreferida(Integer chave, String valor) {
		this.comidasPreferidas.remove(chave, valor);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", comidasPreferidas=" + comidasPreferidas + "]";
	}
	
}
