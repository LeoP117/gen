package clinete;

import clinete.model.Cliente;

public class Menu {

	public static void main(String[] args) {
		
		Cliente n1 = new Cliente(547964, "Leonardo", 1195647899, 5647896, "Avenida da paçoca");
		Cliente n2 = new Cliente(795494, "Zelda", 1195647899, 5647896, "Hyrule");
		
		n1.visuali();
		n2.visuali();
		
	}

}
