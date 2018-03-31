package main;

import model.Assistente;
import model.Funcionario;
import model.Gerente;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Assistente assistente = new Assistente("Nome Assistente", "assistente@gmail.com", "admin");
		
		Funcionario funcionario = new Funcionario("Nome funcionario", "email@funcionario");
		Gerente gerente = new Gerente("Nome Gerente", "gerente@gmail.com", 12);
		System.out.println(gerente.getClass().getSuperclass());
		System.out.println(gerente.getClass().getName());

		if(gerente instanceof Funcionario){
			System.out.println("Gerente é uma instãncia da Classe Funcionario");
		}
		
		if(!(funcionario instanceof Gerente) ){
			System.out.println("Funcionario não é uma instância Gerente");
		}
	}
}

