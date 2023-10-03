
public class Cliente {
	private int codigo;
	private String nome;
	private String cpf;
	private String telefone;
	
	
	
	public Cliente() {
	}



	public Cliente(int codigo, String nome, String cpf, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	
	public String toString() {
		return "Cliente [codig o= " + this.codigo + ", nome = " + this.nome + ", cpf = " + this.cpf + ", telefone = " + this.telefone + "]";
	}
	
	
	
	
	
	
}
