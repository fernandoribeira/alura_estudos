
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeContas;
	
	public Conta(int agencia, int numero, Cliente titular) {
		Conta.totalDeContas++;
		this.saldo = 0.0;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta conta) {
		if (this.saca(valor)) {
			conta.deposita(valor);
			return true;
		}
		return false;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
}
