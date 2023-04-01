package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class reg {

	private JFrame rframe;
	private JTextField s1;
	private JTextField n1;
	private JTextField m1;
	private JTextField e1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg window = new reg();
					window.rframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		rframe = new JFrame();
		rframe.setBounds(100, 100, 450, 368);
		rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(150, 31, 160, 43);
		rframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sno");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(106, 85, 46, 14);
		rframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(106, 131, 46, 14);
		rframe.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Marks");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(106, 225, 46, 14);
		rframe.getContentPane().add(lblNewLabel_1_2);
		
		s1 = new JTextField();
		s1.setBounds(188, 84, 141, 20);
		rframe.getContentPane().add(s1);
		s1.setColumns(10);
		
		n1 = new JTextField();
		n1.setColumns(10);
		n1.setBounds(188, 130, 141, 20);
		rframe.getContentPane().add(n1);
		
		m1 = new JTextField();
		m1.setColumns(10);
		m1.setBounds(188, 224, 141, 20);
		rframe.getContentPane().add(m1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(106, 182, 46, 14);
		rframe.getContentPane().add(lblNewLabel_2);
		
		e1 = new JTextField();
		e1.setBounds(188, 181, 141, 20);
		rframe.getContentPane().add(e1);
		e1.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String serialnum=s1.getText();
				String name=n1.getText();
				String email=e1.getText();
				String marks=m1.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mrec_db","root","mrec");
					String q="Insert into student values('"+serialnum+"','"+name+"','"+email+"','"+marks+"')";
					Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					//JOptionPane.showMessageDialog(btnNewButton, "connection established!");
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				String n=n1.getText();
				JOptionPane.showMessageDialog(btnNewButton, n+" Registration Done!");
//				login l=new login();
//				l.lframe.setVisible(true);
//				rframe.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(169, 284, 116, 23);
		rframe.getContentPane().add(btnNewButton);
	}
}
