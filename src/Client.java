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













/*
import java.awt.*;
import java.awt.image.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Client extends JFrame 
{    
    Container mainPanel;
    static JSpinner sp;
    public static JButton button1, button2, button3, button4, button5, button6;
    //static JComboBox cb, kindChooser;
    //static JTextField titleX, titleY, titleChart, TextA, TextB, TextC, TextD;
    //JFormattedTextField number;
    //JLabel greyLabel, numberLabel;
     
	public Client()
	{
		super("Unit Converter");
		initComponents();	
	}
		
	void setDebugBorder(JComponent c)
    {
        //Odkomentowac, zeby widziec granice
        //c.setBorder(BorderFactory.createLineBorder(Color.BLUE));
    }
		
	void setPrefferedMaxAndMinSize(Component c, int width, int height)
    {
        Dimension rozmiar = new Dimension(width, height);
        c.setPreferredSize(rozmiar);
        c.setMaximumSize(rozmiar);
        c.setMinimumSize(rozmiar);
    }
		
	private void initComponents() 
	{
		setLocation(300,20);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		mainPanel = getContentPane();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(255,248,220));
 
        mainPanel.add(getRow1());
        mainPanel.add(getRow2());
       
        setSize(750,650);//width, height      
    }
	
	private Box getBox(int height)
    {
        Box box = Box.createHorizontalBox();
        //box.setForeground(Color.green);//te¿ nie dzia³a
        setPrefferedMaxAndMinSize(box, 4096, height);
        setDebugBorder(box);
        return box;
    }
	

	private Component  getRow1()
    {
        return Box.createVerticalStrut(10);
    }

	//rozporki (struts) oraz sprê¿yny (glue)

	private Component  getRow2()//tu dodaj wybor rodzaju wykresu
    {
        Box box = getBox(23);
        buildRow2(box);
        return box;
    }   

    private Component  getRow3()
    {
       return  Box.createVerticalStrut(78);
    }
	
    private void buildRow2(JComponent panel) 
    {
    	
    	panel.add(Box.createHorizontalStrut(87));
    	button1 = new JButton ("Currency");
    	//button1.setToolTipText("xxx");
        setPrefferedMaxAndMinSize(button1, 60, 33);
        button1.setBackground(Color.white);
        button1.setForeground(new Color(218,165,32));
        button1.setEnabled(true);
        button1.addActionListener(new ActionListener()
        {
        	@Override
        	public void actionPerformed(ActionEvent e) 
        	{
        		
        		       		
        	}
        	});
        panel.add(button1); 
        
        panel.add(Box.createVerticalStrut(30));
        
        button2 = new JButton ("Length");
    	//button1.setToolTipText("xxx");
        setPrefferedMaxAndMinSize(button2, 60, 33);
        button2.setBackground(Color.white);
        button2.setForeground(new Color(218,165,32));
        button2.setEnabled(true);
        button2.addActionListener(new ActionListener()
        {
        	@Override
        	public void actionPerformed(ActionEvent e) 
        	{
        		
        		       		
        	}
        	});
        panel.add(button2); 
        
        panel.add(Box.createVerticalStrut(30));
        
        button3 = new JButton ("Weight");
    	//button1.setToolTipText("xxx");
        setPrefferedMaxAndMinSize(button3, 60, 33);
        button3.setBackground(Color.white);
        button3.setForeground(new Color(218,165,32));
        button3.setEnabled(true);
        button3.addActionListener(new ActionListener()
        {
        	@Override
        	public void actionPerformed(ActionEvent e) 
        	{
        		
        		       		
        	}
        	});
        panel.add(button3);
        
        panel.add(Box.createVerticalStrut(30));
        
        button4 = new JButton ("Volume");
    	//button1.setToolTipText("xxx");
        setPrefferedMaxAndMinSize(button4, 60, 33);
        button4.setBackground(Color.white);
        button4.setForeground(new Color(218,165,32));
        button4.setEnabled(true);
        button4.addActionListener(new ActionListener()
        {
        	@Override
        	public void actionPerformed(ActionEvent e) 
        	{
        		
        		       		
        	}
        	});
        panel.add(button4); 
        
        panel.add(Box.createVerticalStrut(30));
        
        button5 = new JButton ("Area");
    	//button1.setToolTipText("xxx");
        setPrefferedMaxAndMinSize(button5, 60, 33);
        button5.setBackground(Color.white);
        button5.setForeground(new Color(218,165,32));
        button5.setEnabled(true);
        button5.addActionListener(new ActionListener()
        {
        	@Override
        	public void actionPerformed(ActionEvent e) 
        	{
        		
        		       		
        	}
        	});
        panel.add(button5); 
        
        
        panel.add(Box.createVerticalStrut(30));
        
        button6 = new JButton ("Temperature");
    	//button1.setToolTipText("xxx");
        setPrefferedMaxAndMinSize(button6, 60, 33);
        button6.setBackground(Color.white);
        button6.setForeground(new Color(218,165,32));
        button6.setEnabled(true);
        button6.addActionListener(new ActionListener()
        {
        	@Override
        	public void actionPerformed(ActionEvent e) 
        	{
        		
        		       		
        	}
        	});
        panel.add(button6); 
        
        panel.add(Box.createHorizontalStrut(30));//pozioma rozpórka - szerokoœæ wolna od brzegu       
    }
 
   
	public static void main(String[] args) //throws IOException, ClassNotFoundException
    { 
		SwingUtilities.invokeLater(new Runnable() 
	    {
	        public void run() 
	        {
	            new Client().setVisible(true);
	        }
	    });
		
		
    }
}*/
