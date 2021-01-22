package com.projeto.injecaodependencias.servico;


import com.projeto.injecaodependencias.notificacao.Notificador;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }



}
