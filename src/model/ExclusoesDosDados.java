package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.FactoryConnection;

public class ExclusoesDosDados {
	
	static String sql;
	
	public static void excluiDados(int codigo) throws SQLException {
		PreparedStatement stmt ;
		Connection conexao = FactoryConnection.getConnection();
		sql = "DELETE FROM alunos WHERE id = ?";
		
		try {
			 stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.execute();
				
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SQLException(e.getMessage());
		}
		stmt.close();
		conexao.close();	
	}
	
	
}
