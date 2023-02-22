package teste;

import exception.SaldoInsuficienteException;
import model.Conta;
import model.ContaCorrente;

public class TesteSaca {
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(111, 222);
		cc.deposita(100.0);
		System.out.println("CC saldo: " + cc.getSaldo());
		
		System.out.println("Sacando 100...");
		try {
			cc.saca(100.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("CC saldo: " + cc.getSaldo());
		
	}
}
