package org.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import org.dominio.Equipo;
import org.dominio.Jugador;


public class RepositorioEquipo implements IRepositorio{

	public void guardar(Equipo equipo) {
		
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			pm.makePersistent(equipo);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		
	}

	public List listar() {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		
		List<Equipo> equipo = new ArrayList<Equipo>();
		
		try {
			tx.begin();
			
			Extent ex = pm.getExtent(Equipo.class);
			
			Query consulta = pm.newQuery(Equipo.class);
			List<Equipo> listarEquipos;
			
			listarEquipos = (List<Equipo>) consulta.execute();
			
			for(Equipo e:listarEquipos){
				Equipo equipo1 =new Equipo();
				Jugador jugador = new Jugador();
				equipo1.setNombre(e.getNombre());
				jugador.setNombre(e.getJugador().getNombre());
				jugador.setApellido(e.getJugador().getApellido());
				jugador.setPosicion(e.getJugador().getPosicion());
				equipo1.setJugador(jugador);
				equipo.add(equipo1);
				
			}
			tx.commit();
			

		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		
		return equipo;

	}
	

}
