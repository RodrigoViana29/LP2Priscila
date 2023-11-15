
public class Circulo implements Forma {
	private float raio;
	

	public Circulo() {
	}
	
	public Circulo(float raio) {
		this.raio = raio;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float calculaArea() {
		return (float)(Math.PI*Math.pow(raio,2));
	}

	
	public float calcularPerimetro() {
		return (float)(2*Math.PI*this.raio);
	}

	public String toString() {
		return "Circulo de raio é: " + this.raio + " de area: " + this.calculaArea() + " de perimetro: " + this.calcularPerimetro();
	}

}
