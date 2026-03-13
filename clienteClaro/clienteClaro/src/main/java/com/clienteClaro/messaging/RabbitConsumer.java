
@Component
public class RabbitConsumer {

    @RabbitListener(queues = "fila.cliente")
    public void consumir(String msg){
        System.out.println("Mensagem recebida: " + msg);
    }
}