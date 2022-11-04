package clinete.model;

public class PessoaJuri extends Cliente{
	
	private int cnpj;
	public PessoaJuri(int id, String nome, int telefone, int cpf, String endereço, int cnpj) {
		super(id, nome, telefone, cpf, endereço);
		this.cnpj = cnpj; 
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visuali() {
		super.visuali();
		System.out.println("O numero do CNPJ é" + this.cnpj);
	}

}
