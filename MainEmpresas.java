
import java.util.ArrayList;
import java.util.Scanner;



public class MainEmpresas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Empresa> empresas = new ArrayList<Empresa>();
		int qtd = 0;
		int menu = 0;
		
		
		System.out.println("-----Menu------");
		System.out.println("Digite 1 para cadastrar uma empresa");
		System.out.println("Digite 2 para exibir todas as empresas");
		System.out.println("Digite 3 para finalizar o programa");
		menu = sc.nextInt();
		while(menu !=  3 ) {
		
			if (menu == 1) {
				if (qtd <30) {
					Empresa novaempresa = new Empresa();
					sc.nextLine();
					System.out.println("Informe o nome da empresa:");
					novaempresa.setNome(sc.nextLine());
					System.out.println("Informe o CNPJ:");
					novaempresa.setCNPJ(sc.nextLine());
					System.out.println("Informe o endereço:");
					novaempresa.setEndereco(sc.nextLine());
					System.out.println("Informe a cidade:");
					novaempresa.setCidade(sc.nextLine());
					System.out.println("Informe o estado:");
					novaempresa.setEstado(sc.nextLine());
					System.out.println("Informe o telefone:");
					novaempresa.setTelefone(sc.nextInt());
					System.out.println("Informe a quantidade de funcionarios:");
					novaempresa.setQtdfuncionarios(sc.nextInt());
					empresas.add(novaempresa);
					qtd++;
				}
				
			}
			if (menu == 2) {
				for (int i = 0; i<qtd;i++) {
					System.out.println(empresas.get(i));
				}
			}
			System.out.println("-----Menu------");
			System.out.println("Digite 1 para cadastrar uma empresa");
			System.out.println("Digite 2 para exibir todas as empresas");
			System.out.println("Digite 3 para finalizar o programa");
			menu = sc.nextInt();
		}
	sc.close();
		

	}

}