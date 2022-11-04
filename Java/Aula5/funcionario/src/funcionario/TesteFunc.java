package funcionario;

import funcionario.model.Funcionario_;

public class TesteFunc {

	public static void main(String[] args) {
		
		Funcionario_ read = new Funcionario_("Leonardo", 456798, "Desenvolvedor", 5000, 452323);
		Funcionario_ leia = new Funcionario_("Link", 456798, "Hero", 5000, 452323);
		
		read.visuali();
		leia.visuali();

	}

}
