package com.cibertec.modelo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente{
	
	@Id
	@Column(name = "id_cliente")
	private int id;
	
	@Column(name = "nom_cliente")
	private String nombre;
	
	@Column(name = "id_area")
	private int area;
	
	@Column(name = "edad_cliente")
	private int edad;
	
	@Column(name = "correo_cliente")
	private String correo;
	
	@Column(name = "dni_cliente", length = 8)
	private String dni;
	
	
	
	public Cliente(int id, String nombre, int area, int edad, String correo, String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.area = area;
		this.edad = edad;
		this.correo = correo;
		this.dni = dni;
	}


	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "cliente [id=" + id + ", nombre=" + nombre + ", area=" + area + ", edad=" + edad + ", correo=" + correo
				+ ", dni=" + dni + "]";
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
