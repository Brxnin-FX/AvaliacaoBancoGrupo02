package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Professor;

public class ProfessorDao {
	private static final String URL = "jdbc:mysql://localhost:3306/banco_aluno";
	private static final String USUARIO = "root";
	private static final String SENHA = "aluno";
	private Connection connection;
	
	public void abreConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Erro ao abrir a conexão com o banco de dados", e);
        }
    }
    
    public void fechaConexao() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void inserirProfessor(Professor professor) throws SQLException {
        try(Connection connetcion = DriverManager.getConnection(URL, USUARIO, SENHA)){
        	String sql ="INSERT INTO professor(cod_ident, nome ,sigla_disci, especiadlida, data_admissao) VALUES (?, ?, ?, ?, ?)";
        	PreparedStatement preparedStatement = connection.prepareStatement(sql);
        	preparedStatement.setString( 1, professor.getCod_iden());
        	preparedStatement.setString(2, professor.getNome());
        	preparedStatement.setString(3, professor.getSigla_disci());
        	preparedStatement.setString(4, professor.getEspecialdade());
        	preparedStatement.setString(5, professor.getData_admissao());
        	preparedStatement.executeUpdate();
        } catch(SQLException e) {
        	e.printStackTrace();
        }
    }
    
    public Professor buscarProfessorPorCodigo(String id) throws SQLException {
        try(Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)){
        	String sql = "SELECT * FROM professor where cod_ident = ?";
        	PreparedStatement preparedStatement = connection.prepareStatement(sql);
        	preparedStatement.setString(1, id);
        	ResultSet resultSet = preparedStatement.executeQuery();
        
        	if(resultSet.next()) {
        		String nome = resultSet.getString("nome");
        		String sigla_disci = resultSet.getString("sigla_disci");
        		String especialidade = resultSet.getString("especialidade");
        		return new Professor(id, nome, sigla_disci, especialidade);
        	}
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        return null; 
    }
    
    
    
    public boolean atualizarProfessor(Professor professor) {
    	try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "UPDATE professor SET cod_ident = ?, nome = ?, sigla_disci = ?, especialidade = ?, data_admissao = ?,  WHERE cod_ident = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, professor.getCod_iden());
            preparedStatement.setString(2, professor.getNome());
            preparedStatement.setString(3, professor.getSigla_disci());
            preparedStatement.setString(4, professor.getEspecialdade());
            preparedStatement.setString(5, professor.getData_admissao());
            int rowsUpdated = preparedStatement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean excluirProfessor(String id){
    	try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "DELETE FROM professor WHERE cod_ident = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rowsDeleted = preparedStatement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    
    public List<Professor> listarProfessor(){
        List<Professor> alunos = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "SELECT * FROM aluno";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String cod_ident = resultSet.getString("cod_ident");
                String nome = resultSet.getString("nome");
                String sigla_disci = resultSet.getString("sigla_disci");
                String especialidade = resultSet.getString("especialidade");
                String data_admissao = resultSet.getString("data_admissao");

               Professor professor = new Professor(cod_ident, nome, sigla_disci, especialidade);
                listarProfessor().add(professor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listarProfessor();
    }
}