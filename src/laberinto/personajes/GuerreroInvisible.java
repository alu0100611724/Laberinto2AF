package laberinto.personajes;

import java.util.ArrayList;

import laberinto.estrategias.IBehaviour;
import laberinto.estrategias.NormalBehaviour;
import laberinto.hechizado.Hechizo;


public class GuerreroInvisible {

	protected IBehaviour strategy;
	protected char caracter;
	protected ArrayList<Hechizo> portaHechizos;
	
	public GuerreroInvisible() {
		caracter = ' ';
		strategy = new NormalBehaviour();
		portaHechizos = new ArrayList<Hechizo>();
	}
	
	public ArrayList<Hechizo> getPortaHechizos() {
		return portaHechizos;
	}

	public GuerreroInvisible(IBehaviour b) {
		strategy = b;
	}
	
	public void move() {       
		strategy.moveCommand();
	}
	
	public void pintar() {
		System.out.println(" " + caracter + " ");
	}
	
	public char getCaracter() {
		return caracter;
	}

}
