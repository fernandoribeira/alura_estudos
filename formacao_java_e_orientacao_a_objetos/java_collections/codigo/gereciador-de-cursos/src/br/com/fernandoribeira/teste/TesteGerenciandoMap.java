package br.com.fernandoribeira.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.fernandoribeira.model.Pessoa;

public class TesteGerenciandoMap {
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(new Pessoa("Fernando", 25));
		pessoas.add(new Pessoa("Gabriel", 20));
		pessoas.add(new Pessoa("Bolacha", 18));
		
		System.out.println(pessoas);
		
		//pessoas.get(0).getComidasPreferidas().put(5, "Minhoca");
		
		Map<Integer,String> comidasPreferidasFernando = pessoas.get(0).getComidasPreferidas();
		System.out.println(comidasPreferidasFernando);
		pessoas.get(0).adicionaComidaPreferida(1, "Xuxu");
		pessoas.get(0).adicionaComidaPreferida(2, "Bolacha");
		pessoas.get(0).adicionaComidaPreferida(3, "Bolo");
		System.out.println(comidasPreferidasFernando);
		
	}
}
