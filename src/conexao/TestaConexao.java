package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		//String url = "jdbc:mysql://localhost?useSSL=true"
		final String url = "jdbc:mysql://localhost";
		final String usuario = "root";
		final String senha = "";
		
		Connection conexao = DriverManager.getConnection(url, usuario,senha);
			System.out.println("Conexão OK!");
		
		conexao.close();
		
	}

}
