package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.enums.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Fernando", LocalDate.now(), new BigDecimal("100.00"));
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("103.00"), funcionario .getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Fernando", LocalDate.now(), new BigDecimal("100.00"));
		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("115.00"), funcionario .getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Fernando", LocalDate.now(), new BigDecimal("100.00"));
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("120.00"), funcionario .getSalario());
	}
	
}
