package org.servicio;

import org.dominio.Equipo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public interface IServicio {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(
			ClaseConfiguracion.class);
	
	public void guardar(Equipo equipo);	
	public void listar();
	
}
