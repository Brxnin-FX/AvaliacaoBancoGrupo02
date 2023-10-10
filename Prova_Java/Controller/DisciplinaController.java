package Controller;

import Dao.DisciplinaDao;
import Model.Disciplina;
import View.DisciplinaView;

public class DisciplinaController {
	private DisciplinaDao dao;
	private DisciplinaView view;
	
	public void DisciplinaController() {
		dao = new DisciplinaDao();
		view = new DisciplinaView();
	}
	
	public void listarDisciplinas() {
		view.exibeListaDeDisciplianas(dao.listarDisciplina());
	}
	
	public void excluirDisciplina(String id) {
		dao.excluirDisciplina(id);
		view.excluirDisciplina();
	}
	
	public void exibeDisciplinaBuscada(String id) {
		view.exibeDiciplinaBuscada(dao.buscarDisciplinaPorCodigo(id));
	}
	
	public void atualizarDisciplina(Disciplina disciplina) {
		dao.atualizarDisciplina(disciplina);
		view.atualizarDisciplina();
	}
}