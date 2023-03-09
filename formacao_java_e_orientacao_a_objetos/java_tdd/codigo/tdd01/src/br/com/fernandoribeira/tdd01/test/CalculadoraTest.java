package br.com.fernandoribeira.tdd01.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.fernandoribeira.tdd01.model.Calculadora;


public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.soma(3, 7);
		Assert.assertEquals(10, soma);
	}
	
}
