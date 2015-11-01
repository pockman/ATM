import javax.swing.JFrame;
class GuiATM;

public class ATMCaseStudy
{
  // main method creates and runs the ATM
  public static void main (String[]args)
  {
    GuiATM ATM = new GuiATM ();
      ATM.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      ATM.setSize (600, 450);
      ATM.setVisible (true);
  }				// end main
}				// end class ATMCaseStudy
