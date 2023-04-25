package com.cibertec.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Cliente;
import com.cibertec.repository.IClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private IClienteRepository repo;
	
	public void grabar(Cliente s) {
		repo.save(s);
	}
	
	public List<Cliente> listado() {
		return repo.findAll();
	}
}
