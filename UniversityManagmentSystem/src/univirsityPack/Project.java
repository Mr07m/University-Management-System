package univirsityPack;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Project extends JFrame implements ActionListener {
	public Project() {
		setSize(1366, 768);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel imge = new JLabel(i3);
		add(imge);

		JMenuBar mb = new JMenuBar();

		// information
		JMenu newInformation = new JMenu("New Information");
		newInformation.setForeground(Color.BLUE);
		mb.add(newInformation);

		JMenuItem facultyinfo = new JMenuItem("New Faculty Information");
		facultyinfo.setBackground(Color.WHITE);
		facultyinfo.addActionListener(this);
		newInformation.add(facultyinfo);

		JMenuItem studentinfo = new JMenuItem("New Student Information");
		studentinfo.setBackground(Color.WHITE);
		studentinfo.addActionListener(this);
		newInformation.add(studentinfo);

		// Details
		JMenu details = new JMenu("View Details");
		details.setForeground(Color.RED);
		mb.add(details);

		JMenuItem facultydetails = new JMenuItem("View Faculty Details");
		facultydetails.setBackground(Color.WHITE);
		facultydetails.addActionListener(this);
		details.add(facultydetails);

		JMenuItem studendetails = new JMenuItem("View Student Details");
		studendetails.setBackground(Color.WHITE);
		studendetails.addActionListener(this);
		details.add(studendetails);

		// Leave
		JMenu leave = new JMenu("Apply Leave");
		leave.setForeground(Color.BLUE);
		mb.add(leave);

		JMenuItem facultyleave = new JMenuItem("Faculty Leave");
		facultyleave.setBackground(Color.WHITE);
		facultyleave.addActionListener(this);
		leave.add(facultyleave);

		JMenuItem studenleave = new JMenuItem("Student Leave");
		studenleave.setBackground(Color.WHITE);
		studenleave.addActionListener(this);
		leave.add(studenleave);

		// Leave Details
		JMenu leavedetails = new JMenu("Leave Details");
		leavedetails.setForeground(Color.RED);
		mb.add(leavedetails);

		JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
		facultyleavedetails.setBackground(Color.WHITE);
		facultyleavedetails.addActionListener(this);
		leavedetails.add(facultyleavedetails);

		JMenuItem studenleavedetails = new JMenuItem("Student Leave Details");
		studenleavedetails.setBackground(Color.WHITE);
		studenleavedetails.addActionListener(this);
		leavedetails.add(studenleavedetails);

		// Exam
		JMenu exam = new JMenu("Examination");
		exam.setForeground(Color.BLUE);
		mb.add(exam);

		JMenuItem examdetails = new JMenuItem("Examination Results");
		examdetails.setBackground(Color.WHITE);
		examdetails.addActionListener(this);
		exam.add(examdetails);

		JMenuItem entermarks = new JMenuItem("Enter Marks");
		entermarks.setBackground(Color.WHITE);
		entermarks.addActionListener(this);
		exam.add(entermarks);

		// updateInfo
		JMenu updateInfo = new JMenu("Update Details");
		updateInfo.setForeground(Color.RED);
		mb.add(updateInfo);

		JMenuItem updatefacultydetails = new JMenuItem("Update Faculty Details");
		updatefacultydetails.setBackground(Color.WHITE);
		updatefacultydetails.addActionListener(this);
		updateInfo.add(updatefacultydetails);

		JMenuItem updatestudentdetails = new JMenuItem("Update Student Details");
		updatestudentdetails.setBackground(Color.WHITE);
		updatestudentdetails.addActionListener(this);
		updateInfo.add(updatestudentdetails);

		// fee
		JMenu fee = new JMenu("Fee Details");
		fee.setForeground(Color.BLUE);
		mb.add(fee);

		JMenuItem festructure = new JMenuItem("Fee Structure");
		festructure.setBackground(Color.WHITE);
		festructure.addActionListener(this);
		fee.add(festructure);

		JMenuItem feeform = new JMenuItem("Student Fee Form");
		feeform.setBackground(Color.WHITE);
		feeform.addActionListener(this);
		fee.add(feeform);

		// utility
		JMenu utility = new JMenu("Utility");
		utility.setForeground(Color.RED);
		mb.add(utility);

		JMenuItem notepad = new JMenuItem("Notepad");
		notepad.setBackground(Color.WHITE);
		notepad.addActionListener(this);
		utility.add(notepad);

		JMenuItem calc = new JMenuItem("Calculator");
		calc.setBackground(Color.WHITE);
		calc.addActionListener(this);
		utility.add(calc);
		
		
		//about
		JMenu about = new JMenu("About");
		about.setForeground(Color.BLUE);
		mb.add(about);

		JMenuItem ab = new JMenuItem("About");
		ab.setBackground(Color.WHITE);
		ab.addActionListener(this);
		about.add(ab);
		

		// exit
		JMenu exit = new JMenu("Exit");
		exit.setForeground(Color.RED);
		mb.add(exit);

		JMenuItem exit1 = new JMenuItem("Exit");
		exit1.setBackground(Color.WHITE);
		exit1.addActionListener(this);
		exit.add(exit1);
		
		

		setJMenuBar(mb);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Project();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msgString = e.getActionCommand();
		if (msgString.equals("Exit")) {
			setVisible(false);
		} else if (msgString.equals("Calculator")) {

			try {
				Runtime.getRuntime().exec("calc.exe");
			} catch (Exception e2) {

			}
		} 
		
		else if (msgString.equals("Notepad")) {

			try {
				Runtime.getRuntime().exec("notepad.exe");
			} catch (Exception e2) {

			}
		} else if (msgString.equals("New Faculty Information")) {
			new AddTeacher();
			
		}else if (msgString.equals("New Student Information")) {
			new AddStudent();
		}
		
		
		else if (msgString.equals("View Faculty Details")) {
			new TeacherDetails();
		}
		
		else if (msgString.equals("View Student Details")) {
			new StudentDetails();
		}
		
		
		else if (msgString.equals("Faculty Leave")) {
			new TeacherLeave();
		}
		
		else if (msgString.equals("Student Leave")) {
			new StudentLeave();
		}
		
		
		
		else if (msgString.equals("Faculty Leave Details")) {
			new TeacherLeaveDetails();
		}
		
		else if (msgString.equals("Student Leave Details")) {
			new StudentLeaveDetails();
		}
		
		else if (msgString.equals("Enter Marks")) {
			new EnterMarks();
		}
		
		
		else if (msgString.equals("Examination Results")) {
			new ExaminationDetails();
		}
		
		else if (msgString.equals("Fee Structure")) {
			new FeeStructure();
		}
		
		else if (msgString.equals("About")) {
			new About();
		}
		
		
		else if (msgString.equals("Update Student Details")) {
			new UpdateStudent();
		}
		
		else if (msgString.equals("Update Faculty Details")) {
			new UpdateTeacher();
		}
		
		else if (msgString.equals("Student Fee Form")) {
			new StudentFeeForm();
		}
		
		
		
		
		
	}
}
