package exer1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.eclipse.swt.internal.C;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfUF;
	private JTextField tfCPF;
	private JTextField tfRendaAnual;
	private Contribuinte[] vetor = new Contribuinte[20];
	private int indice = 0; 
	private JLabel lblNewLabel;
	private JTextField txtTfvalorconsulta;
	private JButton btnConsultar;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomeDoContribuinte = new JLabel("Nome do contribuinte:");
		lblNomeDoContribuinte.setBounds(10, 11, 112, 14);
		frame.getContentPane().add(lblNomeDoContribuinte);
		
		tfNome = new JTextField();
		tfNome.setBounds(132, 8, 214, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 39, 46, 14);
		frame.getContentPane().add(lblEstado);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 64, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		JLabel lblRendaAnual = new JLabel("Renda Anual:");
		lblRendaAnual.setBounds(10, 89, 112, 14);
		frame.getContentPane().add(lblRendaAnual);
		
		tfUF = new JTextField();
		tfUF.setBounds(132, 36, 59, 20);
		frame.getContentPane().add(tfUF);
		tfUF.setColumns(10);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(132, 61, 112, 20);
		frame.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		tfRendaAnual = new JTextField();
		tfRendaAnual.setBounds(132, 86, 112, 20);
		frame.getContentPane().add(tfRendaAnual);
		tfRendaAnual.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contribuinte c = new Contribuinte(tfNome.getText(), tfUF.getText(), tfCPF.getText(), Float.parseFloat(tfRendaAnual.getText()));
				vetor[indice] = c;
				indice ++;
				float imposto = c.getImpostoAPagar();
				JOptionPane.showMessageDialog(frame, "imposto a pagar " + imposto);
				
			}
		});
		btnNewButton.setBounds(257, 108, 103, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("valor a consultar:");
		lblNewLabel.setBounds(8, 155, 114, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtTfvalorconsulta = new JTextField();
		txtTfvalorconsulta.setBounds(132, 152, 86, 20);
		frame.getContentPane().add(txtTfvalorconsulta);
		txtTfvalorconsulta.setColumns(10);
		
		btnConsultar = new JButton("consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float valor  = Float.parseFloat(txtTfvalorconsulta.getText());
				String resultado = "Contribuintes imposto acima " + valor;
				for (int i = 0; i< indice; i++) {
					if (vetor[i].getImpostoAPagar()> valor) {
						resultado += "\n " + vetor[i].getNome();
					}
				}
				JOptionPane.showMessageDialog(frame, resultado);
			}
		});
		btnConsultar.setBounds(257, 151, 103, 23);
		frame.getContentPane().add(btnConsultar);
		
		JLabel lblCpfAPesquisar = new JLabel("CPF a pesquisar: ");
		lblCpfAPesquisar.setBounds(10, 200, 138, 14);
		frame.getContentPane().add(lblCpfAPesquisar);
		
		textField = new JTextField();
		textField.setBounds(158, 200, 114, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Consultar CPF");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(293, 196, 112, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("% da receita por Estado");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				float totalRS, totalSC, totalGeral;
				totalRS = totalSC = totalGeral = 0;
				//Collection<Contribuinte> contribTemp = contribuintes.values();
				//for (Contribuinte c : contribTemp){
				//if(c.getUf().equals("SC")){
				//totalSC += C.getImpostoAPagar();
				//}else {
				//if(c.getUf().equals("RS")){
					//totalRS += C.getImpostoAPagar();
					//}
				//}
				//totalGeral += c.getImpostoAPagar();
				String resultado = "Participação por estado ";
				//resultado += "\nSC" + totalSC+ "=" + (totalSC/totalGeral* 100) + "%";
				//resultado += "\nGeral = " + totalGeral;
				//jopene
			}
		});
		btnNewButton_2.setBounds(229, 252, 161, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
