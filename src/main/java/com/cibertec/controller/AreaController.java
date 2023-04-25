package com.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.servicio.AreaService;

@Controller
@RequestMapping("/Area")
public class AreaController {
	
	@Autowired
	private AreaService servarea;
	
}
