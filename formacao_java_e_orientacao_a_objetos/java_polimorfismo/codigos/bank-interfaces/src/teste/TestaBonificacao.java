package teste;
import model.Designer;
import model.EditorVideo;
import model.Funcionario;
import model.Gerente;
import util.ControleBonificacao;

public class TestaBonificacao {
	public static void main(String[] args) {
		
//		Funcionario f = new Funcionario();
//		Gerente g = new Gerente();
//		Designer d = new Designer();
//		EditorVideo v= new EditorVideo();
		
		//Funcionario f = new Funcionario();
		Funcionario g = new Gerente();
		Funcionario d = new Designer();
		Funcionario v= new EditorVideo();
		
//		Funcionario f = new Funcionario();
//		Gerente g = new Funcionario();
//		Designer d = new Funcionario();
//		EditorVideo v= new Funcionario();
		
		//f.setSalario(1000.0); // 10%            = $100
		g.setSalario(1000.0); // 1 salario        = $1000
		d.setSalario(1000.0); // $150             = $150
		v.setSalario(1000.0); // $300             = $300
		
		ControleBonificacao cb = new ControleBonificacao();
		//cb.registraFuncionario(f);
		cb.registraFuncionario(g);
		cb.registraFuncionario(d);
		cb.registraFuncionario(v);
		
		System.out.println(cb.getSoma());
		
	}
}
