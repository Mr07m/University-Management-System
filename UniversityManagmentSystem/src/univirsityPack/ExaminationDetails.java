package univirsityPack;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

public class ExaminationDetails extends JFrame implements ActionListener {

	JTextField search;
	JButton submit, cancel;
	JTable table;

	ExaminationDetails() {
		setSize(1050, 475);
		setLocation(200, 100);

		setLayout(null);

		getContentPane().setBackground(Color.WHITE);

		JLabel heading = new JLabel("Check Result");
		heading.setBounds(80, 15, 400, 50);
		heading.setFont(new Font("Tahoma", Font.BOLD, 24));
		add(heading);

		search = new JTextField();
		search.setBounds(80, 90, 200, 30);
		search.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(search);

		submit = new JButton("Result");
		submit.setBounds(440, 90, 120, 30);
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		submit.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(submit);

		cancel = new JButton("Back");
		cancel.setBounds(300, 90, 120, 30);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.addActionListener(this);
		cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(cancel);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JScrollPane jsp = new JScrollPane(table);
		jsp.setBounds(0, 130, 1050, 310);
		add(jsp);

		try {

			Conn c = new Conn();
			ResultSet rs = c.statement.executeQuery("select*from student");
			table.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			e.printStackTrace();
		}

		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				int row = table.getSelectedRow();
				search.setText(table.getModel().getValueAt(row, 2).toString());
				
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new ExaminationDetails();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit) {
			
			setVisible(false);
			new Marks(search.getText());
		}
		else {
			setVisible(false);
		}
	}
}
