package funcionario.model;

public class Funcionario_ {
	
	private String nome;
	private int registro;
	private String cargo;
	private int salario;
	private int id;
	
	public Funcionario_(String nome, int registro, String cargo, int salario, int id) {
		super();
		this.nome = nome;
		this.registro = registro;
		this.cargo = cargo;
		this.salario = salario;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void visuali() {
		System.out.println("\n**************************");
		System.out.println("  Dados do funcionario ");
		System.out.println("\n**************************");
		System.out.println("\nNumero do seu id" + this.id);
		System.out.println("\nSeu nome" + this.nome);
		System.out.println("\nO seu cargo é: " + this.cargo);
		System.out.println("\nO valor do seu saláro é" + this.salario);
		System.out.println("\nNumero do seu registo é" + this.registro);
		
		
	}
	
	

}
