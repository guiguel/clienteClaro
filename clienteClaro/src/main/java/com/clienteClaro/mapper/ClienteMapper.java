package com.clienteClaro.mapper;

import com.clienteClaro.dto.ClienteDTO;
import com.clienteClaro.entity.Cliente;

public class ClienteMapper {

    public static ClienteDTO toDTO(Cliente cliente){

        ClienteDTO dto = new ClienteDTO();

        dto.setId(cliente.getId());
        dto.setNome(cliente.getNome());
        dto.setCpf(cliente.getCpf());
        dto.setEndereco(cliente.getEndereco());
        dto.setEmail(cliente.getEmail());
        dto.setTelefone(cliente.getTelefone());

        return dto;
    }

    public static Cliente toEntity(ClienteDTO dto){

        Cliente cliente = new Cliente();

        cliente.setId(dto.getId());
        cliente.setNome(dto.getNome());
        cliente.setCpf(dto.getCpf());
        cliente.setEndereco(dto.getEndereco());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());

        return cliente;
    }
}