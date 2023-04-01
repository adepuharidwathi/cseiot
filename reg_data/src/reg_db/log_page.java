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
import java.awt.event.ActionEvent;

public class log_page {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					log_page window = new log_page();
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
	public log_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(172, 40, 79, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(99, 90, 79, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(99, 138, 85, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBounds(206, 89, 145, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JPasswordField();
		t2.setBounds(206, 137, 145, 20);
		frame.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=t1.getText();
				String pw=t2.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mrec3","root","mrec");
					String q="select count(*) from login where email=? and password=?";
					PreparedStatement ps=con.prepareStatement(q);
					ps.setString(1, un);
					ps.setString(2, pw);
					ResultSet rs=ps.executeQuery();
					rs.next();
					int count=rs.getInt(1);
					if(count==0) {
						JOptionPane.showMessageDialog(btnNewButton, "Invalid!");
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton, "Login Done!");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(172, 193, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
