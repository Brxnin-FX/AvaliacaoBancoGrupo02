package Controller;

import Dao.ProfessorDao;
import View.ProfessorView;

public class ProfessorController {
	private ProfessorDao dao;
	private ProfessorView view;
	
	public void ProfessorController() {
		dao = new ProfessorDao();
		view = new ProfessorView();
	}
	
	public void exibeListaDeProfessores() {
		view.exibelistaDeProfessores(dao.listarProfessor());
	}
	
	public void excluirProfessores(String id) {
		dao.excluirProfessor(id);
		view.excluirProfessor();
	}
}