package com.projeto.injecaodependencias.notificacao;

import com.projeto.injecaodependencias.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificacaoEmail implements Notificador {

   @Autowired
   private NotificadorProperties propriedades;
    
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        
        System.out.println("Host: "+ propriedades.getHostServidor());
        System.out.println("Porta: "+propriedades.getPortaServidor());
        
        System.out.printf("Notificando %s atraves do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);

    }
    
    

}
