import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;

public class GuiKeyPad extends Panel
{
  static int i;

  private JButton[] buttons;
  private static final String[] names =
    { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "Delete", "Enter" };

  private Container container;
  private GridLayout gridLayout;

  private String innerString; 

  public GuiKeyPad ()
  {

    innerString = new String();

    gridLayout = new GridLayout (4, 3);
    buttons = new JButton[12];

    for (int count = 0; count < 12; count++)
      {
	buttons[count] = new JButton (names[count]);
	add (buttons[count]);
      }

    setLayout (gridLayout);
    validate ();

    for (i = 0; i < 10; i++)
      buttons[i].addActionListener (new ActionListener ()
				    {
					    public void actionPerformed (ActionEvent e)
					    {
						    innerString += getKeyPadInput (i);
						    System.out.println(innerString);
					    }
				    }
				    
				    );
  }

  public String getInnerString()
  {
	  return innerString;

  }
  private String getKeyPadInput (int i)
  {
    return names[i];
  }
  public int getInput ()
  {
    return 0; 
  }
}
