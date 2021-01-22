package com.projeto.injecaodependencias.servico;

import com.projeto.injecaodependencias.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService  {

    //@Qualifier("email") //escolhe a classe de notificacaoEmail
    //@Autowired(required = false) //dependencia opcional
   // @TipoDoNotificador(NivelUrgencia.URGENTE)
    //@Autowired
   // private Notificador notificador;
    
    @Autowired
    private ApplicationEventPublisher eventoPublico;

    
    public void ativar(Cliente cliente) {

        cliente.ativar();
        
        eventoPublico.publishEvent(new ClienteAtivadoEvent(cliente));
               
       

    }


      

}
