package funcionario.model;

public class Vendedor extends Funcionario_{
		
		private int metadeVenda;
	public Vendedor(String nome, int registro, String cargo, int salario, int id, int metaDeVenda) {
		super(nome, registro, cargo, salario, id);
		this.metadeVenda = metaDeVenda;
	}
	public int getMetadeVenda() {
		return metadeVenda;
	}
	public void setMetadeVenda(int metadeVenda) {
		this.metadeVenda = metadeVenda;
	}
	
	public void visuali() {
		super.visuali();
		System.out.println("Metas de venda atingida: " + this.metadeVenda);
	}

}
