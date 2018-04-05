package model;

public enum TipoPagamento {
	
	AVISTA(1), CARTAO(2);
    
    private final int tipo;
    TipoPagamento(int opcao){
        tipo = opcao;
    }
    public int getTipo(){
        return tipo;
    }
    
}
