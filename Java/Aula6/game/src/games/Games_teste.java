package games;

import games.model.Consoles;
import games.model.Games;
import games.model.Jogos;

public class Games_teste {

	public static void main(String[] args) {
		
		Games read = new Games("joão", 478965, "Zelda", 299, 299);
		Games leia = new Games("Carla", 89645, "Dark Souls", 299, 299);
		Consoles n1 = new Consoles("joão", 89645, "Dark Souls", 299, 299, "PS4");
		Jogos n2 = new Jogos("Carla", 89645, "Dark Souls", 299, 299, "Elden Ring");
		
		
		read.visuali();
		leia.visuali();
		n1.visuali();
		n2.visuali();

	}

}
