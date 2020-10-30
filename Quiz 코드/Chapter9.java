package assignment;
import java.awt.*;
import javax.swing.*;

public class Chapter9 extends JFrame {
	public Chapter9() {
		setTitle("Open Challenge 9");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel north = new JPanel();
		JPanel center = new JPanel();
		center.setLayout(null);
		
		c.add(north, BorderLayout.NORTH);
		north.add(new JButton("Open"));
		north.add(new JButton("Read"));
		north.add(new JButton("Close"));
		
		c.add(center, BorderLayout.CENTER);
		JLabel hello = new JLabel("Hello");
		JLabel java = new JLabel("Java");
		JLabel love = new JLabel("Love");
		hello.setSize(30, 30);
		java.setSize(30, 30);
		love.setSize(30, 30);
		center.add(hello).setLocation(100, 15);
		center.add(java).setLocation(10, 200);
		center.add(love).setLocation(150, 65);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Chapter9();

	}

}
