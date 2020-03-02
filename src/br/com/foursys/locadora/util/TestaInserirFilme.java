package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;


import br.com.foursys.locadora.dao.FilmeDAO;
import br.com.foursys.locadora.model.Filme;

public class TestaInserirFilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection bd = ConnectionFactory.getConnection();
		
		Filme f1 =new Filme(1, "Vermes Malditos", "Terror,Ação", 20.00, true, false,18.00);
					  
		FilmeDAO dao = new FilmeDAO(bd);
		
		try {
			dao.inserir(f1);
			System.out.println("Filme inserido com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao inserir o filme!!!");
		}
		
		

	}

}
