package br.com.fernandoribeira.jdbc.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fernandoribeira.jdbc.util.ConnectionFactory;

public class TestaInsercaoComParametroCommitTWRPS {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory cf = null;
		Connection c = null;
		PreparedStatement ps = null;
		String sql = null;
		
		try {
			cf = new ConnectionFactory();
			c = cf.devolveConexao();
			c.setAutoCommit(false);

			sql = "INSERT INTO produto (nome, descricao) VALUES (?, ?)";
			ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			adicionar("Mouse", "Mouse sem fio", ps);
			adicionar("Minhoca", "Minhoca de doce", ps);
			adicionar("Caminhão", "Caminhão de lixo", ps);
			
			c.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			c.rollback();
		} finally {
			ps.close();
			c.close();
		}
	
	}

	private static void adicionar(String nome, String descricao, PreparedStatement ps) throws SQLException {
		
		ps.setString(1, nome);
		ps.setString(2, descricao);
		
//		if (nome == "Minhoca") {
//			throw new SQLException("Erro!");
//		}
		
		ps.execute();
		
		ResultSet rs = ps.getGeneratedKeys();
		
		while(rs.next()) {
			Integer id = rs.getInt(1);
			System.out.println("O id criado foi " + id);
		}
		
		rs.close();
		
	}
}
