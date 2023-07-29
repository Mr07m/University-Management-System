package univirsityPack;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EnterMarks extends JFrame implements ActionListener {

	Choice crollno;
	JComboBox cbsemester;
	JTextField tfsub1, tfsub2, tfsub3, tfsub4, tfsub5, tfmarks1, tfmarks2, tfmarks3, tfmarks4, tfmarks5;

	JButton submit, cancel;

	public EnterMarks() {

		setSize(1000, 500);
		setLocation(200, 150);
		setLayout(null);

		getContentPane().setBackground(Color.WHITE);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/exam.jpg"));
		Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel imge = new JLabel(i3);
		imge.setBounds(500, 40, 400, 300);
		add(imge);

		JLabel heading = new JLabel("Enter Marks of Student");
		heading.setBounds(50, 0, 500, 50);
		heading.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(heading);

		JLabel lblrollnumber = new JLabel("Select Roll Number");
		lblrollnumber.setBounds(50, 70, 150, 20);
		lblrollnumber.setFont(new Font("serif", Font.PLAIN, 18));
		add(lblrollnumber);

		crollno = new Choice();
		crollno.setBounds(200, 70, 150, 20);
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

		JLabel lblsemester = new JLabel("Select Semester");
		lblsemester.setBounds(50, 110, 150, 20);
		lblsemester.setFont(new Font("serif", Font.PLAIN, 18));
		add(lblsemester);

		String semester[] = { "1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester",
				"6th Semester", "7th Semester", "8th Semester" };
		cbsemester = new JComboBox(semester);
		cbsemester.setBounds(200, 110, 150, 20);
		cbsemester.setBackground(Color.WHITE);
		add(cbsemester);

		JLabel lblentersubject = new JLabel("Enter Subject");
		lblentersubject.setBounds(100, 150, 200, 40);
		lblentersubject.setFont(new Font("serif", Font.PLAIN, 18));
		add(lblentersubject);

		JLabel lblmarks = new JLabel("Enter Marks");
		lblmarks.setBounds(320, 150, 200, 40);
		lblmarks.setFont(new Font("serif", Font.PLAIN, 18));
		add(lblmarks);

		// subject
		tfsub1 = new JTextField();
		tfsub1.setBounds(50, 200, 200, 20);
		add(tfsub1);

		tfsub2 = new JTextField();
		tfsub2.setBounds(50, 230, 200, 20);
		add(tfsub2);

		tfsub3 = new JTextField();
		tfsub3.setBounds(50, 260, 200, 20);
		add(tfsub3);

		tfsub4 = new JTextField();
		tfsub4.setBounds(50, 290, 200, 20);
		add(tfsub4);

		tfsub5 = new JTextField();
		tfsub5.setBounds(50, 320, 200, 20);
		add(tfsub5);

		// marks
		tfmarks1 = new JTextField();
		tfmarks1.setBounds(250, 200, 200, 20);
		add(tfmarks1);

		tfmarks2 = new JTextField();
		tfmarks2.setBounds(250, 230, 200, 20);
		add(tfmarks2);

		tfmarks3 = new JTextField();
		tfmarks3.setBounds(250, 260, 200, 20);
		add(tfmarks3);

		tfmarks4 = new JTextField();
		tfmarks4.setBounds(250, 290, 200, 20);
		add(tfmarks4);

		tfmarks5 = new JTextField();
		tfmarks5.setBounds(250, 320, 200, 20);
		add(tfmarks5);

		submit = new JButton("Submit");
		submit.setBounds(280, 360, 150, 25);
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		submit.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(submit);

		cancel = new JButton("Back");
		cancel.setBounds(70, 360, 150, 25);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.addActionListener(this);
		cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(cancel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new EnterMarks();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			try {

				Conn c = new Conn();

				String query1 = "insert into subject values('" + crollno.getSelectedItem() + "','"
						+ cbsemester.getSelectedItem() + "','" + tfsub1.getText() + "','" + tfsub2.getText() + "','"
						+ tfsub3.getText() + "','" + tfsub4.getText() + "','" + tfsub5.getText() + "')";

				String query2 = "insert into marks values('" + crollno.getSelectedItem() + "','"
						+ cbsemester.getSelectedItem() + "','" + tfmarks1.getText() + "','" + tfmarks2.getText() + "','"
						+ tfmarks3.getText() + "','" + tfmarks4.getText() + "','" + tfmarks5.getText() + "')";

				c.statement.executeUpdate(query1);
				c.statement.executeUpdate(query2);

				JOptionPane.showMessageDialog(null, "Marks Inserted Successfully");
				setVisible(false);
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		} else {
			setVisible(false);
		}
	}
}
