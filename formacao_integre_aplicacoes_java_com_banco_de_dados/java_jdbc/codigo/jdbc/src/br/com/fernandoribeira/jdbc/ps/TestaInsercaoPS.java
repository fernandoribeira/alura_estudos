package br.com.fernandoribeira.jdbc.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fernandoribeira.jdbc.util.ConnectionFactory;

public class TestaInsercaoPS {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.devolveConexao();
		
		String sql = "INSERT INTO produto (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')";
		PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.execute();
		ResultSet rs = ps.getGeneratedKeys();
		
		while(rs.next()) {
			Integer id = rs.getInt(1);
			System.out.println("O id criado foi " + id);
		}
		
		rs.close();
		ps.close();
		conn.close();
		
	}
}
