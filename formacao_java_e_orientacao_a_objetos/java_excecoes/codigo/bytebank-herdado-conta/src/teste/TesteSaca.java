package teste;

import model.Conta;
import model.ContaCorrente;

public class TesteSaca {
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(111, 222);
		cc.deposita(100.0);
		System.out.println("CC saldo: " + cc.getSaldo());
		
		System.out.println("Sacando 100...");
		cc.saca(100.0);
		System.out.println("CC saldo: " + cc.getSaldo());
		
	}
}
