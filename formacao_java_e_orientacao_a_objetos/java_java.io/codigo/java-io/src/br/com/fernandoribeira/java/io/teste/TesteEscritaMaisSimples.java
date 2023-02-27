package br.com.fernandoribeira.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaMaisSimples {
	public static void main(String[] args) throws IOException {
		
		//PrintStream ps = new PrintStream("loreMaisSimples.txt");
		PrintWriter ps = new PrintWriter("loreMaisSimples.txt");
		
		ps.println("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		ps.println();
		ps.println();
		ps.println("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		ps.println();
		
		ps.close();
		
	}
}
