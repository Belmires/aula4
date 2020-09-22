package br.com.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.control.UserLoger;

public class LoginUser extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textLogin;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUser frame = new LoginUser();
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
	public LoginUser() {
		setTitle("Janela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setBounds(33, 55, 40, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(33, 117, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textLogin = new JTextField();
		textLogin.setBounds(89, 52, 179, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setBounds(89, 114, 179, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				UserLoger us = new UserLoger();
				
				if (us.validacaoLogin(textLogin.getText(), textSenha.getText())) {
					JOptionPane.showMessageDialog(contentPane, "Logado com sucesso " + textLogin.getText());

				} else {
					JOptionPane.showMessageDialog(contentPane, "Falha ao logar", "Falha" , JOptionPane.ERROR_MESSAGE);
				}
				
				textLogin.setText("");
				textSenha.setText("");
				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(308, 190, 74, 29);
		contentPane.add(btnNewButton);
	}
}
