package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.modelo.Cliente;
import com.cibertec.repository.IClienteRepository;
import com.cibertec.servicio.AreaService;
import com.cibertec.servicio.ClienteService;


@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	
	@Autowired
	private ClienteService servcli;
	
	private AreaService servarea;
	
	
	@GetMapping("/registro")
	public String registrar(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "APP-VARGAS-REGISTRO";
	}
	
	@RequestMapping("/listado")
	public String listar(Model modelo) {
		List<Cliente> cl=servcli.listado();
		modelo.addAttribute("lista", cl);
		return "APP-VARGAS-REGISTRO";
	}
}
