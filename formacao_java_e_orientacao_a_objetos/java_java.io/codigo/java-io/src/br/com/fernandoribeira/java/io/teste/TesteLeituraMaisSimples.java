package br.com.fernandoribeira.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeituraMaisSimples {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("contas.csv"));
		
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}
}
