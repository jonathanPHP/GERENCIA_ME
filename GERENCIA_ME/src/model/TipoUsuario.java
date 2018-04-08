package model;

public enum TipoUsuario {
	
	GERENTE(1), RECEPCIONISTA(2);
    
    private final int tipo;
    TipoUsuario(int opcao){
        tipo = opcao;
    }
    public int getTipo(){
        return tipo;
    }
    
}
