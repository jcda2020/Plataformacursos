package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {

	public static Connection getConnection(){
		
		final String url = "jdbc:mysql://localhost/plataformacursos";
		final String usuario = "root";
		final String senha = "";
		
		
		try {
			return DriverManager.getConnection(url,usuario,senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/*
	 Basta instanciar uma conexão Connection pelo fábrica de conexão:
	 Connection conexao = FactoryConnection.getConnection()
	 */
}
