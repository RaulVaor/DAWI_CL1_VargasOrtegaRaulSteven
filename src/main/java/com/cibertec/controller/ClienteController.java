package com.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.modelo.Cliente;
import com.cibertec.repository.IClienteRepository;


@Controller
public class ClienteController {
	
	
	@GetMapping("/cargar")
	public String cargarPagina(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "APP-VARGAS-REGISTRO";
	}
	
	@Autowired
	private IClienteRepository repo;
	
	@PostMapping("/guardar")
	public String guardarPagina(@ModelAttribute Cliente cliente) {
		System.out.println(cliente);
		repo.save(cliente);
		return "APP-VARGAS-REGISTRO";
	}
}
