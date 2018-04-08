package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Relatorio {
	private Usuario usuario;
	private List<Servico> servicos = new ArrayList<Servico>();
	private List<Reserva> reservas = new ArrayList<Reserva>();
	private List<Hospedagem> hospedagens = new ArrayList<Hospedagem>();
	private Double total; 
	private Double totalReservas;
	private Double totalServicos;
	private Date dataInicio;
	private Date dataFim;
	
	public Relatorio() {}
	
	public Relatorio(Usuario usuario, List<Hospedagem> hospedagens, Date dataInicio, Date dataFim) {
		this.setUsuario(usuario);
		this.setHospedagens(hospedagens);
		this.setDataInicio(dataInicio);
		this.setDataFim(dataFim);
		
		for(Hospedagem hospedagem : hospedagens) {
			this.addReserva(hospedagem.getReserva());
			for(Servico servico: hospedagem.getServicos()) {
				this.addServico(servico);
			}
		}
		
		this.setTotalReservas(calculaReservas());
		this.setTotalServicos(calculaServicos());
		this.setTotal(calculaTotal());
		
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public Double getTotalServicos() {
		return totalServicos;
	}

	public void setTotalServicos(Double totalServicos) {
		this.totalServicos = totalServicos;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Double getTotalReservas() {
		return totalReservas;
	}

	public void setTotalReservas(Double totalReservas) {
		this.totalReservas = totalReservas;
	}

	public List<Hospedagem> getHospedagens() {
		return hospedagens;
	}

	public void setHospedagens(List<Hospedagem> hospedagens) {
		this.hospedagens = hospedagens;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public void addServico(Servico servico) {
		servicos.add(servico);
	}
	
	public void addReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public void addHospedagem(Hospedagem hospedagem) {
		hospedagens.add(hospedagem);
	}
	
	public Double calculaServicos() {
		Double total = 0.0;
		for(Hospedagem hospedagem : this.hospedagens) 
			for(Servico servico : hospedagem.getServicos()) 
				total += servico.getValor();
		return total;
	}
	
	public Double calculaReservas() {
		Double total = 0.0;
		for(Hospedagem hospedagem : this.hospedagens) 
			total += hospedagem.getReserva().getValor();
		return total;
	}
	
	public Double calculaTotal() {
		Double total = 0.0;
		total += calculaServicos() + calculaReservas();
		return total;
	}
}
