package View;

import java.util.List;
import Model.Professor;

public class ProfessorView {
	public void exibelistaDeProfessores(List<Professor> listaDeProfessores) {
		System.out.println("----- Lista de Professores -----");
		
		for(Professor professor : listaDeProfessores) {
			System.out.println("Professor: " + professor.getNome() + "; Codigo: " + professor.getCod_iden()
					+ "Disciplina: " + professor.getSigla_disci() + "; Especialidade: " + professor.getEspecialdade()
					+ "Data de Admissao: " + professor.getData_admissao());
		}
	}
	
	public void excluirProfessor() {
		System.out.println("Professor excluido com sucesso!");
	}
	
	public void exibeProfessor(Professor prof) {
		System.out.println("Nome: " + prof.getNome());
		System.out.println("Codigo: " + prof.getCod_iden());
		System.out.println("Disciplina: " + prof.getSigla_disci());
		System.out.println("Especialidade: " + prof.getEspecialdade());
		System.out.println("Data de admissao: " + prof.getData_admissao());
	}
}