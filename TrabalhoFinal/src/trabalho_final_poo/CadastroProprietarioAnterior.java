package trabalho_final_poo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroProprietarioAnterior extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnCancelar;
	private JButton btnLimpar;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProprietarioAnterior frame = new CadastroProprietarioAnterior();
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
	public CadastroProprietarioAnterior() {
		setTitle("Cadastro de Propriet\u00E1rio Anterior");
		setBounds(100, 100, 420, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 16, 75, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 49, 75, 14);
		contentPane.add(lblCpf);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 80, 75, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblNewLabel = new JLabel("Nacionalidade:");
		lblNewLabel.setBounds(10, 111, 101, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(95, 11, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 44, 139, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 75, 139, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(95, 108, 139, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(138, 151, 89, 23);
		contentPane.add(btnCancelar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(228, 151, 89, 23);
		contentPane.add(btnLimpar);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(316, 151, 89, 23);
		contentPane.add(btnOk);
	}

}
