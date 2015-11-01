import java.awt.TextArea;
import java.awt.Panel;

public class GuiScreen extends Panel
{

  private TextArea miniScreen;
  public GuiScreen ()
  {
    miniScreen = new TextArea (null, 10, 10, TextArea.SCROLLBARS_NONE);	// 10x10
    add (miniScreen);
  }

// display a message without a carriage return
  public void displayMessage (String message)
  {
  }				// end method displayMessage

  // display a message with a carriage return
  public void displayMessageLine (String message)
  {
  }				// end method displayMessageLine

  // displays a dollar amount
  public void displayDollarAmount (double amount)
  {
  }				// end method displayDollarAmount
}				// end class Screen
