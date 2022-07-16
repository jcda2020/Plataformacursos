package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexao.FactoryConnection;

public class ConsultarDados {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conexao = FactoryConnection.getConnection();		
		
		
		
		String query = "SELECT * FROM cursos";
		Statement stmt = conexao.createStatement();
		//stmt.execute(query);
		
		ResultSet resultado = stmt.executeQuery(query);
		List<String>  cursos = new ArrayList<>();
		while (resultado.next()) {
			
			int codigo = resultado.getInt("codigo");
			String titulo = resultado.getString("titulo");
			
			//System.out.println(resultado );
			
			System.out.println("Cursos:");
			System.out.println("Código: " + codigo);
			System.out.println("Títulodo curso: " + titulo);
			
			 cursos.add(titulo);
		}
		
		for (String titulos : cursos) {
			System.out.println("Cursos com List: " + "==> "+ titulos);
		}
		
		conexao.close();
	}

}
