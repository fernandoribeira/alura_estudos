package teste;
import model.Administrador;
import model.Gerente;
import util.SistemaInterno;

public class TestaSistemaInterno {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		
	}
}
