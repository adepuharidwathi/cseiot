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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class login {

	JFrame lframe;
	private JTextField s1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		lframe = new JFrame();
		lframe.setBounds(100, 100, 450, 354);
		lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sno");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(93, 75, 46, 22);
		lframe.getContentPane().add(lblNewLabel);
		
		JLabel lb1 = new JLabel("Name");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb1.setBounds(131, 183, 233, 44);
		lframe.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Marks");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb2.setBounds(131, 238, 251, 45);
		lframe.getContentPane().add(lb2);
		
		s1 = new JTextField();
		s1.setBounds(149, 78, 138, 20);
		lframe.getContentPane().add(s1);
		s1.setColumns(10);
		
		JButton b = new JButton("Submit");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=s1.getText();
				int sno=Integer.parseInt(s);
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mrec_db","root","mrec");
					String q="select name,marks from student where sno=?";
					PreparedStatement ps=con.prepareStatement(q);
					ps.setInt(1, sno);
					ResultSet rs=ps.executeQuery();
					rs.next();
					lb1.setText("Name:"+rs.getString(1));
					lb2.setText("Marks:"+rs.getInt(2));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b.setFont(new Font("Tahoma", Font.BOLD, 14));
		b.setBounds(244, 131, 98, 22);
		lframe.getContentPane().add(b);
		
		JLabel lblNewLabel_1 = new JLabel("checking marks");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(124, 16, 195, 32);
		lframe.getContentPane().add(lblNewLabel_1);
	}

}
