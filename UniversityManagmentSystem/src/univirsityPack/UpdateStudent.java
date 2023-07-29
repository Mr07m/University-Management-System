package univirsityPack;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UpdateStudent extends JFrame implements ActionListener {
	JTextField tfbranch, tfcourse, tfaddress, tfphone, tfEmail;
	JLabel fixrollnoJLabel;
	JButton submit, cancel;
	Choice crollno;

	public UpdateStudent() {

		setSize(900, 650);
		setLocation(300, 50);
		setLayout(null);

		// heading
		JLabel heading = new JLabel("Update Student Details");
		heading.setBounds(50, 10, 500, 50);
		heading.setFont(new Font("Tahoma", Font.ITALIC, 35));
		add(heading);

		JLabel lblrollnumber = new JLabel("Select Roll Number");
		lblrollnumber.setBounds(50, 100, 200, 20);
		lblrollnumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblrollnumber);

		crollno = new Choice();
		crollno.setBounds(250, 100, 200, 20);
		add(crollno);

		try {
			Conn c = new Conn();
			ResultSet rs = c.statement.executeQuery("select*from student");
			while (rs.next()) {
				crollno.add(rs.getString("rollno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// name
		JLabel lblname = new JLabel("Name :");
		lblname.setBounds(50, 150, 100, 30);
		lblname.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblname);

		JLabel labelname = new JLabel();
		labelname.setBounds(200, 150, 150, 30);
		labelname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(labelname);

		// father name
		JLabel lblfname = new JLabel("Father's Name :");
		lblfname.setBounds(400, 150, 200, 30);
		lblfname.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblfname);

		JLabel labelfname = new JLabel();
		labelfname.setBounds(600, 150, 150, 30);
		labelfname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(labelfname);

		// roll no
		JLabel lblrollno = new JLabel("Roll Number :");
		lblrollno.setBounds(50, 200, 200, 30);
		lblrollno.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblrollno);

		fixrollnoJLabel = new JLabel();
		fixrollnoJLabel.setBounds(200, 200, 200, 30);
		fixrollnoJLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(fixrollnoJLabel);

		// DOB
		JLabel lbldob = new JLabel("Date of Birth :");
		lbldob.setBounds(400, 200, 200, 30);
		lbldob.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lbldob);

		JLabel labeldob = new JLabel();
		labeldob.setBounds(600, 200, 150, 30);
		labeldob.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(labeldob);

		// address
		JLabel lbladdress = new JLabel("Address :");
		lbladdress.setBounds(50, 250, 200, 30);
		lbladdress.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lbladdress);

		tfaddress = new JTextField();
		tfaddress.setBounds(200, 250, 150, 30);
		tfaddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(tfaddress);

		// phone
		JLabel lblphone = new JLabel("Phone :");
		lblphone.setBounds(400, 250, 200, 30);
		lblphone.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblphone);

		tfphone = new JTextField();
		tfphone.setBounds(600, 250, 150, 30);
		tfphone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(tfphone);

		// Email
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(50, 300, 200, 30);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setBounds(200, 300, 150, 30);
		tfEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(tfEmail);

		// class 10th
		JLabel lblx = new JLabel("Class X(%) :");
		lblx.setBounds(400, 300, 200, 30);
		lblx.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblx);

		JLabel labelx = new JLabel();
		labelx.setBounds(600, 300, 150, 30);
		labelx.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(labelx);

		// 12th class
		JLabel lblxii = new JLabel("Class XII(%) :");
		lblxii.setBounds(50, 350, 200, 30);
		lblxii.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblxii);

		JLabel labelxii = new JLabel();
		labelxii.setBounds(200, 350, 150, 30);
		labelxii.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(labelxii);

		// Adhar no
		JLabel lbladhar = new JLabel("Adhar Number :");
		lbladhar.setBounds(400, 350, 200, 30);
		lbladhar.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lbladhar);

		JLabel labeladhar = new JLabel();
		labeladhar.setBounds(600, 350, 150, 30);
		labeladhar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(labeladhar);

		// course
		JLabel lblcourse = new JLabel("Course :");
		lblcourse.setBounds(50, 400, 200, 30);
		lblcourse.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblcourse);

		tfcourse = new JTextField();
		tfcourse.setBounds(200, 400, 150, 30);
		tfcourse.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(tfcourse);

		// branch
		JLabel lblbranch = new JLabel("Branch :");
		lblbranch.setBounds(400, 400, 200, 30);
		lblbranch.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblbranch);

		tfbranch = new JTextField();
		tfbranch.setBounds(600, 400, 150, 30);
		tfbranch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(tfbranch);

		try {
			Conn c = new Conn();
			String query = "select*from student where rollno='" + crollno.getSelectedItem() + "'";
			ResultSet rs = c.statement.executeQuery(query);
			while (rs.next()) {
				labelname.setText(rs.getString("name"));
				labelfname.setText(rs.getString("fname"));
				labeldob.setText(rs.getString("dob"));
				tfaddress.setText(rs.getString("address"));
				tfphone.setText(rs.getString("phone"));
				tfEmail.setText(rs.getString("email"));
				labelx.setText(rs.getString("x"));
				labelxii.setText(rs.getString("xii"));
				labeladhar.setText(rs.getString("adhar"));
				lblrollno.setText(rs.getString("rollno"));
				tfcourse.setText(rs.getString("course"));
				tfbranch.setText(rs.getString("branch"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		crollno.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent ie) {
				try {
					Conn c = new Conn();
					String query = "select*from student where rollno='" + crollno.getSelectedItem() + "'";
					ResultSet rs = c.statement.executeQuery(query);
					while (rs.next()) {
						labelname.setText(rs.getString("name"));
						labelfname.setText(rs.getString("fname"));
						labeldob.setText(rs.getString("dob"));
						tfaddress.setText(rs.getString("address"));
						tfphone.setText(rs.getString("phone"));
						tfEmail.setText(rs.getString("email"));
						labelx.setText(rs.getString("x"));
						labelxii.setText(rs.getString("xii"));
						labeladhar.setText(rs.getString("adhar"));
						lblrollno.setText(rs.getString("rollno"));
						tfcourse.setText(rs.getString("course"));
						tfbranch.setText(rs.getString("branch"));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

		submit = new JButton("Update");
		submit.setBounds(450, 500, 120, 30);
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		submit.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(submit);

		cancel = new JButton("Cancel");
		cancel.setBounds(250, 500, 120, 30);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.addActionListener(this);
		cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(cancel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new UpdateStudent();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == submit) {

			String rollno = fixrollnoJLabel.getText();
			String address = tfaddress.getText();
			String phone = tfphone.getText();
			String email = tfEmail.getText();
			String course = tfcourse.getText();
			String branch = tfbranch.getText();

			try {
				String query = "update student set address='" + address + "',phone='" + phone + "',email='" + email
						+ "',course='" + course + "',branch='" + branch + "' where rollno='" + rollno + "'";
				Conn c = new Conn();
				c.statement.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Student Details Updated Successfully");
				setVisible(false);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			setVisible(false);
		}

	}
}
