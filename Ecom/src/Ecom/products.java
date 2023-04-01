package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class products {

	private JFrame frame;
    int i=0;
    int Total_Cart_cost =0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					products window = new products();
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
	public products() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("S-Mart");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(162, 11, 125, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\books\\Capture1.PNG"));
		lblNewLabel_1.setBounds(21, 69, 156, 162);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\books\\Capture3.PNG"));
		lblNewLabel_2.setBounds(207, 69, 117, 162);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\books\\Capture.PNG"));
		lblNewLabel_3.setBounds(361, 69, 133, 162);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lbc = new JLabel("Cart:");
		lbc.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbc.setBounds(369, 27, 73, 23);
		frame.getContentPane().add(lbc);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 11));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Pdf", "kindel", "paper"}));
		c1.setBounds(67, 262, 89, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Pdf", "kindel", "paper"}));
		c2.setFont(new Font("Tahoma", Font.BOLD, 11));
		c2.setBounds(227, 262, 82, 22);
		frame.getContentPane().add(c2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Pdf", "kindel", "paper"}));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_2.setBounds(390, 262, 73, 22);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lbc.setText("Cart: "+i);
				String t=(String) c1.getSelectedItem();
				if(t.equals("pdf")){
					 int p=120;
					 Total_Cart_cost+=p;
				JOptionPane.showMessageDialog(btnNewButton, "Selected item price: "+p+"\nTotal Cart price: "+Total_Cart_cost+"\ntype:" +t);
			}
				 else if(t.equals("kindel")) {
					 int p=100;
					 Total_Cart_cost+=p;
				JOptionPane.showMessageDialog(btnNewButton,"Selected item price: "+p+"\nTotal Cart price: "+Total_Cart_cost+"\ntype:" +t);
				 }
				 else if(t.equals("paper")) {
					 int p=150;
					 Total_Cart_cost+=p;
				JOptionPane.showMessageDialog(btnNewButton,"Selected item price: "+p+"\nTotal Cart price: "+Total_Cart_cost+"\ntype:" +t);
				 }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(43, 295, 117, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton lbc1 = new JButton("Add to cart");
		lbc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lbc.setText("Cart: "+i);
				String t=(String) c1.getSelectedItem();
				 if(t.equals("pdf")){
					 int p=120;
					 Total_Cart_cost+=p;
				JOptionPane.showMessageDialog(btnNewButton,"Selected item price: "+p+"\nTotal Cart price: "+Total_Cart_cost+"\ntype:" +t);
			}
				 else if(t.equals("kindel")) {
					 int p=100;
					 Total_Cart_cost+=p;
				JOptionPane.showMessageDialog(btnNewButton,"Selected item price: "+p+"\nTotal Cart price: "+Total_Cart_cost+"\ntype:" +t);
				 }
				 else if(t.equals("paper")) {
					 int p=150;
					 Total_Cart_cost+=p;
				JOptionPane.showMessageDialog(btnNewButton,"Selected item price: "+p+"\nTotal Cart price: "+Total_Cart_cost+"\ntype:" +t);
				 }
				 
			}
		});
		lbc1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbc1.setBounds(207, 295, 117, 23);
		frame.getContentPane().add(lbc1);
		
		JButton lbc3 = new JButton("Add to cart");
		lbc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lbc.setText("Cart: "+i);
				String t=(String) c1.getSelectedItem();
				if(t.equals("pdf")){
					 int p=120;
					 Total_Cart_cost+=p;
				JOptionPane.showMessageDialog(btnNewButton,"Selected item price: "+p+"\nTotal Cart price: "+Total_Cart_cost+"\ntype:" +t);
			}
				 else if(t.equals("kindel")) {
					 int p=100;
					 Total_Cart_cost+=p;
				JOptionPane.showMessageDialog(btnNewButton,"Selected item price: "+p+"\nTotal Cart price: "+Total_Cart_cost+"\ntype:" +t);
				 }
				 else if(t.equals("paper")) {
					 int p=150;
					 Total_Cart_cost+=p;
				JOptionPane.showMessageDialog(btnNewButton,"Selected item price: "+p+"\nTotal Cart price: "+Total_Cart_cost+"\ntype:" +t);
				 }
			}
		});
		lbc3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbc3.setBounds(377, 295, 117, 23);
		frame.getContentPane().add(lbc3);
		
		
	}
}
