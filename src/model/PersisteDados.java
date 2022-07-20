package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Time;

import conexao.FactoryConnection;

public class PersisteDados {
	static String query ;
	public static void inseriDados(String cpf, String nome, String nascimento, String sexo ) throws SQLException {
		
		Connection conexao = FactoryConnection.getConnection();
		
		/*query = "INSERT INTO telefones_alunos (alunos_cpf, telefone) "
				+ "VALUES ('"+cpf+"', '"+telefone+"') ";*/
		query = "INSERT INTO alunos (cpf, nome, data_nascimento, sexo) "
				+ "VALUES (?,?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(query);
		stmt.setString(1, cpf);
		stmt.setString(2, nome);
		stmt.setString(3, nascimento);
		stmt.setString(4, sexo);
		
		stmt.execute();
		
		conexao.close();
		
	}
	
	
}
