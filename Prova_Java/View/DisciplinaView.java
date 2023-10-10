package View;

import java.util.List;
import Model.Disciplina;

public class DisciplinaView {
	public void exibeListaDeDisciplianas(List<Disciplina> listaDisciplinas) {
		System.out.println("----- Lista de Disciplinas -----");
		
		for (Disciplina disciplina : listaDisciplinas) {
			System.out.println("Disciplina: " + disciplina.getNome() + "; Sigla: " + disciplina.getSigla_disci()
					+ "Ementa: " + disciplina.getEmenta());
		}
	}
	
	public void excluirDisciplina() {
		System.out.println("Disciplina excluida com sucesso!!!");
	}
	
	public void exibeDiciplinaBuscada(Disciplina disciplina) {
		System.out.println("Disciplina: " + disciplina.getNome());
		System.out.println("Sigla: " + disciplina.getSigla_disci());
		System.out.println("Ementa: " + disciplina.getEmenta());
	}
	
	public void atualizarDisciplina() {
		System.out.println("Disciplina atualizada!");
	}
}