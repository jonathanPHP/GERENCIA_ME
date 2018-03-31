package model;

public class Assistente extends Funcionario{
	
	private String chefeImediato;

	public Assistente(String nome, String matricula, String chefeImediato) {
		super(nome, matricula);
		this.chefeImediato = chefeImediato;
	}

	public String getChefeImediato() {
		return chefeImediato;
	}

	public void setChefeImediato(String chefeImediato) {
		this.chefeImediato = chefeImediato;
	}
}
