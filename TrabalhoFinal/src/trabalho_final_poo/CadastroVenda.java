package trabalho_final_poo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastroVenda extends JFrame {

	private JPanel contentPane;
	private JTextField tfData;
	private JTextField tfValor;
	private JTextField tfComprador;
	private JTextField tfNomeObra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVenda frame = new CadastroVenda();
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
	public CadastroVenda() {
		setTitle("Venda de Obra de Arte");
		setBounds(100, 100, 443, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 110, 46, 14);
		contentPane.add(lblData);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(10, 137, 46, 14);
		contentPane.add(lblValor);
		
		JLabel lblFormaDeVenda = new JLabel("Forma de venda:");
		lblFormaDeVenda.setBounds(10, 82, 102, 14);
		contentPane.add(lblFormaDeVenda);
		
		JLabel lblComprador = new JLabel("Comprador:");
		lblComprador.setBounds(10, 20, 92, 14);
		contentPane.add(lblComprador);
		
		JLabel lblNomeDaObra = new JLabel("Nome da obra:");
		lblNomeDaObra.setBounds(10, 51, 85, 14);
		contentPane.add(lblNomeDaObra);
		
		tfData = new JTextField();
		tfData.setBounds(48, 107, 86, 20);
		contentPane.add(tfData);
		tfData.setColumns(10);
		
		tfValor = new JTextField();
		tfValor.setBounds(48, 134, 86, 20);
		contentPane.add(tfValor);
		tfValor.setColumns(10);
		
		tfComprador = new JTextField();
		tfComprador.setBounds(112, 11, 133, 20);
		contentPane.add(tfComprador);
		tfComprador.setColumns(10);
		
		tfNomeObra = new JTextField();
		tfNomeObra.setBounds(112, 42, 133, 20);
		contentPane.add(tfNomeObra);
		tfNomeObra.setColumns(10);
		
		JComboBox comboBox = new JComboBox(new Object[]{"Leilão", "Catálogo Web", "Galeria", "Exposição"});
		comboBox.setBounds(112, 76, 133, 20);
		contentPane.add(comboBox);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(159, 179, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(248, 179, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(335, 179, 89, 23);
		contentPane.add(btnOk);
	}

}
