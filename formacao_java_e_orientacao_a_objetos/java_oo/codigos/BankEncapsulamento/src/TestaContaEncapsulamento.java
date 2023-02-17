
public class TestaContaEncapsulamento {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setAgencia(123);
		conta.setNumero(456);
		conta.setTitular(new Cliente());
		conta.getTitular().setCpf("789");
		conta.getTitular().setNome("Fernando");
		conta.getTitular().setProfissao("Programador");
		conta.deposita(500);
		conta.saca(100);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		System.out.println(conta.getSaldo());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
