package com.clienteClaro.service;

import com.clienteClaro.dto.ClienteDTO;
import com.clienteClaro.entity.Cliente;
import com.clienteClaro.mapper.ClienteMapper;
import com.clienteClaro.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ClienteServiceTest {

    @Mock
    private ClienteRepository repository;

    @InjectMocks
    private ClienteService service;

    @Test
    public void deveCriarCliente() {

        ClienteDTO dto = new ClienteDTO();
        dto.setNome("Manoel");
        dto.setCpf("12345678900");
        dto.setEmail("manoel@email.com");

        Cliente cliente = ClienteMapper.toEntity(dto);
        cliente.setId(1L);

        when(repository.save(any(Cliente.class))).thenReturn(cliente);

        ClienteDTO resultado = service.criar(dto);

        assertNotNull(resultado);
        assertEquals("Manoel", resultado.getNome());

        verify(repository, times(1)).save(any(Cliente.class));
    }

    @Test
    public void deveListarClientes() {

        Cliente c1 = new Cliente();
        c1.setId(1L);
        c1.setNome("João");

        Cliente c2 = new Cliente();
        c2.setId(2L);
        c2.setNome("Maria");

        when(repository.findAll()).thenReturn(Arrays.asList(c1, c2));

        List<ClienteDTO> lista = service.listar();

        assertEquals(2, lista.size());

        verify(repository, times(1)).findAll();
    }

    @Test
    public void deveBuscarClientePorId() {

        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Carlos");

        when(repository.findById(1L)).thenReturn(Optional.of(cliente));

        ClienteDTO dto = service.buscarPorId(1L);

        assertNotNull(dto);
        assertEquals("Carlos", dto.getNome());
    }

    @Test
    public void deveExcluirCliente() {

        when(repository.existsById(1L)).thenReturn(true);

        service.excluir(1L);

        verify(repository, times(1)).deleteById(1L);
    }
}
