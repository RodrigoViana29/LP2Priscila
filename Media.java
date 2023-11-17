import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		String n1,n2;
		double media;
		n1 = JOptionPane.showInputDialog(null, "Digite a primeira nota");
		n2 = JOptionPane.showInputDialog(null, "Digite a segunda nota");
		media = (Double.parseDouble(n1)+ Double.parseDouble(n2))/2;
		if (media > 7) {
			JOptionPane.showInternalMessageDialog(null, "O aluno está aprovado com media: "+ media, "Media do Aluno", -1);
			
		}
		else {
			JOptionPane.showInternalMessageDialog(null, "O aluno está reprovado e com média: "+ media, "Média do Aluno", -1);
		}
		

	}

}
