package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.ClienteDAO;
import br.com.foursys.locadora.dao.VendedorDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Cliente;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.model.Vendedor;

public class TestaAlterarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection bd = ConnectionFactory.getConnection();
			Cidade cidade = new Cidade("Barueri");
			Estado estado = new Estado("Minas Gerais","MG");
			
			Cliente c1 = new Cliente();
			c1.setLogradouro("rua john wayne");
			c1.setNumeroLogradouro(13);
			c1.setBairro("Jd Itacolomi");
			c1.setCidade(cidade);
			c1.setEstado(estado);
			c1.setTelefone("40028922");
			c1.setCpf("12345678911");
			
			c1.setNome("Anderson Mendes de Souza");
			ClienteDAO dao = new ClienteDAO(bd);
			dao.alterar(c1);
			System.out.println("Cliente alterado com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao alterar o cliente!!!");
		}

	}

}
