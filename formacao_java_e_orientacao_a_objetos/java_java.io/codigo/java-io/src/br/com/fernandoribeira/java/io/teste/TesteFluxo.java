package br.com.fernandoribeira.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteFluxo {
	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket();
		
		// Ler do arquivo FileInputStream
		// Ler do console System.in
		// Ler da rede Socket
		InputStream is;
		//is = new FileInputStream("lorem.txt"); // Criando fluxo concreto com arquivo (formato binario)
		is = System.in; // Criando fluxo concreto com console (formato binario)
		//is = s.getInputStream(); // Criando fluxo concreto com rede (formato binario)
		
		Reader isr = new InputStreamReader(is); // Transformando os dados binarios para caracteres
		BufferedReader br = new BufferedReader(isr); // Efetuando leitura linha por linha	
		
		// Saida no arquivo
		// Saida no console
		// Saida na rede
		OutputStream os;
		//os = new FileOutputStream("lorem.txt"); // Criando fluxo concreto com arquivo (formato binario)
		os = System.out; // Criando fluxo concreto com console (formato binario)
		//os = s.getOutputStream(); // Criando fluxo concreto com rede (formato binario)
		
		Writer osw = new OutputStreamWriter(os); // Transformando os dados caracteres para binarios
		BufferedWriter bw = new BufferedWriter(osw); // Efetuando gravação linha por linha
		
		String linha = br.readLine();
		
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
	}
}
