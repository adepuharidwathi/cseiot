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
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class login_data {

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
					login_data window = new login_data();
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
	public login_data() {
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
		
		JLabel lblNewLabel = new JLabel("login ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(170, 33, 118, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(109, 83, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(109, 129, 110, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBounds(246, 82, 132, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JPasswordField();
		t2.setBounds(246, 128, 132, 20);
		frame.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email=t1.getText();
				String password=t2.getText();
				if(email.equals("hari@gmail.com")&&password.equals("1234")||email.equals("ira@gmail.com")&&password.equals("1256")||email.equals("dad@gmail.com")&&password.equals("1278")||email.equals("mom@gmail.com")&&password.equals("1290")) {
					JOptionPane.showMessageDialog(btnNewButton, "Login Done!");
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mrec3","root","mrec");
					String q="Insert into login values('"+email+"','"+password+"')";
					Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "Connection Established!");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else {
				JOptionPane.showMessageDialog(btnNewButton,"Invalid");
			}}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(199, 190, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
