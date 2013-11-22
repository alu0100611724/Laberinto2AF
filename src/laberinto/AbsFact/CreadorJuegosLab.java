package laberinto.AbsFact;

import laberinto.fm.fabricas.JuegoDelLaberinto;
import laberinto.hechizado.JuegoDelLaberintoEncantado;
import laberinto.luchas.JuegoDelLaberintoLuchas;

public class CreadorJuegosLab {

	public JuegoDelLaberinto CreaHogwarts() {
		return new JuegoDelLaberintoEncantado();
	}
	
	public  JuegoDelLaberinto CreaKombats() {
		return new JuegoDelLaberintoLuchas();
	}
}
