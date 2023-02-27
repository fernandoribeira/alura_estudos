package br.com.fernandoribeira.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
			
		// Codigo com classes especificas
		FileInputStream fis = new FileInputStream("lorem.txt"); // Criando fluxo concreto com arquivo (formato binario)
		InputStreamReader isr = new InputStreamReader(fis); // Transformando os dados binarios para caracteres
		BufferedReader br = new BufferedReader(isr); // Efetuando leitura linha por linha
		
		String linha = br.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
		System.out.println();
		
		// Codigo com classes genericas
		InputStream is = new FileInputStream("lorem.txt"); // Criando fluxo concreto com arquivo (formato binario)
		Reader r = new InputStreamReader(is); // Transformando os dados binarios para caracteres
		br = new BufferedReader(r); // Efetuando leitura linha por linha
		
		linha = br.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
	}
}
