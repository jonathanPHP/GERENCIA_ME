package main;

import model.Horario;
import model.Rota;

public class TesteHorarioRota {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rota natalBrasilia = new Rota();
		natalBrasilia.setNome("Natal-Brasília");
		
		Horario h1 = new Horario();
		Horario h2 = new Horario();
		
		h2.setRota(natalBrasilia);
		h1.setRota(natalBrasilia);
		
		natalBrasilia.addHorarios(h2);
		natalBrasilia.addHorarios(h1);
	}
}
