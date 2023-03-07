package br.com.fernandoribeira.java.io.teste;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String nome = "Fernando";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(nome);
		oos.close();
	}
}
