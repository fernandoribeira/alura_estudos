package br.com.fernandoribeira.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {
	public static void main(String[] args) throws FileNotFoundException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(new File("contas.csv"));
		
		while (sc.hasNextLine()) {
			
			String linha = sc.nextLine();
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			
			String tipo = linhaScanner.next();
			Integer agencia = linhaScanner.nextInt();
			Integer conta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble();
			
			System.out.printf("Tipo %s, Agencia %d, Conta %d, Titular %s, Saldo %.2f%n",
					tipo, agencia, conta, titular, saldo);
			
			linhaScanner.close();
		}
		
		sc.close();
	}
}
