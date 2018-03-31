package model;

import java.util.ArrayList;
import java.util.List;

public class Carro {

	private String cor;
	private String ano;
	private List<Roda> rodas = new ArrayList<Roda>();
	
	public Carro(){
		
	}
	
	public void addRoda(Roda roda){
		rodas.add(roda);
	}
	
	public List<Roda> getRodas() {
		return rodas;
	}
	public void setRodas(List<Roda> rodas) {
		this.rodas = rodas;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
