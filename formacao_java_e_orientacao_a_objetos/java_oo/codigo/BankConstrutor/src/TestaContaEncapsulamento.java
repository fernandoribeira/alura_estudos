
public class TestaContaEncapsulamento {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1234, 5678, new Cliente());
		System.out.println(Conta.getTotalDeContas());
		
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
		
		System.out.println();
		
		Conta conta1 = new Conta(1122, 5566, new Cliente());
		System.out.println(Conta.getTotalDeContas());
		
		Conta conta2 = new Conta(4578, 9865, new Cliente());
		System.out.println(Conta.getTotalDeContas());
		
	}
}
