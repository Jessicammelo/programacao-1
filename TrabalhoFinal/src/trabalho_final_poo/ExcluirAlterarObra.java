package trabalho_final_poo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ExcluirAlterarObra extends JFrame {

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
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirAlterarObra frame = new ExcluirAlterarObra();
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
	public ExcluirAlterarObra() {
		setTitle("Excluir/Alterar Obra de Arte");
		setBounds(100, 100, 495, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(10, 21, 46, 14);
		contentPane.add(lblTtulo);
		
		textField = new JTextField();
		textField.setBounds(64, 15, 203, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(323, 49, 102, 23);
		contentPane.add(btnPesquisar);
		
		JLabel lblTtulo_1 = new JLabel("T\u00EDtulo:");
		lblTtulo_1.setBounds(10, 101, 95, 14);
		contentPane.add(lblTtulo_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 95, 221, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPathDaImagem = new JLabel("Path da imagem:");
		lblPathDaImagem.setBounds(10, 135, 102, 14);
		contentPane.add(lblPathDaImagem);
		
		textField_2 = new JTextField();
		textField_2.setBounds(115, 129, 221, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Observa\u00E7\u00F5es:");
		lblNewLabel.setBounds(10, 167, 95, 14);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(115, 167, 221, 60);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTipoDaObra = new JLabel("Tipo da Obra:");
		lblTipoDaObra.setBounds(10, 244, 95, 14);
		contentPane.add(lblTipoDaObra);
		
		JComboBox comboBox = new JComboBox(new Object[] { "Escultura", "Tapete", "Quadro" });
		comboBox.setBounds(115, 238, 125, 20);
		contentPane.add(comboBox);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(10, 284, 74, 14);
		contentPane.add(lblAutor);
		
		textField_4 = new JTextField();
		textField_4.setBounds(92, 278, 203, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(10, 315, 74, 14);
		contentPane.add(lblValor);
		
		textField_5 = new JTextField();
		textField_5.setBounds(92, 309, 102, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEstilo = new JLabel("Estilo:");
		lblEstilo.setBounds(10, 345, 74, 14);
		contentPane.add(lblEstilo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(92, 339, 102, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblMaterial = new JLabel("Material:");
		lblMaterial.setBounds(10, 377, 74, 14);
		contentPane.add(lblMaterial);
		
		textField_7 = new JTextField();
		textField_7.setBounds(91, 371, 102, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTcnica = new JLabel("T\u00E9cnica:");
		lblTcnica.setBounds(10, 408, 74, 14);
		contentPane.add(lblTcnica);
		
		textField_8 = new JTextField();
		textField_8.setBounds(92, 402, 102, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblProprietriosAnteriores = new JLabel("Propriet\u00E1rios Anteriores:");
		lblProprietriosAnteriores.setBounds(10, 439, 166, 14);
		contentPane.add(lblProprietriosAnteriores);
		
		JLabel lblDataDaCriao = new JLabel("Data da cria\u00E7\u00E3o:");
		lblDataDaCriao.setBounds(224, 315, 102, 14);
		contentPane.add(lblDataDaCriao);
		
		textField_9 = new JTextField();
		textField_9.setBounds(323, 309, 102, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblAnoDeCriao = new JLabel("Ano de cria\u00E7\u00E3o:");
		lblAnoDeCriao.setBounds(223, 345, 102, 14);
		contentPane.add(lblAnoDeCriao);
		
		textField_10 = new JTextField();
		textField_10.setBounds(323, 339, 102, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblLargura = new JLabel("Largura:");
		lblLargura.setBounds(224, 377, 92, 14);
		contentPane.add(lblLargura);
		
		textField_11 = new JTextField();
		textField_11.setBounds(323, 371, 102, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblComprimento = new JLabel("Comprimento:");
		lblComprimento.setBounds(224, 408, 102, 14);
		contentPane.add(lblComprimento);
		
		JLabel lblPas = new JLabel("Pa\u00EDs:");
		lblPas.setBounds(224, 439, 92, 14);
		contentPane.add(lblPas);
		
		textField_12 = new JTextField();
		textField_12.setBounds(323, 402, 102, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(323, 433, 102, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(435, 408, 35, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(430, 377, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(387, 489, 89, 23);
		contentPane.add(btnRemover);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(211, 489, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(299, 489, 89, 23);
		contentPane.add(btnAlterar);
	}

}
