package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.List;
import java.awt.Choice;
import java.awt.Canvas;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDesktopPane;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu jmCadastrarProdutos = new JMenu("Produtos");
		jmCadastrarProdutos.setIcon(new ImageIcon("C:\\Users\\mathe\\Desktop\\Projetos\\eclipse\\GerenciamentoDeEstoque\\src\\img\\shopping-bag(1).png"));
		jmCadastrarProdutos.setMnemonic('1');
		menuBar.add(jmCadastrarProdutos);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cadastrar Produtos");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Unir Form de Cadastro com o de listar
				FormCadastrarProdutos tela_cadastrarProdutos = new FormCadastrarProdutos();
				contentPane.add(tela_cadastrarProdutos);
				tela_cadastrarProdutos.setVisible(true);
				
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\mathe\\Desktop\\Projetos\\eclipse\\GerenciamentoDeEstoque\\src\\img\\CadastrarProduto.png"));
		jmCadastrarProdutos.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listar Produtos");
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\Users\\mathe\\Desktop\\Projetos\\eclipse\\GerenciamentoDeEstoque\\src\\img\\to-do-list.png"));
		jmCadastrarProdutos.add(mntmNewMenuItem_1);
		
		JMenu jmEstoque = new JMenu("Estoque");
		jmEstoque.setIcon(new ImageIcon("C:\\Users\\mathe\\Desktop\\Projetos\\eclipse\\GerenciamentoDeEstoque\\src\\img\\Estoque.png"));
		jmEstoque.setMnemonic('2');
		menuBar.add(jmEstoque);
		
		JMenu jmUsuarios = new JMenu("Usuários");
		jmUsuarios.setIcon(new ImageIcon("C:\\Users\\mathe\\Desktop\\Projetos\\eclipse\\GerenciamentoDeEstoque\\src\\img\\usuario.png"));
		jmUsuarios.setMnemonic('3');
		menuBar.add(jmUsuarios);
		
		JMenuItem jmItemCadastrar = new JMenuItem("Cadastrar");
		jmItemCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Adicionando tela de cadastro
				FormCadastrar tela_cadastro = new FormCadastrar();
				contentPane.add(tela_cadastro);
				tela_cadastro.setVisible(true);
			}
		});
		jmItemCadastrar.setIcon(new ImageIcon("C:\\Users\\mathe\\Desktop\\Projetos\\eclipse\\GerenciamentoDeEstoque\\src\\img\\cadastrar.png"));
		jmUsuarios.add(jmItemCadastrar);
		
		JMenuItem jmItemLogar = new JMenuItem("Logar");
		jmItemLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Adicionando tela de login
				FormLogar tela_login = new FormLogar();
				contentPane.add(tela_login);
				tela_login.setVisible(true);
				
			}
		});
		jmItemLogar.setIcon(new ImageIcon("C:\\Users\\mathe\\Desktop\\Projetos\\eclipse\\GerenciamentoDeEstoque\\src\\img\\logar.png"));
		jmUsuarios.add(jmItemLogar);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 32, 32));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
