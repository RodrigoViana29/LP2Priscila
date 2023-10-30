import java.util.ArrayList;
import java.util.Scanner;

public class MainFilme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Filme> filmes = new ArrayList <Filme>();
		int menu = 0;
		
		System.out.println("--------Menu--------");
		System.out.println("Digite 1 para cadastrar um filme");
		System.out.println("Digite 2 para buscar um filme");
		System.out.println("Digite 3 para exibir todos os filmes");
		System.out.println("Digite 4 para terminar o programa");
		menu = sc.nextInt();
		while (menu != 4) {
			
			if (menu ==1) {
				Filme novofilme = new Filme();
				sc.nextLine();
				System.out.println("Digite o nome/titulo do filme:");
				novofilme.setTitulo(sc.nextLine());
				System.out.println("Digite a descrição do filme:");
				novofilme.setDescricao(sc.nextLine());
				System.out.println("Digite o diretor do filme,tempo de experiencia e local:");
				novofilme.setDiretor(sc.nextLine(), sc.nextInt(),sc.next());
				System.out.println("Digite o tempo de duração em minutos:");
				novofilme.setDuracaoEmMinutos(sc.nextInt());
				filmes.add(novofilme);
			}
			if (menu == 2) {
				sc.nextLine();
				System.out.println("Informe o titulo/nome que deseja buscar:");
				String j = sc.nextLine();
				boolean achou = false;
				for(int i =0;i<filmes.size();i++){
                    if(filmes.get(i).comparartitulo(j)){
                        System.out.println(filmes.get(i));
                        achou = true;
                    }
                }
                if(!achou)
                    System.out.println("Filme não encontrado.");
				
			}
			if (menu ==3) {
				for(int i =0;i<filmes.size();i++) {
					System.out.println(filmes.get(i));
					System.out.println(filmes.get(i).exibirDuracaoEmHoras());
				}
			}
			System.out.println("--------Menu--------");
			System.out.println("Digite 1 para cadastrar um filme");
			System.out.println("Digite 2 para buscar um filme");
			System.out.println("Digite 3 para exibir todos os filmes");
			System.out.println("Digite 4 para terminar o programa");
			menu = sc.nextInt();
			
			
		}
		sc.close();


	}

}
