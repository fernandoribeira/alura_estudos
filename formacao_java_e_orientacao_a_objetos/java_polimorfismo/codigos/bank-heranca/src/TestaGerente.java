
public class TestaGerente {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Fernando");
		g.setCpf("123456");
		g.setSalario(2600.0);
		g.setSenha(999);
		
		System.out.println(g.getNome());
		System.out.println(g.getCpf());
		System.out.println(g.getSalario());
		System.out.println(g.getBonificacao());
		System.out.println(g.autentica(999));

	}
}
