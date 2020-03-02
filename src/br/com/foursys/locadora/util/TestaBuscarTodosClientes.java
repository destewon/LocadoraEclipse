package br.com.foursys.locadora.util;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.ClienteDAO;
import br.com.foursys.locadora.model.Cliente;


public class TestaBuscarTodosClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection bd = ConnectionFactory.getConnection();

		// Aluno al =new Aluno("Teste","jau",20);

		ClienteDAO dao = new ClienteDAO(bd);

		try {
			List<Cliente> clientes = dao.buscarTodos();
			// dao.buscarTodos();

			for (Cliente cliente : clientes) {
				
				
				/*
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 * System.out.println("Estado: " + filme.getNome());
				 */
				
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Logradouro: " + cliente.getLogradouro());
				System.out.println("Numero Logradouro: " + cliente.getNumeroLogradouro());
				System.out.println("Bairro: " + cliente.getBairro());
				System.out.println("Cidade: " + cliente.getCidade().getNome());
				System.out.println("Estado: " + cliente.getEstado().getNome()+ "-"+cliente.getEstado().getUf());
				System.out.println("Telefone: " + cliente.getTelefone());
				System.out.println("Cpf: " + cliente.getCpf());
				System.out.println("Rg: " + cliente.getRg());
				System.out.println("Sexo: " + cliente.getSexo());
				System.out.println("Data de Nasciment: " + cliente.getDataNascimento());
				System.out.println("Idade: " + cliente.getIdade());
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
