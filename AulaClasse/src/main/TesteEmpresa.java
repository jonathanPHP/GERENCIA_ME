package main;
import model.Trabalhador;
import model.Empresa;

public class TesteEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabalhador joao = new Trabalhador (3466, "João Batista");
		Trabalhador maria = new Trabalhador(2345, "Maria Jose");
		Trabalhador jose = new Trabalhador (6788, "José da Silva");
		
		Empresa mercadinho = new Empresa();
		Empresa farmacia = new Empresa();
		
		mercadinho.setNome("Mercadinho do Bairro");
		mercadinho.addEmpregado(joao);
		mercadinho.imprimirDadosEmpresa();
		
		farmacia.setNome("Farmácia");
		farmacia.addEmpregado(maria);
		farmacia.addEmpregado(jose);
		System.out.println();
		farmacia.imprimirDadosEmpresa();
		
		System.out.println(farmacia.getEmpregados().toString());
	}

}
