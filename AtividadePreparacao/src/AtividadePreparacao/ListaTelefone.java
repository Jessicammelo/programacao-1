package AtividadePreparacao;
//Jéssica Maria de Melo e Danielle Fernanda Deola
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaTelefone extends JFrame {

	public static ArrayList<Telefone> telefones = new ArrayList<Telefone>();
	List<String> columns = new ArrayList<String>();
	static List<String[]> values = new ArrayList<String[]>();
	private JPanel contentPane;
	private JTable table;
	static Cadastro c = new Cadastro();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaTelefone frame = new ListaTelefone();
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
	public ListaTelefone() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		columns.add("Nome");
		columns.add("Endereço");
		columns.add("Data");
		columns.add("Valor à pagar");
		columns.add("Número");
		columns.add("Opção");

		values.clear();
		for (Telefone t : telefones) {
			values.add(new String[] { t.getNome(), t.getEndereco(), t.getDataInstalacao().toString(),
					t.getValorBasico().toString(), t.getNumero(), "" });
		}

		TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][] {}), columns.toArray());
		table = new JTable(tableModel);
		contentPane.add(table, BorderLayout.CENTER);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setVisible(true);
				new Thread() {
					@Override
					public void run() {
						while(true) {
							values.clear();
							for (Telefone t : telefones) {
								values.add(new String[] { t.getNome(), t.getEndereco(), t.getDataInstalacao().toString(),
										t.getValorBasico().toString(), t.getNumero(), "" });
							}
							try {
								Thread .sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}.start();
			}
		});
		contentPane.add(btnAdicionar, BorderLayout.SOUTH);
	}

}
