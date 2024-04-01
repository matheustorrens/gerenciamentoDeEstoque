package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;

public class FormCadastrarProdutos extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCadastrarProdutos frame = new FormCadastrarProdutos();
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
	public FormCadastrarProdutos() {
		getContentPane().setBackground(new Color(32, 32, 32));
		setBounds(100, 100, 696, 338);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastre um Produto");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(211, 37, 258, 48);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do Produto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(64, 150, 116, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(64, 175, 312, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Preço");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(404, 150, 74, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(407, 175, 56, 20);
		getContentPane().add(spinner);
		
		JLabel lblNewLabel_1_2 = new JLabel("Quantidade");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(488, 150, 116, 14);
		getContentPane().add(lblNewLabel_1_2);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(491, 175, 56, 20);
		getContentPane().add(spinner_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(64, 241, 312, 20);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nome do Fornecedor");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(64, 216, 136, 14);
		getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Tipo do Produto");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(403, 216, 108, 14);
		getContentPane().add(lblNewLabel_1_3_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Alimentos", "Objetos"}));
		comboBox.setBounds(406, 240, 94, 22);
		getContentPane().add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(531, 241, 100, 20);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Validade");
		lblNewLabel_1_3_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_2.setBounds(531, 216, 136, 14);
		getContentPane().add(lblNewLabel_1_3_2);

	}
}
