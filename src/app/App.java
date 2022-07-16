package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

import conexao.FactoryConnection;
import model.CursosDisponiveis;
import model.Dados;
import model.PersisteDados;


public class App {


	public static void main(String[] args) throws SQLException, ParseException {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		Connection conexao = FactoryConnection.getConnection();
		
		CursosDisponiveis.consultaDados();
		
		Dados.showDados();
		
		/*try {
			PersisteDados.inseriCursos("50970553498", "222-55578 ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
