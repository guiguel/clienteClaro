package com.clienteClaro.service;

import java.util.List;
import java.util.stream.Collectors;

import com.clienteClaro.dto.ClienteDTO;
import com.clienteClaro.entity.Cliente;
import com.clienteClaro.mapper.ClienteMapper;
import com.clienteClaro.repository.ClienteRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteDTO criar(ClienteDTO dto) {

        Cliente cliente = ClienteMapper.toEntity(dto);

        cliente = repository.save(cliente);

        return ClienteMapper.toDTO(cliente);
    }

    public List<ClienteDTO> listar() {

        return repository.findAll()
                .stream()
                .map(ClienteMapper::toDTO)
                .collect(Collectors.toList());
    }
}