package br.com.fernandoribeira.jdbc.s;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fernandoribeira.jdbc.util.ConnectionFactory;

public class TestaInsercaoComParametroErro {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.devolveConexao();
		
		String nome = "Mouse'";
		String descricao = "Mouse sem fio";
		
		Statement s = conn.createStatement();
		s.execute(
				"INSERT INTO produto (nome, descricao) VALUES ('" + nome + "', '" + descricao +"')", 
				Statement.RETURN_GENERATED_KEYS);
		ResultSet rs = s.getGeneratedKeys();
		
		while(rs.next()) {
			Integer id = rs.getInt(1);
			System.out.println("O id criado foi " + id);
		}
		
		rs.close();
		s.close();
		conn.close();
		
	}
}
