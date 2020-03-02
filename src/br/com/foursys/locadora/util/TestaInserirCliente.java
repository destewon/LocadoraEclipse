package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.ClienteDAO;
import br.com.foursys.locadora.dao.FilmeDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Cliente;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.model.Filme;

public class TestaInserirCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection bd = ConnectionFactory.getConnection();
		Cidade cidade = new Cidade("Osasco");
		Estado estado = new Estado("São Paulo","SP");
		
		//String estado2 = (estado.getNome()+" - "+estado.getUf());
		Cliente c1 =new Cliente("Matheus Poda", "Av. Edmundo Amaral", 120,"Jd Ipiratininga",cidade,estado,"11 6666-6666","12345678911","345684567",'m',"23/10/2000",19);
		
		ClienteDAO dao = new ClienteDAO(bd);
		
		try {
			dao.inserir(c1);
			System.out.println("Cliente inserido com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao inserir o Cliente!!!");
		}
		
		

	}

}
