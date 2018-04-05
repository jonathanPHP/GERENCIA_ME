package model;

import java.util.Date;

public class Pagamento {

	private Integer codigo;
	private TipoPagamento tipo;
	private Double valor;
	private Hospedagem hospedagem;
	private Date data;
	
	public Pagamento() {}
	
	public Pagamento(Integer codigo, TipoPagamento tipo, Double valor, Hospedagem hospedagem, Date data) {
		this.setCodigo(codigo);
		this.setTipo(tipo);
		this.setValor(valor);
		this.setHospedagem(hospedagem);
		this.setData(data);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public TipoPagamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoPagamento tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
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
