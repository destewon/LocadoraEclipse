package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;


import br.com.foursys.locadora.dao.FilmeDAO;
import br.com.foursys.locadora.dao.VendedorDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.model.Filme;
import br.com.foursys.locadora.model.Vendedor;

public class TestaInserirVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection bd = ConnectionFactory.getConnection();
		Cidade cidade = new Cidade("Osasco");
		Estado estado = new Estado("São Paulo","SP");
		Vendedor v1 =new Vendedor("Anderson Mendes de Souza", "Balcão", cidade, estado, 'm', 24,1675.00);	
		
		VendedorDAO dao = new VendedorDAO(bd);
		
		try {
			dao.inserir(v1);
			System.out.println("Vendedor inserido com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao inserir o Vendedor!!!");
		}
		
		

	}

}
