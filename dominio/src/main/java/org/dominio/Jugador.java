package org.dominio;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;


@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)
public class Jugador {

	private String nombre;
	private String apellido;
	private String posicion;
	
	public Jugador(String nombre, String apellido, String posicion){
		super();
		this.nombre=nombre;
		this.apellido=apellido;
		this.posicion=posicion;
		
	}
	
	
	public Jugador(){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido
				+ ", posicion=" + posicion + "]";
	}
	
	
	
}
