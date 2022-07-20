package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

import conexao.FactoryConnection;
import model.AlteracoesDosDados;
import model.CursosDisponiveis;
import model.Dados;
import model.ExclusoesDosDados;
import model.PersisteDados;


public class App {


	public static void main(String[] args) throws SQLException, ParseException {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		Connection conexao = FactoryConnection.getConnection();
		
		//CursosDisponiveis.consultaDados();
		
	//AlteracoesDosDados.alteraDados( "M", 2);
		
		//ExclusoesDosDados.excluiDados(4);
		
		Dados.showDados();
		
		/*try {
			PersisteDados.inseriDados("95575424464", "Pablo Valves ", "1987-10-19","M");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SQLException(e.getMessage());
	}*/

}
}
