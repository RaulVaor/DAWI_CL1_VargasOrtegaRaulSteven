package com.cibertec.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "areas")
public class Area {
	
	private static final long serialVersionUID = 1L; 
	
	@Id
	@Column(name="id_area")
	private int id;
	
	@Column(name="nom_area")
	private String nombre;
	
	@Column(name="cant_clien_area")
	private int cantidadClientes;
	
	
	
	
}
