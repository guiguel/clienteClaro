package com.clienteClaro.controller;

import com.clienteClaro.dto.ClienteDTO;
import com.clienteClaro.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    public ClienteDTO criar(@RequestBody ClienteDTO dto){
        return service.criar(dto);
    }

    @GetMapping
    public List<ClienteDTO> listar(){
        return service.listar();
    }
}
