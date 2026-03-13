import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitConsumer {

    @RabbitListener(queues = "fila.cliente")
    public void consumir(String msg){
        System.out.println("Mensagem recebida: " + msg);
    }
}