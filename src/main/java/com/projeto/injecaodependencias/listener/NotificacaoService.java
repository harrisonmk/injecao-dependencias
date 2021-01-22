package com.projeto.injecaodependencias.listener;

import com.projeto.injecaodependencias.notificacao.NivelUrgencia;
import com.projeto.injecaodependencias.notificacao.Notificador;
import com.projeto.injecaodependencias.notificacao.TipoDoNotificador;
import com.projeto.injecaodependencias.servico.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    
    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    
    
    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {

       
        notificador.notificar(event.getCliente(),"Seu cadastro no sistema esta ativo!");

    }
    
    

}
