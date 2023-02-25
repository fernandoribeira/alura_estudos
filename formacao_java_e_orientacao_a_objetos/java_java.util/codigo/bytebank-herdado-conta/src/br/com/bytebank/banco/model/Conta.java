package br.com.bytebank.banco.model;

import java.util.Objects;

/**
 * Classe Conta
 * @
 * @author Fernando
 *
 */
public abstract class Conta extends Object implements Comparable<Conta> {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * Método construtor Conta
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}

	/**
	 * Método abstrato deposita
	 * @param valor
	 */
	public abstract void deposita(double valor);

	/**
	 * Método comum saca
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}

		this.saldo -= valor;
	}

	/**
	 * Método comum transfere
	 * @param valor
	 * @param destino
	 * @throws SaldoInsuficienteException
	 */
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	/**
	 * Método getSaldo
	 * @return
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * Método getNumero
	 * @return
	 */
	public int getNumero() {
		return this.numero;
	}

	/**
	 * Método setNumero
	 * @param numero
	 */
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	/**
	 * Método getAgencia
	 * @return
	 */
	public int getAgencia() {
		return this.agencia;
	}

	/**
	 * Método setAgencia
	 * @param agencia
	 */
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	/**
	 * Método setTitular
	 * @param titular
	 */
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	/**
	 * Método getTitular
	 * @return
	 */
	public Cliente getTitular() {
		return this.titular;
	}

	/**
	 * Método getTotal
	 * @return
	 */
	public static int getTotal() {
		return Conta.total;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Agencia= " + agencia + ", numero= " + numero;
	}

	/**
	 * Método hashCode
	 */
	@Override
	public int hashCode() {
		return Objects.hash(agencia, numero);
	}

	/**
	 * Método equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return agencia == other.agencia && numero == other.numero;
	}
	
	/**
	 * Método compareTo
	 */
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.getSaldo(), outra.getSaldo());
	}
	
}