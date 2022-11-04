package games;

import games.model.Games;

public class Games_teste {

	public static void main(String[] args) {
		
		Games read = new Games("joão", 478965, "Zelda", 299, 299);
		Games leia = new Games("Carla", 89645, "Dark Souls", 299, 299);
		
		read.visuali();
		leia.visuali();

	}

}
