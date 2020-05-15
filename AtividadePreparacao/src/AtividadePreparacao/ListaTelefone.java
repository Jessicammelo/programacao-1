package AtividadePreparacao;

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

public class ListaTelefone extends JFrame {

	public static ArrayList<Telefone> telefones = new ArrayList<Telefone>(); 
	List<String> columns = new ArrayList<String>();
	List<String[]> values = new ArrayList<String[]>();
	private JPanel contentPane;
	private JTable table;

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
		
		columns.add("col1");
        columns.add("col2");
        columns.add("col3");
        
        for (int i = 0; i < 100; i++) {
            values.add(new String[] {"val"+i+" col1","val"+i+" col2","val"+i+" col3"});
        }
		
		TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][] {}), columns.toArray());
		table = new JTable(tableModel);
		contentPane.add(table, BorderLayout.CENTER);
		
		JButton btnAdicionar = new JButton("Adicionar");
		contentPane.add(btnAdicionar, BorderLayout.SOUTH);
	}

}
