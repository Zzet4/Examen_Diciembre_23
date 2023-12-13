package proyectoExamen.es.curso.parte_3.pojo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

public class Producto {


	private int id;
	private String nombre;
	private String tipo;
	private double precio;
	private int unidades;
	
	public Producto() {
		super();
	}
	
	
	public Producto(int id, String nombre, String tipo, double precio, int unidades) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.unidades = unidades;
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


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getUnidades() {
		return unidades;
	}


	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", unidades="
				+ unidades + "]";
	}
	
	

	
	
}
