package model;

public class Gerente extends Funcionario {
	
	private int quant_projetos;

	public Gerente(String nome, String matricula, int quant_projetos) {
		super(nome, matricula);
		this.setQuant_projetos(quant_projetos);
	}

	public int getQuant_projetos() {
		return quant_projetos;
	}

	public void setQuant_projetos(int quant_projetos) {
		this.quant_projetos = quant_projetos;
	}
}


