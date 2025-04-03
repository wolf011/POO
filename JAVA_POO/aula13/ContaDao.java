package aula12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaDao {
	private Connection connection;

	public ContaDao() {
		connection = new ConnectionFactory().getConnection();
	}

	public void inserir(Conta conta) {
		String sql = "insert into conta(numero_conta,titular,saldo) values(?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, conta.getNumeroConta());
			stmt.setString(2, conta.getTitular());
			stmt.setDouble(3, conta.getSaldo());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.err.println("Erro ao gravar registro de conta");
		}
	}

	public List<Conta> listar() {
		String sql = "select * from conta";
		List<Conta> contas = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Conta conta = new Conta(rs.getInt("numero_conta"), rs.getString("titular"), rs.getDouble("saldo"));
				contas.add(conta);
			}
			stmt.close();
			rs.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}
		return contas;
	}

	public void remover(int numeroConta) {
		String sql = "delete from conta where numero_conta=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, numeroConta);
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.err.println("Erro ao remover!");
		}
	}

}
