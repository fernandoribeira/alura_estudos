package br.com.fernandoribeira.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDesserializacaoCliente {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Cliente cliente;

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		cliente = (Cliente) ois.readObject();
		
		System.out.println(cliente.getCpf());
		
		ois.close();
		
	}
}
