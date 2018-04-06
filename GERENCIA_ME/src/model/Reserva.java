package model;

import java.util.Date;

public class Reserva {
	
	private Hospede hospede;
	private Quarto quarto;
	private Date chegada;
	private Date saida;
	private StatusReserva status;
	
	public Reserva(){}
	
	public Reserva(Hospede hospede, Quarto quarto, Date chegada, Date saida, StatusReserva status){
		this.setHospede(hospede);
		this.setQuarto(quarto);
		this.setChegada(chegada);
		this.setSaida(saida);
		this.setStatus(status);
	}
	
	
	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Date getChegada() {
		return chegada;
	}

	public void setChegada(Date chegada) {
		this.chegada = chegada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public StatusReserva getStatus() {
		return status;
	}

	public void setStatus(StatusReserva status) {
		this.status = status;
	}
}
