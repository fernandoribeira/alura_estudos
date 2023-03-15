package br.com.fernandoribeira.jdbc.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fernandoribeira.jdbc.util.ConnectionFactory;

public class TestaRemocaoPS {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.devolveConexao();
		
		String sql = "DELETE FROM produto WHERE id > 2";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		Integer linhasModificadas = ps.getUpdateCount();
		
		System.out.println("Quantidade de linhas modificadas: " + linhasModificadas);
		
		ps.close();
		conn.close();
		
	}
}
