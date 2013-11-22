package laberinto.hechizado;

import laberinto.fm.fabricas.JuegoDelLaberinto;
import laberinto.fm.productos.Habitacion;
import laberinto.fm.productos.Puerta;

public class JuegoDelLaberintoEncantado extends JuegoDelLaberinto {
	
	private int idHechizos;
	
	//cada puerta hechizada necesita un hechizo parar abrirla, que puede estar en cualquier parte del laberinto
	public JuegoDelLaberintoEncantado() {
		super();
		this.idHechizos = 0;
	}

    //existiran tantas habitaciones encantadas como puertas
	public Habitacion fabricarHabitacion(int n) {
		return new HabitacionEncantada(n, Hechizar());
	}
	
	
	//Una puerta encantada posee un unico hechizo que la abrira
	public Puerta fabricarPuerta(Habitacion h1, Habitacion h2) {
		return new PuertaQueNecesitaHechizo(h1, h2, new Hechizo(idHechizos));
	}
	
	//se utiliza para abrir una puerta encantada especifica
	protected final Hechizo Hechizar() {
		return new Hechizo(idHechizos++);
		
	}
}
