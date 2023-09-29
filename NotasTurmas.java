import java.util.Arrays;
import java.util.Scanner;

public class NotasTurmas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alunos;
		System.out.println("informe o numero de alunos da turma: ");
		alunos = sc.nextInt();
		double[] notas;
		notas = new double[alunos];
		double soma = 0;
		for (int i = 0;i < notas.length;i++) {
			System.out.println("informe as notas: ");
			notas[i] = sc.nextDouble();
			soma = notas[i] + soma;
			
		}
		double media = soma/alunos;
		System.out.println("A média das notas é: "+ media);
		Arrays.sort(notas);
		System.out.println("As notas são: "+ Arrays.toString(notas));
	}

}
