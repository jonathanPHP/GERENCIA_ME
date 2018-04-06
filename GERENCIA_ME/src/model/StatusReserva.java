package model;

public enum StatusReserva {
	
	NOVA(1), CANCELADA(2), EFETIVADA(3);
    
    private final int status;
    StatusReserva(int opcao){
        status = opcao;
    }
    public int getStatus(){
        return status;
    }
    
}
