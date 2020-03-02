package br.com.foursys.locadora.util;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.EstadoDAO;
import br.com.foursys.locadora.dao.FilmeDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.model.Filme;

public class TestaBuscarTodosFilmes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection bd = ConnectionFactory.getConnection();

		// Aluno al =new Aluno("Teste","jau",20);

		FilmeDAO dao = new FilmeDAO(bd);

		try {
			List<Filme> filmes = dao.buscarTodos();
			// dao.buscarTodos();

			for (Filme filme : filmes) {
				
				
				/*
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 */
				
				System.out.println("Codigo: " + filme.getCodigo());
				System.out.println("Nome: " + filme.getNome());
				System.out.println("Genero: " + filme.getGenero());
				System.out.println("Valor: " + filme.getValor());
				System.out.println("Disponivel: " + filme.isDisponivel());
				System.out.println("Promoção: " + filme.isPromocao());
				System.out.println("Valor Promocional: " + filme.getValorPromocional());
				
				
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
