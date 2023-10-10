package Model;

public class Professor {
	private String cod_iden;
	private String nome;
	private String sigla_disci;
	private String especialdade;
	private String data_admissao;
	
	public Professor (String cod_iden, String nome, String especialidade, String data_admissao) {
		this.cod_iden = cod_iden;
		this.nome = nome;
		this.sigla_disci = sigla_disci;
		this.data_admissao = data_admissao;
	}
	
// Metodo Gets e Sets
	public String getCod_iden() {
		return cod_iden;
	}

	public void setCod_iden(String cod_iden) {
		this.cod_iden = cod_iden;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla_disci() {
		return sigla_disci;
	}

	public void setSigla_disci(String sigla_disci) {
		this.sigla_disci = sigla_disci;
	}

	public String getEspecialdade() {
		return especialdade;
	}

	public void setEspecialdade(String especialdade) {
		this.especialdade = especialdade;
	}

	public String getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}
}