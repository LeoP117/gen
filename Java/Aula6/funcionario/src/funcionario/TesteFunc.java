package funcionario;

import funcionario.model.Funcionario_;
import funcionario.model.Gerente;
import funcionario.model.Vendedor;

public class TesteFunc {

	public static void main(String[] args) {
		
		Funcionario_ read = new Funcionario_("Leonardo", 456798, "Desenvolvedor", 5000, 452323);
		Funcionario_ leia = new Funcionario_("Link", 456798, "Hero", 5000, 452323);
		Vendedor n1 = new Vendedor("Katia", 453236, "Vendedor interno", 3000, 69845, 550);
		Gerente n2 = new Gerente("Fernanda", 965478, "Gerente de operações", 5000, 53896, 60);
		
		
		read.visuali();
		leia.visuali();
		n1.visuali();
		n2.visuali();
	}

}
