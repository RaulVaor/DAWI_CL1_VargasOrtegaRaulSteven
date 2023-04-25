package com.cibertec.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "areas")
public class Area {
	
	
	@Id
	@Column(name="id_area")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nom_area")
	private String nombre;
	
	@Column(name="cant_clien_area")
	private int cantidadClientes;
	
	@OneToMany(mappedBy = "idarea")
	private List<Cliente> listaClientes;
	
	
	
}
