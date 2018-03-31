package model;

public class Roda {

	private String aro;
	private String fabricante;
	
	public Roda(String aro, String fabricante){
		this.aro = aro;
		this.fabricante = fabricante;
	}
	public String getAro() {
		return aro;
	}
	public void setAro(String aro) {
		this.aro = aro;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
}


