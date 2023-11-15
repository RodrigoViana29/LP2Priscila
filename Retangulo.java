
public class Retangulo implements Forma {
	private float lado;
	private float altura;
	
	
	public Retangulo() {
	}
	
	

	public Retangulo(float lado, float altura) {
		this.lado = lado;
		this.altura = altura;
	}



	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float calculaArea() {
			return (this.lado*this.altura);
		}


		public float calcularPerimetro(){
			return 2 * (this.lado+this.altura);
		}



		
		public String toString() {
			return "Retangulo de lado: " + this.lado + " de altura de: "+ this.altura + " de area de: " + this.calculaArea() + " e perimetro é: "+ this.calcularPerimetro();
			
		}
		
	

}
