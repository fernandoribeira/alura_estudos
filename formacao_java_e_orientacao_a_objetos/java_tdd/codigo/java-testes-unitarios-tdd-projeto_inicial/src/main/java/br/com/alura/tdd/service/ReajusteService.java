package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.enums.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		String porcentagemReajuste = "0.00";
		if (desempenho == Desempenho.A_DESEJAR) {
			porcentagemReajuste = "0.03";
		}
		if (desempenho == Desempenho.BOM) {
			porcentagemReajuste = "0.15";
		}
		if (desempenho == Desempenho.OTIMO) {
			porcentagemReajuste = "0.20";
		}
		BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal(porcentagemReajuste));
		funcionario.reajustarSalario(reajuste);
	}

}
