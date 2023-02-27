package br.com.fernandoribeira.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaSimples {
	public static void main(String[] args) throws IOException {
		
		// Codigo com dois objetos
		FileWriter fw = new FileWriter("loreSimples.txt");
		BufferedWriter bw1 = new BufferedWriter(fw);
		
		bw1.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		bw1.newLine();
		bw1.newLine();
		bw1.write("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		bw1.newLine();
		
		bw1.close();
		
		// Codigo com um objeto
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("loreSimples.txt"));
		
		bw2.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		bw2.newLine();
		bw2.newLine();
		bw2.write("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		bw2.newLine();
		
		bw2.close();
		
	}
}
