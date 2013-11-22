package laberinto.personajes;


import laberinto.estrategias.AgressiveBehaviour;
import laberinto.estrategias.IBehaviour;

public class GuerreroFuego extends GuerreroInvisible {
	
	public GuerreroFuego(){
		caracter = '@';
		strategy = new AgressiveBehaviour();
	}
	
	public GuerreroFuego(IBehaviour b) {
		super(b);
		caracter = '@';
	}
	
	public void move() {       
		strategy.moveCommand();
	}
	 
}
