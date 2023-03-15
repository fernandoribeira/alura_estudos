package br.com.fernandoribeira.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection devolveConexao() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String password = "";
		
		return DriverManager.getConnection(url, user, password);
		
	}
	
}
