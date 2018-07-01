import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
 
public class Client extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JButton button1, button2, button3, button4, button5, button6;
	Container pane;
    //public static void addComponentsToPane(this.pane) {
    //pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));}
    
   
     Client() 
     {
  	    super("Unit_Converter");
  	    pane = getContentPane();
  	    pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
     }
     
     void setPrefferedMaxAndMinSize(Component c, int width, int height)
     {
         Dimension rozmiar = new Dimension(width, height);
         c.setPreferredSize(rozmiar);
         c.setMaximumSize(rozmiar);
         c.setMinimumSize(rozmiar);
     }
    
 	private void addAButtons() 
	{
 		DetailedWindow D = new DetailedWindow();
 		
 		button1 = new JButton ("Currency");
		//button1.setToolTipText("xxx");
	    setPrefferedMaxAndMinSize(button1, 300, 60);
	    //button1.setBackground(Color.white);
	    button1.setBackground(new Color(152, 251, 152));    
	    button1.setForeground(new Color(0, 100, 0));
	    button1.setEnabled(true);
	    button1.addActionListener(new ActionListener()
	    {
	    	@Override
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		
	    		//D.createView("first");
	    		//D.setVisible(true);
	    		       		
	    	}
	    	});
	    pane.add(button1); 
	    
	    pane.add(Box.createVerticalGlue()); //pionowy kleik
	    //pane.add(Box.createHorizontalGlue());//poziomy kleik
	    
	    button2 = new JButton ("Length");
		//button1.setToolTipText("xxx");
	    setPrefferedMaxAndMinSize(button2, 300, 60);
	  //button1.setBackground(Color.white);
	    button2.setBackground(new Color(152, 251, 152));    
	    button2.setForeground(new Color(0, 100, 0));
	    button2.setEnabled(true);
	    button2.addActionListener(new ActionListener()
	    {
	    	@Override
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		String units[] = new String[7];
	    		units[0]="mm";
	    		units[1]="cm";
	    		units[2]="m";
	    		units[3]="km";
	    		units[4]="feet";
	    		units[5]="inches";
	    		units[6]="miles";
	    		D.createView(units);
	    		D.setVisible(true);
	    		       		
	    	}
	    	});
	    pane.add(button2); 
	    
	    pane.add(Box.createVerticalGlue());
	    
	    button3 = new JButton ("Weight");
		//button1.setToolTipText("xxx");
	    setPrefferedMaxAndMinSize(button3, 300, 60);
	  //button1.setBackground(Color.white);
	    button3.setBackground(new Color(152, 251, 152));    
	    button3.setForeground(new Color(0, 100, 0));
	    button3.setEnabled(true);
	    button3.addActionListener(new ActionListener()
	    {
	    	@Override
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		String units[] = new String[9];
	    		units[0]="mg";
	    		units[1]="g";
	    		units[2]="dg";
	    		units[3]="kg";
	    		units[4]="tonne";
	    		units[5]="grains";
	    		units[6]="ounces";
	    		units[7]="pounds";
	    		units[8]="stones";
	    		D.createView(units);
	    		D.setVisible(true);
	    		       		
	    	}
	    	});
	    pane.add(button3);
	    
	    pane.add(Box.createVerticalGlue());
	    
	    button4 = new JButton ("Volume");
		//button1.setToolTipText("xxx");
	    setPrefferedMaxAndMinSize(button4, 300, 60);
	  //button1.setBackground(Color.white);
	    button4.setBackground(new Color(152, 251, 152));    
	    button4.setForeground(new Color(0, 100, 0));
	    button4.setEnabled(true);
	    button4.addActionListener(new ActionListener()
	    {
	    	@Override
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		String units[] = new String[7];
	    		units[0]="cm^3";
	    		units[1]="m^3";
	    		units[2]="feet^3";
	    		units[3]="gallons";
	    		units[4]="inches^3";
	    		units[5]="litres";
	    		units[6]="yards^3";
	    		D.createView(units);
	    		D.setVisible(true);      		
	    	}
	    	});
	    pane.add(button4); 
	    
	    pane.add(Box.createVerticalGlue());
	    
	    button5 = new JButton ("Area");
		//button1.setToolTipText("xxx");
	    setPrefferedMaxAndMinSize(button5, 300, 60);
	  //button1.setBackground(Color.white);
	    button5.setBackground(new Color(152, 251, 152));    
	    button5.setForeground(new Color(0, 100, 0));
	    button5.setEnabled(true);
	    button5.addActionListener(new ActionListener()
	    {
	    	@Override
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		String units[] = new String[9];
	    		units[0]="cm^2";
	    		units[1]="m^2";
	    		units[2]="acres";
	    		units[3]="feet^2";
	    		units[4]="hectares";
	    		units[5]="inches^2";
	    		units[6]="miles^2";
	    		units[7]="yards^2";
	    		units[8]="ares";
	    		D.createView(units);
	    		D.setVisible(true);       		
	    	}
	    	});
	    pane.add(button5); 
	    
	    pane.add(Box.createVerticalGlue());
	    
	    button6 = new JButton ("Temperature");
		//button1.setToolTipText("xxx");
	    setPrefferedMaxAndMinSize(button6, 300, 60);
	  //button1.setBackground(Color.white);
	    button6.setBackground(new Color(152, 251, 152));    
	    button6.setForeground(new Color(0, 100, 0));
	    button6.setEnabled(true);
	    button6.addActionListener(new ActionListener()
	    {
	    	@Override
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		String units[] = new String[3];
	    		units[0]="Kelvin";
	    		units[1]="Celsjusz";
	    		units[2]="Fahrenheit";
	    		D.createView(units);
	    		D.setVisible(true);     		
	    	}
	    	});
	    pane.add(button6); 	    
	    }
    
 
    private void createAndShowGUI() {
        //Create and set up the window.
        //JFrame frame = new JFrame("BoxLayoutDemo");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //Set up the content pane.
        //addComponentsToPane(frame.getContentPane()); 
        //Display the window.
        //frame.pack();
        //frame.setVisible(true);
        
        setLocation(600,20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setSize(300,400); 
		setResizable(false);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //createAndShowGUI();
            	Client C = new Client();
            	C.createAndShowGUI();
            	C.addAButtons(); 
            	
            }
        });
    }
}
