
public class Diretor {
	private String nome;
	private int tempodeexperiencia;
	private String local;
	
	
	public Diretor() {
	}


	public Diretor(String n, int t, String l) {
		this.nome = n;
		this.tempodeexperiencia = t;
		this.local = l;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String n) {
		this.nome = n;
	}


	public int getTempodeexperiencia() {
		return tempodeexperiencia;
	}


	public void setTempodeexperiencia(int t) {
		this.tempodeexperiencia = t;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String l) {
		this.local = l;
	}


	@Override
	public String toString() {
		return "nome = " + this.nome + ", tempodeexperiencia = " + this.tempodeexperiencia + ", local = " + this.local;
	}
	
	

}
