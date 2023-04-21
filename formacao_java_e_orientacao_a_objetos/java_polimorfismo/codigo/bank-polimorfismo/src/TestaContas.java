
public class TestaContas {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1, 10);
		cc.deposita(100.0);
		System.out.println("Saldo CC: " + cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(1, 20);
		cp.deposita(200.0);
		System.out.println("Saldo CP: " + cp.getSaldo());
		
		cc.transfere(10.0, cp);
		System.out.println("Transferindo $10 da CC para CP");
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		
		
	}
}
