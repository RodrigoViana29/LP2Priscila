import java.util.Scanner;

public class ProdMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto[] produtos =  new Produto[3];
		for(int i = 0; i<produtos.length;i++) {
			produtos[i] = new Produto();
			System.out.println("Informe o código do produto: ");
			produtos[i].setCodigo(sc.nextInt());
			System.out.println("Informe o nome: ");
			produtos[i].setNome(sc.next());
			System.out.println("Informe o valor do produto: ");
			produtos[i].setValor(sc.nextDouble());
			
		}
		for(int i = 0; i<produtos.length;i++) {
			System.out.println(produtos[i]);
		}
		sc.close();
	}

}
