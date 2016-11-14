
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ControlPanel extends JPanel
implements ActionListener
{
	private BuncoTable table;
	private JLabel fdie = new JLabel("Fuzzy Dice Combination is 1, 3, 5");

	// Constructor
	public ControlPanel(BuncoTable t)
	{
		table = t;
		JButton rollButton = new JButton("Roll");
		rollButton.addActionListener(this);
		add(rollButton);

		add(fdie);
	}

	// Called when the roll button is clicked
	public void actionPerformed(ActionEvent e)
	{
		if (!table.diceAreRolling())
			table.rollDice();
	}
}
