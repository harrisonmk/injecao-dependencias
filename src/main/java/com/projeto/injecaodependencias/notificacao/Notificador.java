package com.projeto.injecaodependencias.notificacao;

import com.projeto.injecaodependencias.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);


}
