package br.com.fernandoribeira.teste;

import java.util.HashMap;
import java.util.Map;

import br.com.fernandoribeira.model.Aluno;

public class TesteIterandoMap {
	public static void main(String[] args) {
		
		Map<Integer, String> nomes = new HashMap<>();
		
		nomes.put(1, "Fernando");
		nomes.put(2, "Bolacha");
		nomes.put(3, "Minhoca");
		nomes.put(4, "Gabriel");
		nomes.put(5, "Caminhao");
		
		System.out.println(nomes);
		
		Map<Integer, Aluno> alunos = new HashMap<>();
		
		alunos.put(1, new Aluno());
		alunos.put(2, new Aluno());
		alunos.put(3, new Aluno());
		alunos.put(4, new Aluno());
		alunos.put(5, new Aluno());
				
		System.out.println(alunos);

		// Percorrendo mapa com "foreach" (chaves)
		for (Integer key : nomes.keySet()) {
		    System.out.println("Chave: " + key);
		}
		
		// Percorrendo mapa com "foreach" (valores)
		for (String value : nomes.values()) {
		    System.out.println("Valor: " + value);
		}
		
		// Percorrendo mapa com "foreach" (chave-valor)
		for (Map.Entry<Integer, String> entry : nomes.entrySet()) {
		    System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
		}
		
		// Percorrendo mapa com "foreach" (expressão lambda, chaves)
		nomes.keySet().forEach(key -> System.out.println("Chave: " + key));
		
		// Percorrendo mapa com "foreach" (expressão lambda, valores)
		nomes.values().forEach(value -> System.out.println("Valor: " + value));

		// Percorrendo mapa com "foreach" (expressão lambda, chave-valor)
		nomes.forEach((key, value) -> System.out.println("Chave: " + key + ", Valor: " + value));
		
	}
}





















