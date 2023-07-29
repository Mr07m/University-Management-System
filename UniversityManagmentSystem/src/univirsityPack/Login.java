package univirsityPack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	JButton cancelButton, loginButton;
	JTextField tfusername, tfpassword;

	Login() {

		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		// username
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(40, 20, 100, 20);
		add(lblusername);

		tfusername = new JTextField();
		tfusername.setBounds(150, 20, 150, 20);
		add(tfusername);

		// password
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(40, 70, 100, 20);
		add(lblpassword);

		tfpassword = new JPasswordField();
		tfpassword.setBounds(150, 70, 150, 20);
		add(tfpassword);

		loginButton = new JButton("Login");
		loginButton.setBounds(40, 140, 120, 30);
		loginButton.setBackground(Color.BLACK);
		loginButton.setForeground(Color.WHITE);
		loginButton.addActionListener(this);
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(loginButton);

		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(180, 140, 120, 30);
		cancelButton.setBackground(Color.BLACK);
		cancelButton.setForeground(Color.WHITE);
		cancelButton.addActionListener(this);
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(cancelButton);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
		Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel imge = new JLabel(i3);
		imge.setBounds(350, 0, 200, 200);
		add(imge);

		setSize(600, 300);
		setLocation(500, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == loginButton) {
			String username = tfusername.getText();
			String password = tfpassword.getText();

			String query = "select*from login where username='" + username + "' and password='" + password + "'";
			try {
				Conn conn = new Conn();
				ResultSet rs = conn.statement.executeQuery(query);

				if (rs.next()) {
					setVisible(false);
					new Project();
				} else {
					JOptionPane.showMessageDialog(null, "invalid username and password");
					setVisible(false);
				}
				conn.statement.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (ae.getSource() == cancelButton) {
			setVisible(false);
		}

	}
}
