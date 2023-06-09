package com.cibertec.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Area;
import com.cibertec.repository.IAreaRepository;

@Service
public class AreaService {
	@Autowired
	private IAreaRepository repo;
	
	public List<Area> listar(){
		return repo.findAll();
	}
}
