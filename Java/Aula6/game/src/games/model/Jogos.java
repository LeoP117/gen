package games.model;

public class Jogos extends Games{
	
		private String tituloJogo;
	public Jogos(String colaboradores, int numeroPedido, String pedido, int preco, int totalPagar, String tituloJogo) {
		super(colaboradores, numeroPedido, pedido, preco, totalPagar);
		this.tituloJogo = tituloJogo;
	}
	public String getTituloJogo() {
		return tituloJogo;
	}
	public void setTituloJogo(String tituloJogo) {
		this.tituloJogo = tituloJogo;
	}
	
	public void visuali() {
		super.visuali();
		System.out.println("Titulo selecionado " + this.tituloJogo);
	}
		

}
