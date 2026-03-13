@Configuration
public class RabbitConfig {

    @Bean
    public Queue filaCliente(){
        return new Queue("fila.cliente");
    }

}