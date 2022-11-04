package games.model;

public class Consoles extends Games{
		private String modelConso;
	public Consoles(String colaboradores, int numeroPedido, String pedido, int preco, int totalPagar, String modelConso) {
		super(colaboradores, numeroPedido, pedido, preco, totalPagar);
		this.modelConso = modelConso;
	}
	public String getModelConso() {
		return modelConso;
	}
	public void setModelConso(String modelConso) {
		this.modelConso = modelConso;
	}
	
	public void visuali() {
		super.visuali();
		System.out.println("Console selecionado: " + this.modelConso);
	}

}
