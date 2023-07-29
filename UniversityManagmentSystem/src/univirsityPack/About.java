package univirsityPack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame{
	
	public About() {
		setSize(700,500);
		setLocation(300,150);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
		Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel imge = new JLabel(i3);
		imge.setBounds(350,0,300,200);
		add(imge);
		
		
		
		JLabel heading=new JLabel("<html>University<br/>Mnagement System</html>");
		heading.setBounds(70,20,250,130);
		heading.setFont(new Font("Tahoma",Font.BOLD,30));
		add(heading);
		
		
		JLabel name=new JLabel("Developed By for Mukesh Rathod");
		name.setBounds(70,220,550,40);
		name.setFont(new Font("Tahoma",Font.BOLD,30));
		add(name);
		
		JLabel rollno=new JLabel("Roll No: 80");
		rollno.setBounds(70,280,550,40);
		rollno.setFont(new Font("Tahoma",Font.PLAIN,30));
		add(rollno);
		
		JLabel contact=new JLabel("Contact: co23mukeshrathod@gmail.com");
		contact.setBounds(70,340,550,40);
		contact.setFont(new Font("Tahoma",Font.PLAIN,20));
		add(contact);
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new About();
	}
}
