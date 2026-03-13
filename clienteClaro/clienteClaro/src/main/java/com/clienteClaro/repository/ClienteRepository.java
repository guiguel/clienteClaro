package com.clienteClaro.repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByCpf(String cpf);

}