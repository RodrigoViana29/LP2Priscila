

public class Empresa {
	private String nome;
	private String CNPJ;
	private String endereco;
	private String cidade;
	private String estado;
	private int telefone;
	private int qtdfuncionarios;
	
	
	
	public Empresa() {
		
	}
	
	
	
	public Empresa(String nome, String CNPJ, String endereco, String cidade, String estado, int telefone,int qtdfuncionarios){
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.qtdfuncionarios = qtdfuncionarios;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getQtdfuncionarios() {
		return qtdfuncionarios;
	}
	public void setQtdfuncionarios(int qtdfuncionarios) {
		this.qtdfuncionarios = qtdfuncionarios;
	}


	public String toString() {
		return "Empresa [nome = " + this.nome + ", CNPJ = " + this.CNPJ + ", endereco = " + this.endereco + ", cidade = " + this.cidade
				+ ", estado = " + this.estado + ", telefone = " + this.telefone + ", qtdfuncionarios = " + this.qtdfuncionarios + "]";
	}
	
	
}