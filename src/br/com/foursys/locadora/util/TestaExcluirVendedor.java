package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;


import br.com.foursys.locadora.dao.VendedorDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.model.Vendedor;

public class TestaExcluirVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection bd = ConnectionFactory.getConnection();
			
			
			Vendedor v1 = new Vendedor();
			
			v1.setNome("Anderson Mendes de Souza");
			VendedorDAO dao = new VendedorDAO(bd);
			dao.excluir(v1);
			System.out.println("Vendedor excluido com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao excluir o Vendedor!!!");
		}

	}

}
