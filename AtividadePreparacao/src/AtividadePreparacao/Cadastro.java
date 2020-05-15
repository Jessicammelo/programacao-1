package AtividadePreparacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldEndereco;
	private JTextField textFieldData;
	private JTextField textFieldNumero;
	public String opcao;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton rdbtnComercial = new JRadioButton("Comercial");
	JRadioButton rdbtnEspecializada = new JRadioButton("Especializada");
	JRadioButton rdbtnResidencial = new JRadioButton("Residencial");
	JLabel lblNewLabel = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(89, 8, 97, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);

		JLabel label = new JLabel("");
		label.setBounds(10, 36, 120, 14);
		contentPane.add(label);

		JLabel clblEndereco = new JLabel("Endere\u00E7o:");
		clblEndereco.setBounds(10, 36, 46, 14);
		contentPane.add(clblEndereco);

		textFieldEndereco = new JTextField();
		textFieldEndereco.setBounds(89, 30, 86, 20);
		contentPane.add(textFieldEndereco);
		textFieldEndereco.setColumns(10);

		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 57, 46, 14);
		contentPane.add(lblData);

		textFieldData = new JTextField();
		textFieldData.setBounds(89, 54, 86, 20);
		contentPane.add(textFieldData);
		textFieldData.setColumns(10);

		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setBounds(10, 82, 46, 14);
		contentPane.add(lblNmero);

		textFieldNumero = new JTextField();
		textFieldNumero.setBounds(89, 79, 86, 20);
		contentPane.add(textFieldNumero);
		textFieldNumero.setColumns(10);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(10, 107, 46, 14);
		contentPane.add(lblTipo);
		buttonGroup.add(rdbtnComercial);

		rdbtnComercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnComercial.setBounds(77, 129, 109, 23);
		contentPane.add(rdbtnComercial);
		buttonGroup.add(rdbtnEspecializada);

		rdbtnEspecializada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnEspecializada.setBounds(77, 153, 109, 23);
		contentPane.add(rdbtnEspecializada);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setEnabled(false);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Telefone telefone = null;
				if (rdbtnResidencial.isSelected()) {
					telefone = new Residencial();
				}else if (rdbtnEspecializada.isSelected()) {
					telefone = new Especializada();
				}else if (rdbtnComercial.isSelected()) {
					telefone = new Comercial();
				}
				telefone.setNome(textFieldNome.getText());
				telefone.setEndereco(textFieldEndereco.getText());
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date d= sdf.parse(textFieldData.getText());
					telefone.setDataInstalacao(d);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				telefone.setNumero(textFieldNumero.getText());
			}
		});
		btnCadastrar.setBounds(246, 227, 89, 23);
		contentPane.add(btnCadastrar);
		buttonGroup.add(rdbtnResidencial);
		
		
		rdbtnResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		rdbtnResidencial.setBounds(77, 103, 109, 23);
		contentPane.add(rdbtnResidencial);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnResidencial.isSelected()) {
					opcao = JOptionPane.showInputDialog("Conexão com internet: (S para sim, N para não) " );
					lblNewLabel.setText("15");
				}else if (rdbtnEspecializada.isSelected()) {
					opcao = JOptionPane.showInputDialog("Quantidade de ocorrências: " );
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					try {
						Date d= sdf.parse(textFieldData.getText());
						Date d2= sdf.parse("01/01/2017");
						if (d.before(d2)) {
							lblNewLabel.setText("25");
						}else {
							lblNewLabel.setText("37.50");
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else if (rdbtnComercial.isSelected()) {
					opcao = JOptionPane.showInputDialog("Ramo de atividade: " );
					int n = Integer.parseInt(opcao);
					if (n<=1000) {
						lblNewLabel.setText("50");
					}else if (n<=5000){
						lblNewLabel.setText("67.80");					
					}else if (n<=10000) {
						lblNewLabel.setText("98.50");
					}else if (n<=50000) {
						lblNewLabel.setText("123.90");
					}else {
						lblNewLabel.setText("187.82");
					}
				}
			}
		});
		btnCalcular.setBounds(130, 227, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblValorTotal = new JLabel("Valor total:");
		lblValorTotal.setBounds(217, 157, 77, 14);
		contentPane.add(lblValorTotal);
		
		
		lblNewLabel.setBounds(350, 157, 46, 14);
		contentPane.add(lblNewLabel);
	}
}
