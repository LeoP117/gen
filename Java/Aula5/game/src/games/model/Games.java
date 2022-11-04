package games.model;



public class Games {
	
	private String colaboradores;
	private int numeroPedido;
	private String pedido;
	private int preco;
	private int totalPagar;
	
	public Games(String colaboradores, int numeroPedido, String pedido, int preco, int totalPagar) {
		super();
		this.colaboradores = colaboradores;
		this.numeroPedido = numeroPedido;
		this.pedido = pedido;
		this.preco = preco;
		this.totalPagar = totalPagar;
	}

	public String getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(String colaboradores) {
		this.colaboradores = colaboradores;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public int getPreço() {
		return preco;
	}

	public void setPreço(int preco) {
		this.preco = preco;
	}

	public int getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(int totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	public void visuali() {
		System.out.println("\n**************************");
		System.out.println(" Dados do pedido ");
		System.out.println("\n**************************");
		System.out.println("\nVendido por: " + this.colaboradores);
		System.out.println("\nO Numero do seu pedido é: " + this.numeroPedido);
		System.out.println("\nSeu pedido é: " + this.pedido);
		System.out.println("\nValor do produto: " + this.preco);
		System.out.println("\nTotal a pgar: " + this.totalPagar);
		
		
	}
	
	

}
