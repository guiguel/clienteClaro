package com.clienteClaro.dto;

import lombok.Data;

@Data
public class ClienteDTO {

    private Long id;

    private String nome;

    private String cpf;

    private String endereco;

    private String email;

    private String telefone;
}