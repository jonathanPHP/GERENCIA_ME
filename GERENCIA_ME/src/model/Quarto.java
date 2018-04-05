package model;

public class Quarto {
	
	private String numero;
	private Integer capacidade;
	private String descricao;
	
	public Quarto() {}
	
	public Quarto(String numero, Integer capacidade, String descricao) {
		this.setNumero(numero);
		this.setCapacidade(capacidade);
		this.setDescricao(descricao);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
