package Model;

public class Disciplina {
	private String sigla_disci;
	private String nome;
	private String ementa;
	
// Construtor
	public Disciplina (String sigla_disci, String nome, String ementa) {
		this.sigla_disci = sigla_disci;
		this.nome = nome;
		this.ementa = ementa;
	}

//Metodo Gets e Sets
	public String getSigla_disci() {
		return sigla_disci;
	}

	public void setSigla_disci(String sigla_disci) {
		this.sigla_disci = sigla_disci;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}	
}