package br.com.fernandoribeira.jdbc.s;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fernandoribeira.jdbc.util.ConnectionFactory;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.devolveConexao();

		Statement s = conn.createStatement();
		s.execute("SELECT * FROM produto");
		ResultSet rs = s.getResultSet();
		
		while(rs.next()) {
			Integer id = rs.getInt("id");
			String nome = rs.getString("nome");
			String descricao = rs.getString("descricao");
			System.out.printf("%d - %s - %s%n", id, nome, descricao);
		}
		
		rs.close();
		s.close();
		conn.close();
		
	}
}
