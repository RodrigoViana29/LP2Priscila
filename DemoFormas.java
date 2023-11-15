import java.util.Scanner;

public class DemoFormas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		System.out.println("-------Menu-------");
		System.out.println("Digite 1 para criar um Retangulo");
		System.out.println("Digite 2 para criar um Circulo");
		System.out.println("Digite 3 para criar um Quadrado");
		System.out.println("Digite 4 para terminar o programa");
		menu =  sc.nextInt();
		while (menu != 4) {
			if (menu ==1) {
				System.out.println("Digite o lado do Retangulo: ");
				float lado = sc.nextFloat();
				System.out.println("Digite a altura do retangulo: ");
				float altura = sc.nextFloat();
				Retangulo retangulo = new Retangulo(lado,altura);
				System.out.println(retangulo);
			}
			if (menu ==2){
				System.out.println("Informe o raio do Circulo: ");
				float raio = sc.nextFloat();
				Circulo circulo = new Circulo(raio);
				System.out.println(circulo);
			}
			if (menu == 3 ){
				System.out.println("Digite o lado do Quadrado: ");
				float lado = sc.nextFloat();
				Quadrado quadrado =  new Quadrado(lado);
				System.out.println(quadrado);
			}
			System.out.println("-------Menu-------");
			System.out.println("Digite 1 para criar um Retangulo");
			System.out.println("Digite 2 para criar um Circulo");
			System.out.println("Digite 3 para criar um Quadrado");
			System.out.println("Digite 4 para terminar o programa");
			menu =  sc.nextInt();
		}
	sc.close();
	}

}
