import java.util.Scanner;

public class CadastroClientes {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Cliente clientes[] = new Cliente[50];
for (int i = 0;i< 50;i++) {
	clientes[i] = new Cliente();
}
int qtd = 0;
int menu = 0;
System.out.println("digite 1 para cadastrar cliente");
System.out.println("digite 2 para buscar cliente pelo nome");
System.out.println("digite 3 para exibir dados dos clientes");
System.out.println("digite 4 para sair");
menu = sc.nextInt();

	while (menu != 4) {
			
			if (menu == 1) {
				if (clientes.length < 51) {
					Cliente novocliente = new Cliente();
					System.out.println("Informe o código do cliente: ");
					novocliente.setCodigo(sc.nextInt());
					System.out.println("Informe o nome do cliente: ");
					novocliente.setNome(sc.next());
					System.out.println("Informe o cpf do cliente: ");
					novocliente.setCpf(sc.next());
					System.out.println("Informe o telefone do cliente: ");
					novocliente.setTelefone(sc.next());
					clientes[qtd] = novocliente;
					qtd++;
				}
				else {
					System.out.println("limite esgotado");
				}
				
				
				}
				
					
				
			if (menu == 2) {
				String nome = sc.nextLine();
				for(int i = 0; i<qtd;i++) {
					//if (nome == )
					
					System.out.println(clientes[i]);
				}
			}
			if (menu == 3) {
				for(int i = 0; i<qtd;i++) {
					System.out.println(clientes[i]);
				}
			}
			System.out.println("digite 1,2,3 ou 4 denovo");
			menu = sc.nextInt();
			
		}
	sc.close();	
	}
			
}
