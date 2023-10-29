import java.util.ArrayList;
import java.util.Scanner;

public class MainFilme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Filme> filmes = new ArrayList <Filme>();
		int menu = 0;
		
		System.out.println("------Menu--------");
		System.out.println("Digite 1 para cadastrar um filme");
		System.out.println("Digite 2 para buscar um filme");
		System.out.println("Digite 3 para exibir todos os filmes");
		menu = sc.nextInt();
		while (menu != 4) {
			
			if (menu ==1) {
				Filme novofilme = new Filme();
				sc.nextLine();
				System.out.println("Digite o nome/titulo do filme");
				novofilme.setTitulo(sc.nextLine());
				System.out.println("Digite a descrição do filme");
				novofilme.setDescricao(sc.nextLine());
				System.out.println("Digite o diretor do filme");
				novofilme.setDiretor(sc.next(), sc.nextInt(),sc.next());
				System.out.println("Digite o tempo de duração em minutos");
				novofilme.setDuracaoEmMinutos(sc.nextInt());
				filmes.add(novofilme);
			}
			if (menu == 2) {
				System.out.println("Informe o titulo/nome que deseja buscar:");
				for (int i = 0;i<filmes.size();i++) {
					filmes.get(i).comparartitulo(sc.nextLine());
				}
				
			}
			if (menu ==3) {
				for(int i =0;i<filmes.size();i++) {
					System.out.println(filmes.get(i));
				}
			}
			System.out.println("------Menu--------");
			System.out.println("Digite 1 para cadastrar um filme");
			System.out.println("Digite 2 para buscar um filme");
			System.out.println("Digite 3 para exibir todos os filmes");
			menu = sc.nextInt();
			
			
		}
		sc.close();


	}

}
