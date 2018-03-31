package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nome;
	private List<Trabalhador> empregados = new ArrayList<Trabalhador>();
	
	public Empresa(){}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public List<Trabalhador> getEmpregados() {
		return empregados;
	}
	
	public void addEmpregado(Trabalhador trabalhador){
		empregados.add(trabalhador);
	}
	
	public void imprimirDadosEmpresa(){
		System.out.println("O nome da empresa é "+ getNome());
		System.out.println("Lista de empregados:");
		for (Trabalhador trabalhador : empregados) {
			System.out.println(trabalhador.getNome() + " " + trabalhador.getMatricula());
		}
	}
}
