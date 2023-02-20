package model;

import interfaces.Autenticavel;
import util.Autenticador;

public class Gerente extends Funcionario implements Autenticavel {
	
private Autenticador autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticador();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.autentica(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
	
}
