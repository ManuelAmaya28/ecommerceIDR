package com.idr.ecommerceIDR.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedidos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private long precio;
	@Column(nullable = false)
	private long cantidad;

//    {id: "1", nombre: "Agua", precio: 33, cantidad: 5}

	public Pedidos(long id, String nombre, long precio, long cantidad) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}//constructor

	public Pedidos(){
    
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getPrecio() {
		return precio;
	}

	public void setPrecio(long precio) {
		this.precio = precio;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	
}
