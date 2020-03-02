package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;


import br.com.foursys.locadora.dao.VendedorDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.model.Vendedor;

public class TestaAlterarVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection bd = ConnectionFactory.getConnection();
			Cidade cidade = new Cidade("Barueri");
			Estado estado = new Estado("Minas Gerais","MG");
			
			Vendedor v1 = new Vendedor();
			v1.setCidade(cidade);
			v1.setEstado(estado);
			v1.setAreaVenda("Caixa");
			v1.setSalario(1800.00);
			v1.setNome("Anderson Mendes de Souza");
			VendedorDAO dao = new VendedorDAO(bd);
			dao.alterar(v1);
			System.out.println("Vendedor alterado com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao alterar o Vendedor!!!");
		}

	}

}
