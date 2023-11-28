import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JSeparator;

public class Demo extends JFrame {

	private JPanel contentPane;
	private JTextField txtDigiteSeuNome;
	private JPanel frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEnter = new JButton("Cadastrar");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				String nome = txtDigiteSeuNome.getText();
				if (!nome.isEmpty()) {
					JOptionPane.showInternalMessageDialog(frame, "Olá " + nome);
				}
				else {
					JOptionPane.showInternalMessageDialog(frame, "Digite um nome");
				}
			}
		});
		btnEnter.setBounds(257, 147, 117, 25);
		contentPane.add(btnEnter);
		
		JLabel lblQualSeuNome = new JLabel("Qual seu nome?");
		lblQualSeuNome.setBounds(162, 55, 161, 15);
		contentPane.add(lblQualSeuNome);
		
		txtDigiteSeuNome = new JTextField();
		txtDigiteSeuNome.setText("Digite seu nome");
		txtDigiteSeuNome.setBounds(162, 100, 161, 19);
		contentPane.add(txtDigiteSeuNome);
		txtDigiteSeuNome.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDigiteSeuNome.setText("");
				
			}
		});
		btnLimpar.setBounds(146, 147, 117, 25);
		contentPane.add(btnLimpar);
		
		
		
		
		
		
	}
}
