package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.ClienteDAO;
import br.com.foursys.locadora.dao.FilmeDAO;
import br.com.foursys.locadora.dao.VendedorDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Cliente;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.model.Filme;
import br.com.foursys.locadora.model.Vendedor;

public class TestaExcluirFilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection bd = ConnectionFactory.getConnection();
			
			
			Filme f1 = new Filme();
			f1.setCodigo(1);
			
			
			
			FilmeDAO dao = new FilmeDAO(bd);
			dao.excluir(f1);
			System.out.println("Filme excluido com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao excluir o filme!!!");
		}

	}

}
