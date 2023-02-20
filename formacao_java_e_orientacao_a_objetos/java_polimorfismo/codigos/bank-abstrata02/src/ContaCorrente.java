
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public boolean saca(double valor) {
		valor += 0.20;
		return super.saca(valor);
	}

}
