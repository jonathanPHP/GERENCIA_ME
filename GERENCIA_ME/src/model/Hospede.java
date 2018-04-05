package model;

public class Hospede {
	
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	public Hospede() {}
	
	public Hospede(String nome, String cpf, Endereco endereco) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


}
