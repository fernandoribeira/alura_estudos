package br.com.fernandoribeira.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		
		System.out.println("Abrindo conexão...");
		
		String url = "jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String password = "";
		Connection conn = DriverManager.getConnection(url, user, password);
		
		System.out.println("Fechando conexão...");
		
		conn.close();
		
		System.out.println("Conexão encerrada!");
		
	}
}
