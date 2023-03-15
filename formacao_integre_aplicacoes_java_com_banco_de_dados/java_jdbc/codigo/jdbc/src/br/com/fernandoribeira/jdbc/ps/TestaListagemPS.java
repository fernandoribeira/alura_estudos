package br.com.fernandoribeira.jdbc.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fernandoribeira.jdbc.util.ConnectionFactory;

public class TestaListagemPS {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.devolveConexao();

		String sql = "SELECT * FROM produto";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ResultSet rs = ps.getResultSet();
		
		while(rs.next()) {
			Integer id = rs.getInt("id");
			String nome = rs.getString("nome");
			String descricao = rs.getString("descricao");
			System.out.printf("%d - %s - %s%n", id, nome, descricao);
		}
		
		rs.close();
		ps.close();
		conn.close();
		
	}
}
