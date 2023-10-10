package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Disciplina;

public class DisciplinaDao {
	private static final String URL = "jdbc:mysql://localhost:3306/senai_banco_academico";
	private static final String USUARIO = "root";
	private static final String SENHA = "aluno";
	private Connection connection;
	
	public void inserirDisciplina(Disciplina disciplina){
        try(Connection connetcion = DriverManager.getConnection(URL, USUARIO, SENHA)){
        	String sql ="INSERT INTO disciplina(sigla_disci, nome , ementa) VALUES (?, ?, ?, ?)";
        	PreparedStatement preparedStatement = connection.prepareStatement(sql);
        	preparedStatement.setString( 1, disciplina.getSigla_disci());
        	preparedStatement.setString(2, disciplina.getNome());
        	preparedStatement.setString(3, disciplina.getEmenta());
        	preparedStatement.executeUpdate();
        } catch(SQLException e) {
        	e.printStackTrace();
        }
    }
	
	public Disciplina buscarDisciplinaPorCodigo(String id){
        try(Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)){
        	String sql = "SELECT * FROM disciplina where sigla_disci = ?";
        	PreparedStatement preparedStatement = connection.prepareStatement(sql);
        	preparedStatement.setString(1, id);
        	ResultSet resultSet = preparedStatement.executeQuery();
        
        	if(resultSet.next()) {
        		String sigla_disci = resultSet.getString("sigla_disci");
        		String nome = resultSet.getString("nome");
        		String ementa = resultSet.getString("ementa");
        		return new Disciplina(id, nome, sigla_disci);
        	}
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        return null; 
    }
	
	public boolean excluirDisciplina(String id) {
    	try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "DELETE FROM disciplina WHERE sigla_disci = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rowsDeleted = preparedStatement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
	
	public List<Disciplina> listarDisciplina(){
        List<Disciplina> alunos = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "SELECT * FROM aluno";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String sigla_disci = resultSet.getString("sigla_disci");
                String nome = resultSet.getString("nome");
                String ementa = resultSet.getString("ementa");

                Disciplina disciplina = new Disciplina( sigla_disci,  nome, ementa);
                listarDisciplina().add(disciplina);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listarDisciplina();
    }
	
	public void atualizarDisciplina(Disciplina disciplina) {
		try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
			String sql = "UPDATE disciplina SET nome = ?, ementa = ? WHERE sigla = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, disciplina.getNome());
			ps.setString(2, disciplina.getEmenta());
			ps.setString(3, disciplina.getSigla_disci());
			ps.executeUpdate();
		} catch (SQLException e) {
            e.printStackTrace();
        }
	}
}