package br.com.bytebank.banco.test;

public class TesteObject {
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		idades[0] = 5;
		idades[1] = 9;
		idades[2] = 10;
		idades[3] = 25;
		idades[4] = 8;
		
		System.out.println(idades[3]);
		
		idades[3] = 50;
		
		System.out.println(idades[3]);
		System.out.println(idades.length);
		
		
	}
}
