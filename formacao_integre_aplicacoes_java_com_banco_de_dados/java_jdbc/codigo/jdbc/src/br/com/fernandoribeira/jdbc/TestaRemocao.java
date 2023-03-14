package br.com.fernandoribeira.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.devolveConexao();
		
		Statement s = conn.createStatement();
		s.execute("DELETE FROM produto WHERE id > 2");
		Integer linhasModificadas = s.getUpdateCount();
		
		System.out.println("Quantidade de linhas modificadas: " + linhasModificadas);
		
	}
}
