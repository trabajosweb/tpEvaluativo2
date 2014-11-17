package presentacion;


import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

public class Navegacion extends Panel{

	public Navegacion(String id) {
		super(id);
		// TODO Auto-generated constructor stub

		Link inicio = new Link("inicio") {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				this.setResponsePage(new HomePage());
			}			
		};
		
		Link cargar = new Link("cargar") {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				//this.setResponsePage(new Cargar());
			}	
		};
		
		Link listar = new Link("listar") {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				//this.setResponsePage(new Listar());
				
			}			
		};
		
		add(inicio);
		add(cargar);
		add(listar);
	}
	
	

}
