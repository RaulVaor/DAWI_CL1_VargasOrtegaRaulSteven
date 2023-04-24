package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelo.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer>{

}
