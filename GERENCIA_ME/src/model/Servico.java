package model;

import java.util.Date;

public class Servico {

	private String servico;
	private String descricao;
	private Double valor;
	private Date data;
	
	public Servico() {}

	public Servico(String servico, String descricao, Double valor, Date data) {
		this.setServico(servico);
		this.setDescricao(descricao);
		this.setValor(valor);
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
