
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.Timer;

public class BuncoTable extends JPanel
implements ActionListener
{
	private int turn=0;
	private RollingDie die1, die2, die3;
	private final int delay = 20;
	private Timer clock;
	private BuncoGame game;
	private DisplayPanel display;
	// Constructor
	public BuncoTable(DisplayPanel displ)
	{
		setBackground(Color.green);
		setBorder(new LineBorder(Color.ORANGE.darker(), 3));
		display = displ;
		game = new BuncoGame();
		die1 = new RollingDie();
		die2 = new RollingDie();
		die3 = new RollingDie();
		clock = new Timer(delay, this);
	}

	// Rolls the dice (called when the "Roll" button
	// is clicked)
	public void rollDice()
	{
		RollingDie.setBounds(3, getWidth() - 3, 3, getHeight() - 3);
		die1.roll(display.getDnum());
		die2.roll(display.getDnum());
		die3.roll(display.getDnum());
		clock.start();
	}

	// Processes timer events
	public void actionPerformed(ActionEvent e)
	{
		if (diceAreRolling())
		{
			if (!clock.isRunning())
				clock.restart();
			if (die1.isRolling())
				die1.avoidCollision(die2);
			else if (die1.isRolling())
				die1.avoidCollision(die3);
			if (die2.isRolling())
				die2.avoidCollision(die1);
			else if (die2.isRolling())
				die2.avoidCollision(die3);
			if (die3.isRolling())
				die3.avoidCollision(die1);
			else if (die2.isRolling())
				die3.avoidCollision(die2);
		}
		else
		{
			clock.stop();
			if(turn == 0){
				int[] total = {die1.getNumDots(), die2.getNumDots(), die3.getNumDots()};
				int result = game.processRoll(total, game.Round(), turn);
				int point = game.getPoint(turn);
				int round = game.Round();
				display.update(game.getWins(turn), point, round, game.fuzzdice());
				if(game.turn())
					turn=1;
			}
			else if(turn == 1){
				int[] total2 = {die1.getNumDots(), die2.getNumDots(), die3.getNumDots()};
				int result2 = game.processRoll(total2, game.Round(), turn);
				int point2 = game.getPoint(turn);
				int round2 = game.Round();
				display.update2(game.getWins(turn), point2, round2, game.fuzzdice());
				if(game.turn())
					turn=2;
			}
			else if(turn == 2){
				int[] total3 = {die1.getNumDots(), die2.getNumDots(), die3.getNumDots()};
				int result3 = game.processRoll(total3, game.Round(), turn);
				int point3 = game.getPoint(turn);
				int round3 = game.Round();
				display.update3(game.getWins(turn), point3, round3, game.fuzzdice());
				if(game.turn())
					turn=0;
			}
			for(int i=0; i<3; i++){
				if(game.getPoint(i) >= 21)
					game.roundOver();
			}
			if(game.Round()==display.getDnum()){
				display.update4();
			}
		}
			repaint();
	}

	// returns true if dice are still rolling; otherwise
	// returns false
	public boolean diceAreRolling()
	{
		return die1.isRolling() || die2.isRolling() || die3.isRolling();
	}

	// Called automatically after a repaint request
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		die1.draw(g);
		die2.draw(g);
		die3.draw(g);
	}
}
