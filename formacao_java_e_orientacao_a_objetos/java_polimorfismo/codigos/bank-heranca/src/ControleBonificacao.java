
public class ControleBonificacao {

	private double soma;
	
	public void registraFuncionario(Funcionario f) {
		soma += f.getBonificacao();
	}
	
	public double getSoma() {
		return soma;
	}
	
}
