package trabalho_final_poo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.Button;
import javax.swing.JButton;

public class CadastroObra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	
	private ObraDeArte obraDeArte = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroObra frame = new CadastroObra();
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
	public CadastroObra() {
		setTitle("Cadastro de Obra de Arte");
		setBounds(100, 100, 485, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EDtulo:");
		lblNewLabel.setBounds(10, 24, 95, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(115, 18, 248, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAno = new JLabel("Ano de cria\u00E7\u00E3o:");
		lblAno.setBounds(239, 230, 101, 14);
		contentPane.add(lblAno);
		
		textField_1 = new JTextField();
		textField_1.setBounds(343, 224, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor:");
		lblNewLabel_1.setBounds(10, 202, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(115, 196, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDataDeCriao = new JLabel("Data de cria\u00E7\u00E3o:");
		lblDataDeCriao.setBounds(239, 202, 101, 14);
		contentPane.add(lblDataDeCriao);
		
		textField_3 = new JTextField();
		textField_3.setBounds(343, 196, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPathDaImagem = new JLabel("Path da imagem:");
		lblPathDaImagem.setBounds(10, 58, 95, 14);
		contentPane.add(lblPathDaImagem);
		
		textField_4 = new JTextField();
		textField_4.setBounds(115, 52, 248, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(10, 177, 70, 14);
		contentPane.add(lblAutor);
		
		textField_5 = new JTextField();
		textField_5.setBounds(115, 171, 165, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservaes.setBounds(10, 86, 95, 14);
		contentPane.add(lblObservaes);
		
		textField_6 = new JTextField();
		textField_6.setBounds(115, 86, 248, 45);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox = new JComboBox(new Object[] { "Escultura", "Tapete", "Quadro" });
		
		comboBox.setBounds(115, 140, 101, 20);
		contentPane.add(comboBox);
		
		JLabel lblTipoDaObra = new JLabel("Tipo da obra:");
		lblTipoDaObra.setBounds(10, 146, 95, 14);
		contentPane.add(lblTipoDaObra);
		
		JLabel lblEstilo = new JLabel("Estilo:");
		lblEstilo.setBounds(10, 230, 81, 14);
		contentPane.add(lblEstilo);
		
		textField_7 = new JTextField();
		textField_7.setBounds(115, 224, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblMaterial = new JLabel("Material:");
		lblMaterial.setBounds(10, 259, 77, 14);
		contentPane.add(lblMaterial);
		
		textField_8 = new JTextField();
		textField_8.setBounds(115, 253, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(343, 303, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblPas = new JLabel("Pa\u00EDs:");
		lblPas.setBounds(239, 309, 101, 14);
		contentPane.add(lblPas);
		
		JLabel lblTcnica = new JLabel("T\u00E9cnica:");
		lblTcnica.setBounds(10, 284, 86, 14);
		contentPane.add(lblTcnica);
		
		textField_10 = new JTextField();
		textField_10.setBounds(115, 278, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblLargura = new JLabel("Largura:");
		lblLargura.setBounds(239, 259, 101, 14);
		contentPane.add(lblLargura);
		
		textField_11 = new JTextField();
		textField_11.setBounds(343, 253, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblComprimento = new JLabel("Comprimento:");
		lblComprimento.setBounds(239, 284, 101, 14);
		contentPane.add(lblComprimento);
		
		textField_12 = new JTextField();
		textField_12.setBounds(343, 278, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		Choice choice = new Choice();
		choice.setBounds(10, 332, 119, 20);
		contentPane.add(choice);
		
		JLabel lblNewLabel_2 = new JLabel("Propriet\u00E1rios Anteriores:");
		lblNewLabel_2.setBounds(10, 312, 153, 14);
		contentPane.add(lblNewLabel_2);
		
		Button button = new Button("Limpar");
		button.setBounds(296, 380, 81, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("OK");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//adicionar
			}
		});
		button_1.setBounds(379, 380, 81, 22);
		contentPane.add(button_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(214, 379, 81, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(433, 284, 36, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(433, 259, 46, 14);
		contentPane.add(lblNewLabel_4);
	}
	
	public ObraDeArte getObraDeArte()
	{
		return this.obraDeArte;
	}
}
