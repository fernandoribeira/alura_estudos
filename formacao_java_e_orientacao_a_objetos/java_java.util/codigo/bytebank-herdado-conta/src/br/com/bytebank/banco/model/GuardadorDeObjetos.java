package br.com.bytebank.banco.model;

public class GuardadorDeObjetos {

	private Object[] objetos;
	private int posicao;
	
	public GuardadorDeObjetos(int tamanho) {
		this.objetos = new Object[tamanho];
		this.posicao = 0;
	}
	
	public void adicionaObjeto(Object o) {
		this.objetos[this.posicao] = o;
		this.posicao++;
	}
	
	public Object devolveObjeto(int posicao) {
		return this.objetos[posicao];
	}
	
	public int quantidadeDeItens() {
		return this.posicao;
	}
	
}
