package br.com.fernandoribeira.java.io.teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TesteLeituraSimples {
	public static void main(String[] args) throws IOException {
		
		// Codigo com dois objetos
		FileReader fr = new FileReader("lorem.txt");
		BufferedReader br1 = new BufferedReader(fr);
		
		String linha1 = br1.readLine();
		while (linha1 != null) {
			System.out.println(linha1);
			linha1 = br1.readLine();
		}
		
		br1.close();
		
		System.out.println();
		
		// Codigo com um objeto
		BufferedReader br2 = new BufferedReader(new FileReader("lorem.txt"));
		
		String linha2 = br2.readLine();
		while (linha2 != null) {
			System.out.println(linha2);
			linha2 = br2.readLine();
		}
		
		br2.close();
		
		System.out.println();
		
	}
}
