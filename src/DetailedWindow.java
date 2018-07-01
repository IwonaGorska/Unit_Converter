import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class DetailedWindow extends JFrame
{	
	
	private static final long serialVersionUID = 1L;
	Container paneD;
	private JButton button1;
     
     DetailedWindow() 
     {
  	    super("Unit_Converter");
  	    paneD = getContentPane();
  	    paneD.setLayout(new BoxLayout(paneD, BoxLayout.Y_AXIS));
  	    createAndShowGUI();
     }
     
     void setPrefferedMaxAndMinSize(Component c, int width, int height)
     {
         Dimension rozmiar = new Dimension(width, height);
         c.setPreferredSize(rozmiar);
         c.setMaximumSize(rozmiar);
         c.setMinimumSize(rozmiar);
     }
     
      protected void countScore() 
      {
	  }
	     
    
 	//private void createView(/*parametry rozne dla roznych buttonow z Clienta, tablica stringow odpowiednia*/) 
     public void createView(String s[])
     {
    	 JLabel LabFrom=new JLabel("From: ");
     	 setPrefferedMaxAndMinSize(LabFrom, 70, 70);
         paneD.add(LabFrom);               
         JComboBox ComboFrom=new JComboBox();
         for(int i=0;i<s.length;i++)
         {
        	 ComboFrom.addItem(s[i]); 
         }       
         ComboFrom.setPreferredSize(new Dimension(120, 30));
         ComboFrom.setBackground(Color.white);
         paneD.add(ComboFrom);
         
         JLabel LabTo=new JLabel("To: ");
     	 setPrefferedMaxAndMinSize(LabTo, 70, 70);
         paneD.add(LabTo);               
         JComboBox ComboTo=new JComboBox();
         for(int i=0;i<s.length;i++)
         {
        	 ComboTo.addItem(s[i]); 
         } 
         ComboTo.setPreferredSize(new Dimension(120, 30));
         ComboTo.setBackground(Color.white);
         paneD.add(ComboTo);
	}
    
 
    private void createAndShowGUI() 
    {
        setLocation(600,20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(false); // I will set it visilbe later in another method
		setSize(300,400); 
		setResizable(true);
    }
 
    
}
