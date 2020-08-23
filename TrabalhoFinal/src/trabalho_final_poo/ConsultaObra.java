package trabalho_final_poo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConsultaObra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaObra frame = new ConsultaObra();
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
	public ConsultaObra() {
		setTitle("Filtro de Obras de Arte");
		setBounds(100, 100, 415, 161);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Autor:");
		lblNewLabel.setBounds(10, 17, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblProprietrioAnterior = new JLabel("Propriet\u00E1rio Anterior:");
		lblProprietrioAnterior.setBounds(10, 42, 139, 14);
		contentPane.add(lblProprietrioAnterior);
		
		textField = new JTextField();
		textField.setBounds(139, 11, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 36, 139, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(297, 95, 95, 23);
		contentPane.add(btnPesquisar);
	}

}
