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

public class TestaAlterarFilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection bd = ConnectionFactory.getConnection();
			
			
			Filme f1 = new Filme();
			f1.setCodigo(1);
			f1.setDisponivel(false);
			f1.setPromocao(true);
			f1.setValor(30);
			f1.setValorPromocional(28.5);
			
			
			FilmeDAO dao = new FilmeDAO(bd);
			dao.alterar(f1);
			System.out.println("Filme alterado com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao alterar o filme!!!");
		}

	}

}
