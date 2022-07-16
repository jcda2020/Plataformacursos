package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Time;

import conexao.FactoryConnection;

public class PersisteDados {
	static String query ;
	public static void inseriCursos(String cpf, String telefone ) throws SQLException {
		
		Connection conexao = FactoryConnection.getConnection();
		
		/*query = "INSERT INTO telefones_alunos (alunos_cpf, telefone) "
				+ "VALUES ('"+cpf+"', '"+telefone+"') ";*/
		query = "INSERT INTO telefones_alunos (alunos_cpf, telefone) "
				+ "VALUES (?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(query);
		stmt.setString(1, cpf);
		stmt.setString(2, telefone);
		
		stmt.execute();
		
		conexao.close();
		
	}
	
	
}
