package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class Welcome extends JFrame implements ActionListener {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnEnter;
	private JButton btnExit;
	private JLabel lblUser;
	private JLabel lblPassword;
	private JTextField txtUser;
	private JLabel lblCopyright;
	private JLabel lblSystem;
	public static String text = "";
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setTitle("Autorizaci\u00F3n de Acceso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane.setLayout(null);

		lblSystem = new JLabel("Sistema Integral de Administraci\u00F3n");
		lblSystem.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSystem.setBounds(70, 89, 432, 60);
		contentPane.add(lblSystem);

		txtUser = new JTextField();
		txtUser.setBounds(151, 187, 135, 33);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		lblUser = new JLabel("Usuario:");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUser.setBounds(65, 191, 76, 21);
		contentPane.add(lblUser);

		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(65, 239, 76, 21);
		contentPane.add(lblPassword);

		btnEnter = new JButton("Ingresar");
		btnEnter.addActionListener(this);
		btnEnter.setBounds(296, 184, 85, 76);
		contentPane.add(btnEnter);

		btnExit = new JButton("Salir");
		btnExit.addActionListener(this);
		btnExit.setBounds(391, 184, 85, 76);
		contentPane.add(btnExit);

		lblCopyright = new JLabel("\u00A9 2021 Dorian Store");
		lblCopyright.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCopyright.setBounds(10, 322, 210, 21);
		contentPane.add(lblCopyright);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(151, 230, 135, 31);
		contentPane.add(txtPassword);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnter) {
	
		}
		
		if (e.getSource() == btnExit) {
			actionPerformedbtnExit(e);
		}
	}

	protected void actionPerformedbtnExit(ActionEvent e) {
		dispose();
	}
}