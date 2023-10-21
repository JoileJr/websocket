package com.aula.backend.controller;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.aula.backend.entity.ProdutoNotificacao;

@Controller
public class ProdutoWebSocketController {

    @SendTo("/produto/novo-produto")
    public ProdutoNotificacao notificarProduto(ProdutoNotificacao notificacao){
        return notificacao;
    }
}
