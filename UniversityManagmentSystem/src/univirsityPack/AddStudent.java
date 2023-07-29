package univirsityPack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class AddStudent extends JFrame implements ActionListener {
	JTextField tfname, tffname, tfaddress, tfphone, tfEmail, tfx, tfxii, tfadhar;
	JLabel fixrollnoJLabel;

	JDateChooser dcdob;
	Random random = new Random();

	JComboBox cbcourse, cbbranch;
	JButton submit, cancel;

	long first4 = Math.abs((random.nextLong() % 9000L) + 1000L);

	public AddStudent() {
		setSize(900, 700);
		setLocation(300, 40);
		setLayout(null);

		// heading
		JLabel heading = new JLabel("New Student Details");
		heading.setBounds(310, 30, 500, 50);
		heading.setFont(new Font("Tahoma", Font.BOLD, 30));
		add(heading);

		// name
		JLabel lblname = new JLabel("Name :");
		lblname.setBounds(50, 150, 100, 30);
		lblname.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblname);

		tfname = new JTextField();
		tfname.setBounds(200, 150, 150, 30);
		add(tfname);

		// father name
		JLabel lblfname = new JLabel("Father's Name :");
		lblfname.setBounds(400, 150, 200, 30);
		lblfname.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblfname);

		tffname = new JTextField();
		tffname.setBounds(600, 150, 150, 30);
		add(tffname);

		// roll no
		JLabel lblrollno = new JLabel("Roll Number :");
		lblrollno.setBounds(50, 200, 200, 30);
		lblrollno.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblrollno);

		fixrollnoJLabel = new JLabel("1533" + first4);
		fixrollnoJLabel.setBounds(200, 200, 200, 30);
		fixrollnoJLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(fixrollnoJLabel);

		// DOB
		JLabel lbldob = new JLabel("Date of Birth :");
		lbldob.setBounds(400, 200, 200, 30);
		lbldob.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lbldob);

		dcdob = new JDateChooser();
		dcdob.setBounds(600, 200, 150, 30);
		add(dcdob);

		// address
		JLabel lbladdress = new JLabel("Address :");
		lbladdress.setBounds(50, 250, 200, 30);
		lbladdress.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lbladdress);

		tfaddress = new JTextField();
		tfaddress.setBounds(200, 250, 150, 30);
		add(tfaddress);

		// phone
		JLabel lblphone = new JLabel("Phone :");
		lblphone.setBounds(400, 250, 200, 30);
		lblphone.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblphone);

		tfphone = new JTextField();
		tfphone.setBounds(600, 250, 150, 30);
		add(tfphone);

		// Email
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(50, 300, 200, 30);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setBounds(200, 300, 150, 30);
		add(tfEmail);

		// class 10th
		JLabel lblx = new JLabel("Class X(%) :");
		lblx.setBounds(400, 300, 200, 30);
		lblx.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblx);

		tfx = new JTextField();
		tfx.setBounds(600, 300, 150, 30);
		add(tfx);

		// 12th class
		JLabel lblxii = new JLabel("Class XII(%) :");
		lblxii.setBounds(50, 350, 200, 30);
		lblxii.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblxii);

		tfxii = new JTextField();
		tfxii.setBounds(200, 350, 150, 30);
		add(tfxii);

		// Adhar no
		JLabel lbladhar = new JLabel("Adhar Number :");
		lbladhar.setBounds(400, 350, 200, 30);
		lbladhar.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lbladhar);

		tfadhar = new JTextField();
		tfadhar.setBounds(600, 350, 150, 30);
		add(tfadhar);

		// course
		JLabel lblcourse = new JLabel("Course :");
		lblcourse.setBounds(50, 400, 200, 30);
		lblcourse.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblcourse);

		String course[] = { "BTech", "BBA", "BCA", "Bsc", "MSc", "MBA", "MCA", "MCom", "MA", "BA","MTech" };

		cbcourse = new JComboBox(course);
		cbcourse.setBounds(200, 400, 150, 30);
		cbcourse.setBackground(Color.WHITE);
		add(cbcourse);

		// branch
		JLabel lblbranch = new JLabel("Branch :");
		lblbranch.setBounds(400, 400, 200, 30);
		lblbranch.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblbranch);

		String branch[] = { "Computer Science", "Electornic", "Mechanical", "Civil", "IT" };

		cbbranch = new JComboBox(branch);
		cbbranch.setBounds(600, 400, 150, 30);
		cbbranch.setBackground(Color.WHITE);
		add(cbbranch);

		submit = new JButton("Submit");
		submit.setBounds(450, 550, 120, 30);
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		submit.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(submit);

		cancel = new JButton("Cancel");
		cancel.setBounds(250, 550, 120, 30);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.addActionListener(this);
		cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(cancel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new AddStudent();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == submit) {
			String name = tfname.getText();
			String fname = tffname.getText();
			String rollno = fixrollnoJLabel.getText();
			String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
			String address = tfaddress.getText();
			String phone = tfphone.getText();
			String email = tfEmail.getText();
			String x = tfx.getText();
			String xii = tfxii.getText();
			String adhar = tfadhar.getText();
			String course = (String) cbcourse.getSelectedItem();
			String branch = (String) cbbranch.getSelectedItem();

			try {
				String query = "insert into student values('" + name + "','" + fname + "','" + rollno + "','" + dob
						+ "','" + address + "','" + phone + "','" + email + "','" + x + "','" + xii + "','" + adhar
						+ "','" + course + "','" + branch + "')";
				Conn con = new Conn();
				con.statement.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
				setVisible(false);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			setVisible(false);
		}

	}
}
