package clinete;

import clinete.model.Cliente;
import clinete.model.PessoaFisic;
import clinete.model.PessoaJuri;

public class Menu {

	public static void main(String[] args) {
		
		Cliente n1 = new Cliente(547964, "Leonardo", 1195647899, 5647896, "Avenida da paçoca");
		Cliente n2 = new Cliente(795494, "Zelda", 1195647899, 5647896, "Hyrule");
		PessoaFisic n3 = new PessoaFisic(85623, "Sora", 8454656, 89656, "Hyrule", 6548264);
		PessoaJuri n4 = new PessoaJuri(78796, "Artorias", 878456, 89895, "Gondor", 789655);
		
		
		n1.visuali();
		n2.visuali();
		n3.visuali();
		n4.visuali();
	}

}
