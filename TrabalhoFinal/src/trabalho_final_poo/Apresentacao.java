package trabalho_final_poo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;

public class Apresentacao {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Galeria galeria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame.setBounds(100, 100, 501, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnCadastros = new JMenu("Cadastros");
		menuBar.add(mnCadastros);

		JMenuItem mntmProprietrio = new JMenuItem("Propriet\u00E1rio Anterior...");
		mntmProprietrio.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				CadastroProprietarioAnterior cadastroProprietarioAnterior = new CadastroProprietarioAnterior();
				cadastroProprietarioAnterior.setVisible(true);
			}
		});

		buttonGroup.add(mntmProprietrio);

		mnCadastros.add(mntmProprietrio);

		JMenuItem mntmCliente = new JMenuItem("Comprador...");
		mntmCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				CadastroComprador cadastroComprador = new CadastroComprador();
				cadastroComprador.setVisible(true);
			}
		});
		mnCadastros.add(mntmCliente);

		JMenuItem mntmObraDeArte = new JMenuItem("Obra de arte...");
		mntmObraDeArte.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				CadastroObra cadastroObra = new CadastroObra();
				cadastroObra.setVisible(true);
				
				if (!cadastroObra.isActive() && cadastroObra.getObraDeArte() != null)
				{
					
				}
			}
		});
		mnCadastros.add(mntmObraDeArte);

		JMenuItem mntmAutor = new JMenuItem("Autor...");
		mntmAutor.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				CadastroAutor cadastroAutor = new CadastroAutor();
				cadastroAutor.setVisible(true);
			}
		});
		mnCadastros.add(mntmAutor);

		JMenu mnNewMenu = new JMenu("Consultas");
		menuBar.add(mnNewMenu);

		JMenuItem mntmObrasDeArte = new JMenuItem("Obras de arte...");
		mntmObrasDeArte.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ConsultaObra consultaObra = new ConsultaObra();
				consultaObra.setVisible(true);
			}
		});
		mnNewMenu.add(mntmObrasDeArte);

		JMenuItem mntmMelhoresClientes = new JMenuItem("Melhores clientes...");
		mnNewMenu.add(mntmMelhoresClientes);

		JMenu mnMovimentos = new JMenu("Outros");
		menuBar.add(mnMovimentos);

		JMenuItem mntmVenderObraDe = new JMenuItem("Vender obra de arte...");
		mntmVenderObraDe.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				CadastroVenda cadastroVenda = new CadastroVenda();
				cadastroVenda.setVisible(true);
			}
		});
		mnMovimentos.add(mntmVenderObraDe);
		
		JMenuItem mntmExcluiralterarObra = new JMenuItem("Excluir/Alterar obra...");
		mntmExcluiralterarObra.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExcluirAlterarObra excluirAterarObra = new ExcluirAlterarObra();
				excluirAterarObra.setVisible(true);
			}
		});
		mnMovimentos.add(mntmExcluiralterarObra);
	}
}
