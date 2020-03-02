package br.com.foursys.locadora.util;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.ClienteDAO;
import br.com.foursys.locadora.dao.VendedorDAO;
import br.com.foursys.locadora.model.Cliente;
import br.com.foursys.locadora.model.Vendedor;


public class TestaBuscarTodosVendedores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection bd = ConnectionFactory.getConnection();

		// Aluno al =new Aluno("Teste","jau",20);

		VendedorDAO dao = new VendedorDAO(bd);

		try {
			List<Vendedor> vendedores = dao.buscarTodos();
			// dao.buscarTodos();

			for (Vendedor vendedor : vendedores) {
				
				
				/*
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 */
				
				System.out.println("Nome: " + vendedor.getNome());
				System.out.println("Area de Venda: " + vendedor.getAreaVenda());				
				System.out.println("Cidade: " + vendedor.getCidade().getNome());
				System.out.println("Estado: " + vendedor.getEstado().getNome()+ "-"+vendedor.getEstado().getUf());				
				System.out.println("Sexo: " + vendedor.getSexo());				
				System.out.println("Idade: " + vendedor.getIdade());
				System.out.println("Salario: " + vendedor.getSalario());
				System.out.println();
			}
			// System.out.println("Aluno buscado com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao buscar o cliente!!!");
		}

	}

}
