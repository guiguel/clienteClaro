package com.clienteClaro.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClienteProducer {

    private final RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.queue.cliente}")
    private String filaCliente;

    public ClienteProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarMensagem(String mensagem) {
        rabbitTemplate.convertAndSend(filaCliente, mensagem);
    }
}