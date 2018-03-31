package model;

public class Trabalhador {
	
	private int matricula;
	private String nome;
	
	public Trabalhador(int matricula, String nome){
		this.matricula = matricula;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return " A matricula é " + matricula + " Nome" +  nome;
	}
}
