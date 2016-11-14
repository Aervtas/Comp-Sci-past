import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class DisplayPanel extends JPanel
{
	private JLabel p1, p2, p3;
	private JTextField dNum=new JTextField("6",5);
	private JTextField Player, rNum, pointText, fuzzDice, rWins;
	private JTextField Player2, pointText2, fuzzDice2, rWins2;
	private JTextField Player3, pointText3, fuzzDice3, rWins3;
	private int pointCount, rCount, pointCount2, rCount2, pointCount3, rCount3;

	// Constructor
	public DisplayPanel()
	{
		super(new GridLayout(5, 5, 10, 5));
		setBorder(new EmptyBorder(0, 0, 5, 0));
		
		add(new JLabel("    Dice Size:"));
		add(dNum);
		add(new JLabel());
		add(new JLabel());
		add(new JLabel());
		add(new JLabel("    Player:"));
		add(new JLabel("    Round:"));
		add(new JLabel("    Points in Round:"));
		add(new JLabel("    Rounds Won:"));
		add(new JLabel("    Fuzzy Dice?"));

		Font displayFont = new Font("Monospaced", Font.BOLD, 16);

		Player = new JTextField("  1", 5);					//Player
		Player.setFont(displayFont);
		Player.setEditable(false);
		Player.setBackground(Color.WHITE);
		add(Player);

		rNum = new JTextField("  1", 5);					//Round number
		rNum.setFont(displayFont);
		rNum.setEditable(false);
		rNum.setBackground(Color.WHITE);
		add(rNum);

		pointText = new JTextField(5);						//Points this round
		pointText.setFont(displayFont);
		pointText.setEditable(false);
		pointText.setBackground(Color.GRAY);
		add(pointText);

		rWins = new JTextField("  0", 5);
		rWins.setFont(displayFont);
		rWins.setEditable(false);
		rWins.setBackground(Color.WHITE);
		add(rWins);

		fuzzDice = new JTextField("  You don't got it", 5);
		fuzzDice.setFont(displayFont);
		fuzzDice.setEditable(false);
		fuzzDice.setBackground(Color.WHITE);
		add(fuzzDice);

		Player2 = new JTextField("  2", 5);					//Player
		Player2.setFont(displayFont);
		Player2.setEditable(false);
		Player2.setBackground(Color.WHITE);
		add(Player2);

		rNum = new JTextField("  1", 5);					//Round Number
		rNum.setFont(displayFont);
		rNum.setEditable(false);
		rNum.setBackground(Color.WHITE);
		add(rNum);

		pointText2 = new JTextField(5);						//Points this round
		pointText2.setFont(displayFont);
		pointText2.setEditable(false);
		pointText2.setBackground(Color.GRAY);
		add(pointText2);

		rWins2 = new JTextField("  0", 5);
		rWins2.setFont(displayFont);
		rWins2.setEditable(false);
		rWins2.setBackground(Color.WHITE);
		add(rWins2);

		fuzzDice2 = new JTextField("  You don't got it", 5);
		fuzzDice2.setFont(displayFont);
		fuzzDice2.setEditable(false);
		fuzzDice2.setBackground(Color.WHITE);
		add(fuzzDice2);

		Player3 = new JTextField("  3", 5);
		Player3.setFont(displayFont);
		Player3.setEditable(false);
		Player3.setBackground(Color.WHITE);
		add(Player3);

		rNum = new JTextField("  1", 5);
		rNum.setFont(displayFont);
		rNum.setEditable(false);
		rNum.setBackground(Color.WHITE);
		add(rNum);

		pointText3 = new JTextField(5);
		pointText3.setFont(displayFont);
		pointText3.setEditable(false);
		pointText3.setBackground(Color.GRAY);
		add(pointText3);

		rWins3 = new JTextField("  0", 5);
		rWins3.setFont(displayFont);
		rWins3.setEditable(false);
		rWins3.setBackground(Color.WHITE);
		add(rWins3);

		fuzzDice3 = new JTextField("  You don't got it", 5);
		fuzzDice3.setFont(displayFont);
		fuzzDice3.setEditable(false);
		fuzzDice3.setBackground(Color.WHITE);
		add(fuzzDice3);
	}

	// Updates this display, based on the result and
	// "point" in the previous roll
	public void update(int result, int point, int round, boolean fdie)
	{
		rWins.setText("  "+result);
		if(fdie){
			fuzzDice.setText("You got it!");
		}
		if (result == 700)
		{
			rWins.setText("BUNCO!!!");
			pointText.setText("YOU WON!!!");
		}
		else if (result > 0)
		{
			pointCount=point;
			rNum.setText("  " + round);
			pointText.setText("  "+pointCount);
			pointText.setBackground(Color.GRAY);
		}
		else
		{
			pointText.setText("  " + point);
			pointText.setBackground(Color.YELLOW);
		}
	}

	public void update2(int result, int point, int round, boolean fdie)
	{
		rWins.setText("  "+result);
		if(fdie){
			fuzzDice2.setText("You got it!");
		}
		if (result == 700)
		{
			rWins2.setText("BUNCO!!!");
			pointText2.setText("YOU WON!!!");
		}
		else if (result > 0)
		{
			pointCount2=point;
			rNum.setText("  " + round);
			pointText2.setText("  "+pointCount);
			pointText2.setBackground(Color.GRAY);
		}
		else
		{
			pointText2.setText("  " + point);
			pointText2.setBackground(Color.YELLOW);
		}
	}

	public void update3(int result, int point, int round, boolean fdie)
	{
		rWins.setText("  "+result);
		if(fdie){
			fuzzDice3.setText("You got it!");
		}
		if (result == 700)
		{
			rWins3.setText("BUNCO!!!");
			pointText3.setText("YOU WON!!!");
		}
		else if (result > 0)
		{
			pointCount3=point;
			rNum.setText("  " + round);
			pointText3.setText("  "+pointCount);
			pointText3.setBackground(Color.GRAY);
		}
		else
		{
			pointText3.setText("  " + point);
			pointText3.setBackground(Color.YELLOW);
		}
	}
	
	public void update4(){
		rNum.setText("YOU DONE");
	}
	
	public int getDnum(){
		return Integer.parseInt(dNum.getText());
	}
}
