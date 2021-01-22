package com.projeto.injecaodependencias.controle;

import com.projeto.injecaodependencias.modelo.Cliente;
import com.projeto.injecaodependencias.servico.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroControle {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroControle(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;

        System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
    }
    
    

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {

        Cliente joao = new Cliente("joao", "joao@hotmail.com", "564654");

        ativacaoClienteService.ativar(joao);

        return "Hello!";

    }

}
