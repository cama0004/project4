import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Project 4
 * @author jesuscamarena_
 *
 */

public class Frame extends JFrame {
	 
	/** Use default UID */
    private static final long serialVersionUID = 1L;
 
    /** panel for slider */
    JPanel panel0 = new JPanel();
    /** panel for the parameter inputs */
    JPanel panel1 = new JPanel(new GridLayout(0, 5));
    /** panel for the error message */
    JPanel panel2 = new JPanel();
    /** panel for the calculate button */
    JPanel panel3 = new JPanel();
    /** panel for the radio buttons */
    JPanel panel4 = new JPanel();

/**
     * This method builds and operates the GUI window.
     * @param title The title of the window.
     */
	    public Frame(String title)
	    {
	        this.setSize(300, 400);

	        this.setLocationRelativeTo(null);

	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	        this.setVisible(true);

	    }


	    public static void main(String[] args) throws InterruptedException
	    {
	        Frame frame = new Frame("Oklahoma Mesonet - Statistics Calculator");

	}
}
  
