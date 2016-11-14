import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;

public class StringTest extends JFrame
        implements ActionListener
{
  private JTextField input, result;
  private JLabel prompt;

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.YELLOW);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);
    
    prompt = new JLabel("Enter to test if it is a Palindrome.");
    
    Box box2 = Box.createVerticalBox();
    box2.add(prompt);
    box1.add(Box.createVerticalStrut(20));
    box2.add(input);
    box2.add(Box.createVerticalStrut(20));
    box2.add(result);
    

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public void actionPerformed(ActionEvent e)
  {
    String str = input.getText();
    Palindrome hoi = new Palindrome();
    boolean b;
    
    b = hoi.isPalindrome(str);
    if(b)
    	result.setText("True");
    else
    	result.setText("False");
    input.selectAll();
  }

  public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(200, 200, 400, 200);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}

