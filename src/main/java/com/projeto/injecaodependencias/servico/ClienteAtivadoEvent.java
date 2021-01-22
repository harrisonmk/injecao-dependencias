package com.projeto.injecaodependencias.servico;

import com.projeto.injecaodependencias.modelo.Cliente;

public class ClienteAtivadoEvent {

    private Cliente Cliente;
    
    

    public ClienteAtivadoEvent(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    
    
    public Cliente getCliente() {
        return Cliente;
    }
    
    
    

}
