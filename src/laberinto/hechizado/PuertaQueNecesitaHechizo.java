package laberinto.hechizado;

import laberinto.fm.productos.Habitacion;
import laberinto.fm.productos.Puerta;
import laberinto.personajes.GuerreroAgua;

public class PuertaQueNecesitaHechizo extends Puerta {

	protected Hechizo encantamiento;
	
	public PuertaQueNecesitaHechizo(Habitacion habitacion1,	Habitacion habitacion2, Hechizo h) {
		super(habitacion1, habitacion2);
		encantamiento = h;
	}
	
	public void Entrar(GuerreroAgua prota) {
		for (int i=0; i<prota.getPortaHechizos().size(); i++)
		  if ( prota.getPortaHechizos().get(i)== encantamiento) {
			 // el jugador deberia aparecer en el otroLadoDe la hab
			 habitacion2.Entrar(habitacion1.getPersonaje());
			 habitacion1.Entrar();
		  }
		// el jugador no se mueve de su sitio
		System.out.println("La puerta esta Encantada. Busca el hechizo para abrirla en otra habitacion");
		
	}

}
