package com.clienteClaro.controller;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente){
        return service.criar(cliente);
    }

    @GetMapping
    public List<Cliente> listar(){
        return service.listar();
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id,
                             @RequestBody Cliente cliente){
        return service.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}