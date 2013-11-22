package Main;

import laberinto.AbsFact.CreadorJuegosLab;
import laberinto.fm.fabricas.JuegoDelLaberinto;
import laberinto.fm.fabricas.Laberinto;

public class Main {

	public static void main(String[] args) {
		
		CreadorJuegosLab fabricaLab = new CreadorJuegosLab();
		
		System.out.println("\nMortal Kombat Maze\n");
		JuegoDelLaberinto mortalKombat = fabricaLab.CreaKombats();
		Laberinto laberintoLucha = mortalKombat.crearLaberinto();
		laberintoLucha.play();
		
		System.out.println("\nHogwarts Maze\n");
		JuegoDelLaberinto elSecrtoDeHogwarts = fabricaLab.CreaHogwarts();
		Laberinto hogwarts = elSecrtoDeHogwarts.crearLaberinto();
		hogwarts.play();
	}

}

