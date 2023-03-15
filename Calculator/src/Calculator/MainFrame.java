package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfFirstname;
	private JTextField tfLastName;
	private JLabel lblWelcome2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("MainFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel.setBounds(35, 24, 111, 39);
		contentPane.add(lblNewLabel);
		
		tfFirstname = new JTextField();
		tfFirstname.setBounds(156, 22, 355, 47);
		contentPane.add(tfFirstname);
		tfFirstname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(37, 106, 120, 56);
		contentPane.add(lblNewLabel_1);
		
		
		
		tfLastName = new JTextField();
		tfLastName.setBounds(156, 126, 355, 47);
		contentPane.add(tfLastName);
		tfLastName.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String FirstName = tfFirstname.getText();
				String LastName = tfLastName.getText();
				lblWelcome2.setText("Welcome " + FirstName + LastName);
				
				
			}
		});
		btnOK.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnOK.setBounds(156, 259, 89, 39);
		contentPane.add(btnOK);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfFirstname.setText("");
				tfLastName.setText("");
			}
		});
		btnClear.setBounds(274, 259, 89, 39);
		contentPane.add(btnClear);
		
		lblWelcome2 = new JLabel("");
		lblWelcome2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblWelcome2.setBounds(35, 208, 476, 34);
		contentPane.add(lblWelcome2);
	}
}
