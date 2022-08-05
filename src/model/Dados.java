package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import conexao.FactoryConnection;

public class Dados {

static String query;
	
	public static void showDados() throws SQLException, ParseException {
		query = "SELECT * FROM alunos";
		Connection conexao = FactoryConnection.getConnection();
        Statement stmt = conexao.createStatement();
        
       
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        
		ResultSet resultado = stmt.executeQuery(query);
while(resultado.next()) {
			
			String cpf = resultado.getString("cpf");
			String nome = resultado.getString("nome");
			//tipo date no sql
			Date nascimento = resultado.getDate("data_nascimento");
			String sexo = resultado.getString("sexo");			
		
			System.out.println("CPF: " + cpf);
			System.out.println("Nome: " + nome);
			System.out.println("Data de nascimento: " + data.format(nascimento));
			System.out.println("Sexo: " + sexo);
		} 
stmt.close();
conexao.close();
	}
	
	
}
