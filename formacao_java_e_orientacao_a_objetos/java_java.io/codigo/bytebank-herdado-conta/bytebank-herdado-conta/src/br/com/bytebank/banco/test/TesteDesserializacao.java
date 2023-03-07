package br.com.bytebank.banco.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDesserializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ContaCorrente cc;

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		cc = (ContaCorrente) ois.readObject();
		
		System.out.println(cc);
		System.out.println(cc.getTitular().getCpf());
		
		ois.close();
		
	}
}
