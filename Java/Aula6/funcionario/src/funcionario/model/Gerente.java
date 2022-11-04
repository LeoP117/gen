package funcionario.model;

public class Gerente extends Funcionario_{

		private int relatoriosAprovados;
	public Gerente(String nome, int registro, String cargo, int salario, int id, int relatoriosAprovados) {
		super(nome, registro, cargo, salario, id);
		this.relatoriosAprovados = relatoriosAprovados;
	}
	public int getRelatoriosAprovados() {
		return relatoriosAprovados;
	}
	public void setRelatoriosAprovados(int relatoriosAprovados) {
		this.relatoriosAprovados = relatoriosAprovados;
	}
	
	public void visuali() {
		super.visuali();
		System.out.println("Total de relatorios aprovados: " + this.relatoriosAprovados);
	}
}
