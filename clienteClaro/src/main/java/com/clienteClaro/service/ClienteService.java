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

    public ClienteDTO atualizar(Long id, ClienteDTO dto) {

        Cliente cliente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        cliente.setNome(dto.getNome());
        cliente.setCpf(dto.getCpf());
        cliente.setEndereco(dto.getEndereco());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());

        cliente = repository.save(cliente);
        return ClienteMapper.toDTO(cliente);
    }

    public void excluir(Long id) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("Cliente não encontrado");
        }
        repository.deleteById(id);
    }

    public List<ClienteDTO> listar() {

        return repository.findAll()
                .stream()
                .map(ClienteMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ClienteDTO buscarPorId(Long id) {

        Cliente cliente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        return ClienteMapper.toDTO(cliente);
    }
}