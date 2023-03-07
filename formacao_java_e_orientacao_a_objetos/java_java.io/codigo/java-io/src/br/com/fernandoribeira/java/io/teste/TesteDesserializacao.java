package br.com.fernandoribeira.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDesserializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String nome;
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		nome = (String) ois.readObject();
		ois.close();
		
		System.out.println(nome);
	}
}
