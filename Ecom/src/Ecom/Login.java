package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;

public class Login {

    JFrame lframe;
	private JTextField t2;
	private JPasswordField p2;
    JLabel lb2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.lframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		lframe = new JFrame();
		lframe.setBounds(100, 100, 450, 300);
		lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(161, 11, 76, 31);
		lframe.getContentPane().add(lblNewLabel);
		
		JLabel t1 = new JLabel("Username:");
		t1.setFont(new Font("Tahoma", Font.BOLD, 11));
		t1.setBounds(111, 103, 67, 14);
		lframe.getContentPane().add(t1);
		
		JLabel p1 = new JLabel("Password:");
		p1.setFont(new Font("Tahoma", Font.BOLD, 11));
		p1.setBounds(111, 141, 67, 14);
		lframe.getContentPane().add(p1);
		
		t2 = new JTextField();
		t2.setBounds(182, 100, 109, 20);
		lframe.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=t2.getText();
				String ps=p2.getText();
				if(un.equals("hari")&&ps.equals("1234")) {
					JOptionPane.showMessageDialog(btnNewButton, "Login Done!");
				}else
					JOptionPane.showMessageDialog(btnNewButton, "Invalid credentials");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(161, 188, 89, 23);
		lframe.getContentPane().add(btnNewButton);
		
		p2 = new JPasswordField();
		p2.setBounds(181, 138, 110, 20);
		lframe.getContentPane().add(p2);
		
		lb2 = new JLabel("");
		lb2.setBounds(96, 63, 242, 14);
		lframe.getContentPane().add(lb2);
		
	
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		lframe.setVisible(true);
	}
}
