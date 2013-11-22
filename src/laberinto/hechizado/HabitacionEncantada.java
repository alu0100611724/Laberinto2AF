package laberinto.hechizado;

import laberinto.fm.productos.Habitacion;

public class HabitacionEncantada extends Habitacion {

	protected Hechizo encantamiento;
	
	public HabitacionEncantada(int numHabitacion, Hechizo h) {
		super(numHabitacion);
		encantamiento=h;
	}

	public Hechizo getEncantamiento() {
		return encantamiento;
	}

}
