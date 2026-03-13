package com.clienteClaro.service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public Cliente criar(Cliente cliente){
        return repository.save(cliente);
    }

    public List<Cliente> listar(){
        return repository.findAll();
    }

    public Cliente atualizar(Long id, Cliente cliente){
        Cliente c = repository.findById(id).orElseThrow();
        c.setNome(cliente.getNome());
        c.setEmail(cliente.getEmail());
        return repository.save(c);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}