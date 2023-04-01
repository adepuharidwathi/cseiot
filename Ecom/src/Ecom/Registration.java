package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Registration {

	private JFrame Rframe;
    private JTextField n1;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.Rframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Rframe = new JFrame();
		Rframe.getContentPane().setBackground(SystemColor.textHighlight);
		Rframe.setBounds(100, 100, 511, 336);
		Rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Rframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(152, 28, 197, 32);
		Rframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(110, 97, 66, 14);
		Rframe.getContentPane().add(lblNewLabel_1);
		
		n1 = new JTextField();
		n1.setBounds(185, 94, 116, 20);
		Rframe.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Phone No:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(109, 168, 67, 14);
		Rframe.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(185, 165, 116, 20);
		Rframe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String n=n1.getText();
				JOptionPane.showMessageDialog(btnNewButton, n+" Registration Done!");
				Login l=new Login();
				l.lb2.setText(n+" pease login!");
				l.lframe.setVisible(true);
				Rframe.dispose();
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(167, 220, 89, 23);
		Rframe.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Email Id:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(107, 130, 69, 14);
		Rframe.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(185, 125, 116, 20);
		Rframe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
