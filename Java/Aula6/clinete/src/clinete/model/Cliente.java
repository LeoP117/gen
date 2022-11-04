package clinete.model;

public class Cliente {
	
	private int id; 
	private String nome;
	private int telefone;
	private long cpf;
	private String endereço;
	
	public Cliente(int id, String nome, int telefone, int cpf, String endereço) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereço = endereço;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public void visuali() {
		System.out.println("\n**************************");
		System.out.println("Dados do clinete ");
		System.out.println("\n**************************");
		System.out.println("\nNumero do seu id" + this.id);
		System.out.println("\nseu nome" + this.nome);
		System.out.println("\nNumero do seu cpf" + this.cpf);
		System.out.println("\no seu endereço é" + this.endereço);
		System.out.println("\nNumero de telefone" + this.telefone);
		
		
	}
	
			

}
