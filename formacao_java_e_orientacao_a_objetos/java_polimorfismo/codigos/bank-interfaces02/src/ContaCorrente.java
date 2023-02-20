
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		valor += 0.20;
		return super.saca(valor);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

}
