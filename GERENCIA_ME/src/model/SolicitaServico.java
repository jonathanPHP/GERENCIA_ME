package model;

import java.util.Date;

public class SolicitaServico {

	private Servico servico;
	private Hospedagem hospedagem;
	private Date data;
	
	public SolicitaServico() {}

	public SolicitaServico(Servico servico, Hospedagem hospedagem, Date data) {
		this.setServico(servico);
		this.setHospedagem(hospedagem);
		this.setData(data);
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
