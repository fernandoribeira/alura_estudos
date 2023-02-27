package br.com.fernandoribeira.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiaArquivo {
	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("lorem.txt"); // Criando fluxo concreto com arquivo (formato binario)
		Reader isr = new InputStreamReader(fis); // Transformando os dados binarios para caracteres
		BufferedReader br = new BufferedReader(isr); // Efetuando leitura linha por linha
		
		OutputStream fos = new FileOutputStream("loremCopiaArquivo.txt"); // Criando fluxo concreto com arquivo (formato binario)
		Writer osw = new OutputStreamWriter(fos); // Transformando os dados caracteres para binarios
		BufferedWriter bw = new BufferedWriter(osw); // Efetuando gravação linha por linha
		
		String linha = br.readLine();
		
		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
	}
}
