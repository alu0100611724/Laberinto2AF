package laberinto.luchas;

import laberinto.fm.fabricas.JuegoDelLaberinto;
import laberinto.fm.productos.Habitacion;

public class JuegoDelLaberintoLuchas extends JuegoDelLaberinto {
	
	public JuegoDelLaberintoLuchas() {
		super();
	}

	public Habitacion fabricarHabitacion(int n) {
		return new HabitacionDeElementos(n);
	}
	
	
}
