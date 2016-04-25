/*
 * FirstButton.java
 * 
 */
import java.awt.*;
import javax.swing.*;
import java.awt.Color;

public class FirstButton extends JFrame {
	private final int SIZE = 400;
	private Container con = getContentPane();
	private JButton button = new JButton("Think about your life.");
	private JButton anotherButton = new JButton("Click Furriously.");
	
	public FirstButton() { 
		super("Buttons! Hooray :D");
		setSize(SIZE, SIZE/4);
		con.setLayout(new FlowLayout());
		con.add(button);
		con.add(anotherButton);
		con.setBackground(Color.BLACK);
		button.setBackground(Color.RED);
		button.setForeground(Color.WHITE);
		anotherButton.setBackground(Color.GREEN);
	}
	
	public static void main (String args[]) {
		FirstButton frame = new FirstButton();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

