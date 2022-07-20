package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.FactoryConnection;

public class AlteracoesDosDados {

	static String update;
	
	public static void alteraDados(String campo, int c) throws SQLException {
		Connection conexao = FactoryConnection.getConnection(); 
		
		
		update = "UPDATE alunos SET sexo =  ? where id = ? ";		
		
		PreparedStatement stmt = conexao.prepareStatement(update);
		
		stmt.setString(1, campo);
		stmt.setInt(2, c);
		
		stmt.executeUpdate();
		stmt.close();
		conexao.close();
	}
	
	
}
