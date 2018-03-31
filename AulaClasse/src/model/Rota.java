package model;

import java.util.ArrayList;
import java.util.List;

public class Rota {
	private List<Horario> horarios = new ArrayList<Horario>();
	private String nome;
	
	public Rota(){}
	  
	public List<Horario> getHorarios(){
		return horarios;
	}
 
	public void setHorarios(List<Horario> horarios){
		this.horarios = horarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addHorarios(Horario horario){
		horarios.add(horario);
	}
}
