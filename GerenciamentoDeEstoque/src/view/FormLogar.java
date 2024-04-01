package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormLogar extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormLogar frame = new FormLogar();
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
	public FormLogar() {
		getContentPane().setBackground(new Color(32, 32, 32));
		getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLogin.setBounds(159, 65, 95, 37);
		getContentPane().add(lblLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(70, 122, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(70, 145, 273, 20);
		getContentPane().add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(70, 188, 46, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(70, 210, 273, 20);
		getContentPane().add(textField_1);
		
		JButton btnCancelarLogin = new JButton("Cancelar");
		btnCancelarLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Fechando a janela
				dispose();
			}
		});
		btnCancelarLogin.setForeground(Color.BLACK);
		btnCancelarLogin.setBackground(Color.RED);
		btnCancelarLogin.setBounds(70, 285, 116, 37);
		getContentPane().add(btnCancelarLogin);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setForeground(Color.BLACK);
		btnLogar.setBackground(new Color(0, 128, 192));
		btnLogar.setBounds(227, 285, 116, 37);
		getContentPane().add(btnLogar);
		setBounds(100, 100, 430, 462);

	}

}
