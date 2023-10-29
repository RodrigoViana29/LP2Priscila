
public class Filme {
	private String titulo;
	private String descricao;
	private Diretor diretor;
	private int duracaoEmMinutos;
	
	
	public Filme() {
	}


	public Filme(String ti, String des,String n,int t,String l, int d) {
		this.titulo = ti;
		this.descricao = des;
		this.diretor = new Diretor(n,t,l);
		this.duracaoEmMinutos = d;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Diretor getDiretor() {
		return diretor;
	}


	public void setDiretor(String n,int t,String l) {
		this.diretor.setNome(n); 
		this.diretor.setTempodeexperiencia(t);
		this.diretor.setLocal(l);
	}


	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}


	public void setDuracaoEmMinutos(int d) {
		this.duracaoEmMinutos = d;
	}
	
	public String exibirDuracaoEmHoras() {
		int duracaoemhoras;
		int duracaoemMin;
		duracaoemhoras = this.duracaoEmMinutos/60;
		duracaoemMin = this.duracaoEmMinutos%60;
		return " O filme " + this.titulo + " possui " + duracaoemhoras + " horas " + " e "+ duracaoemMin + " minutos de duração";
		
	}
	
	public String comparartitulo(String t) {
		if (this.titulo.equals(t)) {
			return "titulo: "+ this.titulo+
					"\n descrição: " + this.descricao+
					"\n diretor: " + this.diretor+
					"\n duração em minutos: "+this.duracaoEmMinutos;
		}
		else {
			return "O titulo " + t + "não foi encontrado";
		}
	}


	public String toString() {
		return "titulo = " + this.titulo + ", descricao = " + this.descricao + ", diretor = " + this.diretor + ", duracaoEmMinutos = "
				+ this.duracaoEmMinutos;
	}
	
	
	
	
}
