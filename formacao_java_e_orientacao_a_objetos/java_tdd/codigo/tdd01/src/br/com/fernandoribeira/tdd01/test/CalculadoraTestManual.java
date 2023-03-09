package br.com.fernandoribeira.tdd01.test;

import br.com.fernandoribeira.tdd01.model.Calculadora;

public class CalculadoraTestManual {
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		System.out.println(c.soma(0, 0));
		System.out.println(c.soma(1, 2));
		System.out.println(c.soma(1, -2));
		System.out.println(c.soma(-1, 2));
		System.out.println(c.soma(-1, -2));
		
	}
}
