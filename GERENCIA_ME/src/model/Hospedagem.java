package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hospedagem {

	private Reserva reserva;
	private List<Servico> servicos = new ArrayList<Servico>();
	private Date checkin;
	private Date checkout;
	
	public Hospedagem() {}
	
	public Hospedagem(Reserva reserva, Date checkin, Date checkout, List<Servico> servicos) {
		this.setReserva(reserva);
		this.setCheckin(checkin);
		this.setCheckout(checkout);
		this.setServicos(servicos);
		
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
	public void addServicos(Servico servico){
		servicos.add(servico);
	}

}
