import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUI extends JFrame implements ActionListener
{
	private JPanel pane = new JPanel();
	private JLabel prompt = new JLabel("PVP 1v1 Good Luck");
	private JButton goButton = new JButton("THROW");
	private JTextField inField = new JTextField("Enter Name");
	
	public GUI(String title){
		setSize(400,400);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		GUI gui = new GUI("DartBoard Game");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}