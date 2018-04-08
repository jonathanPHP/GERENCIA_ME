package model;

public class Usuario {

	private String nome;
	private String login;
	private String senha;
	private TipoUsuario tipo;
	
	public Usuario() {}
	
	public Usuario(String nome, String login, String senha, TipoUsuario tipo) {
		this.setLogin(login);
		this.setNome(nome);
		this.setSenha(senha);
		this.setTipo(tipo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	public boolean isGerente() {
		return this.getTipo() == TipoUsuario.GERENTE;
	}
}
