

@Service
@RequiredArgsConstructor
public class RabbitProducer {

    private final RabbitTemplate rabbitTemplate;

    public void enviarMensagem(String msg){
        rabbitTemplate.convertAndSend("fila.cliente", msg);
    }
}