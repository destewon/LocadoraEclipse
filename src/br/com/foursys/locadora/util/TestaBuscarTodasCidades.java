package br.com.foursys.locadora.util;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.CidadeDAO;
import br.com.foursys.locadora.model.Cidade;

public class TestaBuscarTodasCidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection bd = ConnectionFactory.getConnection();

		// Aluno al =new Aluno("Teste","jau",20);

		CidadeDAO dao = new CidadeDAO(bd);

		try {
			List<Cidade> cidades = dao.buscarTodos();
			// dao.buscarTodos();

			for (Cidade cidade : cidades) {
				System.out.println("Nome: " + cidade.getNome());
				
				System.out.println();
			}
			// System.out.println("Aluno buscado com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao buscar o aluno!!!");
		}

	}

}
