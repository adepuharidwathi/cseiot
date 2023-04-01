package reg_db;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Reg_form {

	private JFrame frame;
	private JTextField n1;
	private JTextField e1;
	private JTextField m1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg_form window = new Reg_form();
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
	public Reg_form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(73, 67, 46, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(73, 107, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblSetPassword = new JLabel("Set Password");
		lblSetPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSetPassword.setBounds(73, 143, 99, 14);
		frame.getContentPane().add(lblSetPassword);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarks.setBounds(73, 177, 52, 14);
		frame.getContentPane().add(lblMarks);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Form");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(127, 11, 194, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		n1 = new JTextField();
		n1.setBounds(196, 70, 149, 20);
		frame.getContentPane().add(n1);
		n1.setColumns(10);
		
		e1 = new JTextField();
		e1.setColumns(10);
		e1.setBounds(196, 106, 149, 20);
		frame.getContentPane().add(e1);
		
		m1 = new JTextField();
		m1.setColumns(10);
		m1.setBounds(196, 176, 149, 20);
		frame.getContentPane().add(m1);
		
		p1 = new JPasswordField();
		p1.setBounds(196, 142, 149, 20);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=n1.getText();
				String email=e1.getText();
				String password=p1.getText();
				String marks=m1.getText();
				JOptionPane.showMessageDialog(btnNewButton, "registration done!");
				
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mrec3","root","mrec");
					String q="Insert into reg1 values('"+name+"','"+email+"','"+password+"','"+marks+"')";
					Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "Connection Established!");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(160, 235, 161, 35);
		frame.getContentPane().add(btnNewButton);
	}

}
