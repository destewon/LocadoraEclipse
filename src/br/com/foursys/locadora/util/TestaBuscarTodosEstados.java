package br.com.foursys.locadora.util;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.EstadoDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Estado;

public class TestaBuscarTodosEstados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection bd = ConnectionFactory.getConnection();

		// Aluno al =new Aluno("Teste","jau",20);

		EstadoDAO dao = new EstadoDAO(bd);

		try {
			List<Estado> estados = dao.buscarTodos();
			// dao.buscarTodos();

			for (Estado estado : estados) {
				System.out.println("Estado: " + estado.getNome());
				System.out.println("Uf: " + estado.getUf());
				
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
