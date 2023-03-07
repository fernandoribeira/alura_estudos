package br.com.fernandoribeira.java.io.teste;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Fernando");
		cliente.setProfissao("Dev");
		cliente.setCpf("123456");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		
		oos.writeObject(cliente);
		oos.close();
		
	}
}
