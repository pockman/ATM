import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.event.DocumentListener;

public class MyFrame extends JFrame
{

  String str = "";
  //private int accountNumber;
  //private int pin;
  /*
     private boolean userAuthenticated; 
     private BankDatabase bankDatabase = new BankDatabase();;
     private static final int BALANCE_INQUIRY = 1;
     private static final int WITHDRAWAL = 2;
     private static final int DEPOSIT = 3;
     private static final int EXIT = 4;
     private final static int CANCELED = 6;
     private double amount;
     private CashDispenser cashDispenser = new CashDispenser();; // ATM's cash dispenser
     private DepositSlot depositSlot = new DepositSlot(); ; // reference to deposit slot */
  private JTextField show = new JTextField ();
  private JTextField input = new JTextField ();
  private JButton btn0 = new JButton ("0");
  private JButton btn1 = new JButton ("1");
  private JButton btn2 = new JButton ("2");
  private JButton btn3 = new JButton ("3");
  private JButton btn4 = new JButton ("4");
  private JButton btn5 = new JButton ("5");
  private JButton btn6 = new JButton ("6");
  private JButton btn7 = new JButton ("7");
  private JButton btn8 = new JButton ("8");
  private JButton btn9 = new JButton ("9");
  private JButton btn10 = new JButton ("Enter");
  private JButton btn11 = new JButton ("Delete");
  /*
     private JTextField show = new JTextField();
     private JButton[] buttons;
     private static final String[] names=
     {"1","2","3","4","5","6","7","8","9","0","Delete","Enter"};
     private Container container;
     private GridLayout gridLayout; */

  //private Document doc;

  public MyFrame ()
  {
    super ("ATM");


    show.setBounds (0, 0, 600, 100);
    add (show);
    input.setBounds (0, 100, 600, 100);
    add (input);

    btn1.setBounds (0, 200, 50, 50);
    add (btn1);
    btn2.setBounds (50, 200, 50, 50);
    add (btn2);
    btn3.setBounds (100, 200, 50, 50);
    add (btn3);
    btn4.setBounds (0, 250, 50, 50);
    add (btn4);
    btn5.setBounds (50, 250, 50, 50);
    add (btn5);
    btn6.setBounds (100, 250, 50, 50);
    add (btn6);
    btn7.setBounds (0, 300, 50, 50);
    add (btn7);
    btn8.setBounds (50, 300, 50, 50);
    add (btn8);
    btn9.setBounds (100, 300, 50, 50);
    add (btn9);
    btn0.setBounds (0, 350, 50, 50);
    add (btn0);
    btn10.setBounds (100, 350, 50, 50);
    add (btn10);
    btn11.setBounds (50, 350, 50, 50);
    add (btn11);

    /*
       gridLayout=new GridLayout(4,3);
       container=getContentPane();
       buttons=new JButton[12];
       for(int count=0;count<12;count++)
       {
       buttons[count]=new JButton(names[count]);
       add(buttons[count]);
       }
       container.setLayout(gridLayout);
       container.validate();
       container.setBounds(0, 250, 150, 200); */

    /*
     * 实现键盘输入功能
     */
    /*
       doc=input.getDocument();
       doc.addDocumentListener(new DocumentListener() {
       public void insertUpdate(DocumentEvent e) {  
       doc = e.getDocument();  
       try {
       str = doc.getText(0, doc.getLength());
       } catch (BadLocationException e1) {
       // TODO Auto-generated catch block
       e1.printStackTrace();
       } //返回文本框输入的内容  
       }  
       public void removeUpdate(DocumentEvent e) {  
       Document doc = e.getDocument();  
       try {
       str = doc.getText(0, doc.getLength());
       } catch (BadLocationException e1) {
       // TODO Auto-generated catch block
       e1.printStackTrace();
       } //返回文本框输入的内容  
       }  
       public void changedUpdate(DocumentEvent e) {  
       Document doc = e.getDocument();  
       try {
       str = doc.getText(0, doc.getLength());
       } catch (BadLocationException e1) {
       // TODO Auto-generated catch block
       e1.printStackTrace();
       } //返回文本框输入的内容  
       }  

     */
    btn1.addActionListener (new ActionListener ()
			    {
			    public void actionPerformed (ActionEvent e)
			    {
			    input.setText (input.getText () + "1");}
			    });
    btn2.addActionListener (new ActionListener ()
			    {
			    public void actionPerformed (ActionEvent e)
			    {
			    input.setText (input.getText () + "2");}
			    });
    btn3.addActionListener (new ActionListener ()
			    {
			    public void actionPerformed (ActionEvent e)
			    {
			    input.setText (input.getText () + "3");}
			    });
    btn4.addActionListener (new ActionListener ()
			    {
			    public void actionPerformed (ActionEvent e)
			    {
			    input.setText (input.getText () + "4");}
			    });
    btn5.addActionListener (new ActionListener ()
			    {
			    public void actionPerformed (ActionEvent e)
			    {
			    input.setText (input.getText () + "5");}
			    });
    btn6.addActionListener (new ActionListener ()
			    {
			    public void actionPerformed (ActionEvent e)
			    {
			    input.setText (input.getText () + "6");}
			    });
    btn7.addActionListener (new ActionListener ()
			    {
			    public void actionPerformed (ActionEvent e)
			    {
			    input.setText (input.getText () + "7");}
			    });
    btn8.addActionListener (new ActionListener ()
			    {
			    public void actionPerformed (ActionEvent e)
			    {
			    input.setText (input.getText () + "8");}
			    });
    btn9.addActionListener (new ActionListener ()
			    {
			    public void actionPerformed (ActionEvent e)
			    {
			    input.setText (input.getText () + "9");}
			    });
    btn0.addActionListener (new ActionListener ()
			    {
			    public void actionPerformed (ActionEvent e)
			    {
			    input.setText (input.getText () + "0");}
			    });
    btn10.addActionListener (new ActionListener ()
			     {
			     public void actionPerformed (ActionEvent e)
			     {
			     str = input.getText ();}
			     });
    btn11.addActionListener (new ActionListener ()
			     {
			     public void actionPerformed (ActionEvent e)
			     {
			     input.setText ("");}
			     });




    show.setText ("\nWelcome\nPlease enter your account number:");
    System.out.println (str);
    //accountNumber = Integer.parseInt(str);  
    if (str != "")
      {
	show.setText ("\nEnter your PIN: ");
      }
    //pin = Integer.parseInt(str);
    /*
       // set userAuthenticated to boolean value returned by database
       userAuthenticated =
       bankDatabase.authenticateUser( accountNumber, pin );

       // check whether authentication succeeded
       if ( !userAuthenticated )
       {
       show.setText(
       "Invalid account number or PIN. Please try again." );
       } // end if


       // show main menu and get user selection
       show.setText( "\nMain menu:\n"
       + "1 - View my balance\n"
       + "2 - Withdraw cash\n"
       + "3 - Deposit funds\n"
       + "4 - Exit\n"
       + "Enter a choice:" );
       str = "9";
       int mainMenuSelection = Integer.parseInt(str); 

       boolean userExited = false; // user has not chosen to exit
       // loop while user has not chosen option to exit system
       while ( !userExited )
       {
       // decide how to proceed based on user's menu selection
       switch ( mainMenuSelection )
       {
       // user chose to perform the first transaction type
       case BALANCE_INQUIRY:
       double availableBalance =
       bankDatabase.getAvailableBalance( accountNumber );
       double totalBalance =
       bankDatabase.getTotalBalance( accountNumber );
       show.setText( "\nBalance Information:\n"
       + "- Available balance:"
       + availableBalance
       +"\n - Total balance:"
       +totalBalance + "" );
       break;

       // user chose to perform the second transaction type   
       case WITHDRAWAL:
       boolean cashDispensed = false; // cash was not dispensed yet
       int userChoice = 0; // local variable to store return value

       // array of amounts to correspond to menu numbers
       int[] amounts = { 0, 20, 40, 60, 100, 200 };

       // loop while no valid choice has been made
       while ( userChoice == 0 )
       {
       // display the withdrawal menu
       show.setText( "\nWithdrawal Menu:\n"
       + "1 - $20\n"
       + "2 - $40\n"
       + "3 - $60\n"
       + "4 - $100\n"
       + "5 - $200\n"
       + "6 - Cancel transaction"
       + "\nChoose a withdrawal amount:" );
       int input = Integer.parseInt(str); // get user input through keypad

       // determine how to proceed based on the input value
       switch ( input )
       {
       case 1: // if the user chose a withdrawal amount
       case 2: // (i.e., chose option 1, 2, 3, 4 or 5), return the
       case 3: // corresponding amount from amounts array
       case 4:
       case 5:
       userChoice = amounts[ input ]; // save user's choice
       break;
       case CANCELED: // the user chose to cancel
       userChoice = CANCELED; // save user's choice
       break;
       default: // the user did not enter a value from 1-6
       show.setText(
       "\nInvalid selection. Try again." );
       } // end switch
       } // end while

       do
       {
       // check whether user chose a withdrawal amount or canceled
       if ( userChoice != CANCELED )
       {
       // get available balance of account involved
       availableBalance =
       bankDatabase.getAvailableBalance( accountNumber );

       // check whether the user has enough money in the account
       if ( userChoice <= availableBalance )
       {
       // check whether the cash dispenser has enough money
       if ( cashDispenser.isSufficientCashAvailable( userChoice ) )
       {
       // update the account involved to reflect the withdrawal
       bankDatabase.debit( accountNumber, userChoice );

       cashDispenser.dispenseCash( userChoice ); // dispense cash
       cashDispensed = true; // cash was dispensed
       // instruct user to take cash
       show.setText( "\nYour cash has been" +
       " dispensed. Please take your cash now." );
       } // end if
       else // cash dispenser does not have enough cash
       show.setText(
       "\nInsufficient cash available in the ATM." +
       "\n\nPlease choose a smaller amount." );
       } // end if
       else // not enough money available in user's account
       {
       show.setText(
       "\nInsufficient funds in your account." +
       "\n\nPlease choose a smaller amount." );
       } // end else
       } // end if
       else // user chose cancel menu option
       {
       show.setText( "\nCanceling transaction..." );
       return; // return to main menu because user canceled
       } // end else
       } while ( !cashDispensed );
       break;

       // user chose to perform the third transaction type   
       case DEPOSIT:
       show.setText( "\nPlease enter a deposit amount in " +
       "CENTS (or 6 to cancel): " );
       int input = Integer.parseInt(str); // receive input of deposit amount

       // check whether the user canceled or entered a valid amount
       if ( input == CANCELED )
       amount=CANCELED;
       else
       {
       amount=( double ) input / 100; // return dollar amount
       } // end else
       if ( amount != CANCELED )
       {
       // request deposit envelope containing specified amount
       show.setText(
       "\nPlease insert a deposit envelope containing "+amount+"." );
       // receive deposit envelope
       boolean envelopeReceived = depositSlot.isEnvelopeReceived();

       // check whether deposit envelope was received
       if ( envelopeReceived )
       {
       show.setText( "\nYour envelope has been " +
       "received.\nNOTE: The money just deposited will not " +
       "be available until we verify the amount of any " +
       "enclosed cash and your checks clear." );
       //credit account to reflect the deposit
       bankDatabase.credit( accountNumber, amount );
       } // end if
       else // deposit envelope not received
       {
       show.setText( "\nYou did not insert an " +
       "envelope, so the ATM has canceled your transaction." );
       } // end else
       } // end if
       else // user canceled instead of entering amount
       {
       show.setText( "\nCanceling transaction..." );
       } // end else
       break;


       case EXIT: // user chose to terminate session
       show.setText( "\nExiting the system..." );
       userExited = true; // this ATM session should end
       break;


       default: // user did not enter an integer from 1-4
       show.setText(
       "\nYou did not enter a valid selection. Try again." );
       break;
       } // end switch
       } // end while */



  }
}
