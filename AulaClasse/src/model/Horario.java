package model;

public class Horario {
	private Rota rota;
	private String turmo;
	
	public Horario(){}
	 
	public Rota getRota(){
		return rota;
	}
 
	public void setRota(Rota rota){
		this.rota = rota;
	}

	public String getTurmo() {
		return turmo;
	}

	public void setTurmo(String turmo) {
		this.turmo = turmo;
	}

}
