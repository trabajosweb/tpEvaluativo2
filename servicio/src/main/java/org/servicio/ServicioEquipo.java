package org.servicio;

import org.dominio.Equipo;
import org.repositorio.IRepositorio;

public class ServicioEquipo implements IServicio{

	private IRepositorio repositorio;
		
	public IRepositorio getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	public void listar() {
		try {
			getRepositorio().listar();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void guardar(Equipo equipo) {
		// TODO Auto-generated method stub
		
	}
	

}
