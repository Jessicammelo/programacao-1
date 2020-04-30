package exer2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;
	private InteiroPositivo anterior;

	/**
	 * Launch the application.
	 */
	public static void main1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao frame = new Apresentacao();
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
	public Apresentacao() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("digite o valor:");
		lblNewLabel.setBounds(10, 11, 128, 14);
		getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 8, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.setBounds(265, 7, 89, 23);
		getContentPane().add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(24, 52, 400, 187);
		getContentPane().add(textArea);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		JLabel lblNewLabel = new JLabel("Digite o valor desejado:");
//		lblNewLabel.setBounds(10, 11, 144, 14);
//		contentPane.add(lblNewLabel);
//		
//		textField = new JTextField();
//		textField.setBounds(178, 8, 86, 20);
//		contentPane.add(textField);
//		textField.setColumns(10);
//		
//		JButton btnNewButton = new JButton("New button");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				//int valor = Integer.parseInt(textField.getText());
//				//InteiroPositivo ip = new InteiroPositivo();
//				//ip.setValor(valor);
//				
//				//ip.getValor();
//				//ip.fatorial();
//			}
//		});
		btnNewButton.setBounds(288, 7, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextPane textArea = new JTextPane();
		textArea.setBounds(22, 52, 402, 198);
		contentPane.add(textArea);
	}
}
