package model;

import java.util.Date;

public class Servico {

	private String servico;
	private String descricao;
	private Double preco;
	private Date data;
	
	public Servico() {}

	public Servico(String servico, String descricao, Double preco, Date data) {
		this.setServico(servico);
		this.setDescricao(descricao);
		this.setPreco(preco);
		this.setData(data);
	}
	
	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
