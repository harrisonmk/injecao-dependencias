package com.projeto.injecaodependencias.notificacao;

import com.projeto.injecaodependencias.modelo.Cliente;
import org.springframework.stereotype.Component;


//@Primary
//@Qualifier("sms")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificacaoSms implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("Notificando %s por SMS atraves do telefone %s: %s\n",cliente.getNome(),cliente.getTelefone(),mensagem);

    }

}
