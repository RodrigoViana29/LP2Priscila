import javax.swing.JOptionPane;

public class Testeinterfacegrafica {
	public static void main(String[] args) {
		//String nome;
		//nome = JOptionPane.showInputDialog(null, "Informe seu nome");
		//JOptionPane.showInternalMessageDialog(null, "Olá " + nome, "Boas Vindas", 1);
		int resp;
		String[] op = {"Atrasado","Em dia","Adiantado"};
		resp =  JOptionPane.showOptionDialog(null, "Como estão as atvidades de LP2 ?","LP2" , JOptionPane.DEFAULT_OPTION, -1, null, op, "Adiantado");
		if (resp == 0) {
			JOptionPane.showInternalMessageDialog(null, "Não desanime");
		}
		else {
			if (resp == 1) {
				JOptionPane.showMessageDialog(null, "Muito bom se dedicando","atvidades LP2",1);
			}
			else {
				if (resp == 2) {
					JOptionPane.showInternalMessageDialog(null, "Excelente", "Atvidades LP2", 1);
				}
				else {
					
				}
			}
		}
	}

}
