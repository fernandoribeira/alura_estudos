
public class TestaConta {
	public static void main(String[] args) {
		
		// Testes basicos da classe Conta
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100.0;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50.0;
		
		System.out.println("a primeira conta tem " + primeiraConta.saldo);
		System.out.println("a segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		System.out.println();
		
		// Testes de métodos da classe Conta

		System.out.println("Ajustando os saldos para 0 de todas as contas");
		primeiraConta.saldo = 0.0;
		segundaConta.saldo = 0.0;
		System.out.println("Saldo da primeiraConta = $ " + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta = $ " + segundaConta.saldo);
		
		System.out.println("Depositando");
		primeiraConta.deposita(500.0);
		segundaConta.deposita(800.0);
		System.out.println("Saldo da primeiraConta = $ " + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta = $ " + segundaConta.saldo);
		
		System.out.println("Sacando");
		primeiraConta.saca(200.0);
		segundaConta.saca(50.0);
		System.out.println("Saldo da primeiraConta = $ " + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta = $ " + segundaConta.saldo);
		
		System.out.println("Transferindo");
		primeiraConta.transfere(25.0, segundaConta);
		System.out.println("Saldo da primeiraConta = $ " + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta = $ " + segundaConta.saldo);
		segundaConta.transfere(80.0, primeiraConta);
		System.out.println("Saldo da primeiraConta = $ " + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta = $ " + segundaConta.saldo);
		
	}
}
