import javax.swing.JPanel;

public class MyPanel extends JPanel 
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyPanel()
	    {
	        super();
	    }
	    
	    public void setPos(int x, int y)
	    {
	        this.repaint();
	    }
}
