package br.com.fernandoribeira.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteUnicodeEnconding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "Ç";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes();
		System.out.print(bytes.length + ", UTF-8, ");
		String sNova = new String(bytes, "UTF-8");
		System.out.println(sNova);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNova = new String(bytes, "UTF-16");
		System.out.println(sNova);
		
		bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		sNova = new String(bytes, "windows-1252");
		System.out.println(sNova);
		
	}
}
