package br.com.fernandoribeira.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		
		
		// Codigo com classes especificas
		FileOutputStream fos = new FileOutputStream("loremNovoClassesEspecificas.txt"); // Criando fluxo concreto com arquivo (formato binario)
		OutputStreamWriter osw = new OutputStreamWriter(fos); // Transformando os dados caracteres para binarios
		BufferedWriter bw = new BufferedWriter(osw); // Efetuando gravação linha por linha
		
		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		bw.newLine();
		bw.newLine();
		bw.write("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		bw.newLine();
		
		bw.close();
		
		// Codigo com classes genericas
		OutputStream os = new FileOutputStream("loremNovoClassesGenericas.txt"); // Criando fluxo concreto com arquivo (formato binario)
		Writer w = new OutputStreamWriter(os); // Transformando os dados caracteres para binarios
		bw = new BufferedWriter(w); // Efetuando gravação linha por linha
		
		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		bw.newLine();
		bw.newLine();
		bw.write("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		bw.newLine();
		
		bw.close();
		
	}
}
