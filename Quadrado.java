public class Quadrado implements Forma{
	private float lado;

	public Quadrado() {
	}
	

	public Quadrado(float lado) {
		this.lado = lado;
	}
	

	public float getLado() {
		return lado;
	}


	public void setLado(float lado) {
		this.lado = lado;
	}

	public float calculaArea() {
		return (this.lado*this.lado);
	}

	public float calcularPerimetro() {
		return (4*this.lado);
	}

	public String toString() {
		return "Quadrado de lado: "+ this.lado + " de area de: " + this.calculaArea() + " e de perimetro de: "+ this.calcularPerimetro();
	}
	
}
