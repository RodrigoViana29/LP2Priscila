import java.util.Scanner;

public class CadastroClientes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantos clientes deseja cadastrar no máximo 50: ");
		int qtd = 0;
		
		qtd = sc.nextInt();
		while (qtd > 50) {
			System.out.println("Digite um valor menor que 50: ");
			qtd = sc.nextInt();
		}
		Cliente  clientes[] = new Cliente[qtd];
		for (int i = 0; i<clientes.length;i++) {
			clientes[i] = new Cliente();
			System.out.println("Informe o código do cliente: ");
			clientes[i].setCodigo(sc.nextInt());
			System.out.println("Informe o nome do cliente: ");
			clientes[i].setNome(sc.next());
			System.out.println("Informe o cpf do cliente: ");
			clientes[i].setCpf(sc.next());
			System.out.println("Informe o telefone do cliente: ");
			clientes[i].setTelefone(sc.next());
				
		}
		System.out.println("O número de clientes é: " + clientes.length);
		for(int i = 0; i< clientes.length;i++) {
			System.out.println(clientes[i]);
		}
	sc.close();	
	}
}
