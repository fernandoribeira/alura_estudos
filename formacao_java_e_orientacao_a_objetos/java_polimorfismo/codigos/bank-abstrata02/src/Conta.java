
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
		
	public Conta(int agencia, int numero) {
		this.saldo = 0.0;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = null;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public abstract void deposita(double valor);
	
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
	
}
