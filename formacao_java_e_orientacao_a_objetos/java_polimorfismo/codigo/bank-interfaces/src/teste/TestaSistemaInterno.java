package teste;
import interfaces.Autenticavel;
import model.Administrador;
import model.Cliente;
import model.Fiscal;
import model.Gerente;
import util.SistemaInterno;

public class TestaSistemaInterno {
	public static void main(String[] args) {
		
		Autenticavel g = new Gerente();
		g.setSenha(2222);
		
		Autenticavel adm = new Administrador();
		adm.setSenha(3333);
		
		Autenticavel c = new Cliente();
		c.setSenha(2222);
		
		Autenticavel f = new Fiscal();
		f.setSenha(4444);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(c);
		si.autentica(f);
		
	}
}
