package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormCadastrar extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField inputNome;
	private JTextField inputSenha;
	private JTextField inputConfirmaSenha;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCadastrar frame = new FormCadastrar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormCadastrar() {
		getContentPane().setBackground(new Color(32, 32, 32));
		setBounds(100, 100, 430, 462);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setBounds(135, 53, 143, 37);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(70, 110, 46, 14);
		lblNewLabel_1.setForeground(Color.WHITE);
		getContentPane().add(lblNewLabel_1);
		
		inputNome = new JTextField();
		inputNome.setBounds(70, 133, 273, 20);
		inputNome.setColumns(10);
		getContentPane().add(inputNome);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setBounds(70, 176, 46, 14);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		getContentPane().add(lblNewLabel_1_1);
		
		inputSenha = new JTextField();
		inputSenha.setBounds(70, 198, 273, 20);
		inputSenha.setColumns(10);
		getContentPane().add(inputSenha);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Confirma senha");
		lblNewLabel_1_1_1.setBounds(70, 238, 95, 14);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		getContentPane().add(lblNewLabel_1_1_1);
		
		inputConfirmaSenha = new JTextField();
		inputConfirmaSenha.setBounds(70, 263, 273, 20);
		inputConfirmaSenha.setColumns(10);
		getContentPane().add(inputConfirmaSenha);
		
		JButton btnCadastro = new JButton("Continuar");
		btnCadastro.setBounds(227, 333, 116, 37);
		btnCadastro.setForeground(Color.BLACK);
		btnCadastro.setBackground(new Color(0, 128, 255));
		getContentPane().add(btnCadastro);
		
		JButton btnCancelarCadastro = new JButton("Cancelar");
		btnCancelarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Fechando a janela
				dispose();
			}
		});
		btnCancelarCadastro.setForeground(Color.BLACK);
		btnCancelarCadastro.setBackground(new Color(255, 0, 0));
		btnCancelarCadastro.setBounds(70, 333, 116, 37);
		getContentPane().add(btnCancelarCadastro);

	}
}
