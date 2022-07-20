package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexao.FactoryConnection;

public class CursosDisponiveis {

	static String query ;	
	
	
	public static void consultaDados() throws SQLException {
		
		Connection conexao = FactoryConnection.getConnection();
		query = "SELECT * FROM cursos";
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(query);
		
		while (resultado.next()) {			
			int codigo = resultado.getInt("codigo");
			String titulo = resultado.getString("titulo");
			
			//System.out.println(resultado );
			
			System.out.println("Cursos:");
			System.out.println("Código: " + codigo);
			System.out.println("Título do curso: " + titulo);		
			
		}
		stmt.close();
		conexao.close();	
	}	
	public static List<String> carregaCursos(){		
		List <String> cursos = new ArrayList<>();
		
		
		return null;
	}
		
}
