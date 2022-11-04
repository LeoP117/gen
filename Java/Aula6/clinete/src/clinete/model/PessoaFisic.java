package clinete.model;

public class PessoaFisic extends Cliente{

	private int rg;
	public PessoaFisic(int id, String nome, int telefone, int cpf, String endereço, int rg) {
		super(id, nome, telefone, cpf, endereço);
		this.rg = rg;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	
    public void visuali () {
    	super.visuali ();
    	System.out.println("O numero do rg é" + this.rg);
    	
    
    }

}
