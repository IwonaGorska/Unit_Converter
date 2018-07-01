import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class DetailedWindow extends JFrame
{	
	
	private static final long serialVersionUID = 1L;
	Container paneD;
	private JButton button1;
	String s[];
	int actionMaker;
     
     DetailedWindow(String z[], int aM) 
     {
  	    super("Konwerter jednostek");
  	    this.s=z;
  	    this.actionMaker=aM;
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
     
     private void createAndShowGUI() 
     {
    	 setLocation(600,20);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         paneD.add(getRow1());
         paneD.add(getRow2());
         paneD.add(getRow3());
         paneD.add(getRow4());
         paneD.add(getRow5());
         paneD.add(getRow6());
         paneD.add(getRow7());
         paneD.add(Box.createVerticalGlue());
         paneD.add(getRow8());
         paneD.add(getRow9());
         pack();
         setSize(500,300);
         
     }
     
     private Box getBox(int height)
     {
         Box box = Box.createHorizontalBox();
         //box.setForeground(Color.green);//te¿ nie dzia³a
         setPrefferedMaxAndMinSize(box, 4096, height);
         return box;
     }
     
     private Component  getRow1()
     {
         return Box.createVerticalStrut(10);
     }

 	private Component  getRow2()
     {
         Box box = getBox(23);
         buildRow2(box);
         return box;
     }

 	 private Component  getRow3()
     {
        return  Box.createVerticalStrut(10);
     }
 	
 	private Component  getRow4()
     {
         Box box = getBox(23);
         buildRow4(box);
         return box;
     }

 	private Component  getRow5()
     {
 		return Box.createVerticalStrut(50);
     }

     private Component  getRow6()
     {
         Box box = getBox(23);
         buildRow6(box);
         return box;
     }
     
     private Component  getRow7()
     {
        return  Box.createVerticalStrut(10);
     }
     
     private Component  getRow8()
     {
         Box box = getBox(23);
         buildRow8(box);
         return box;
     }
     
     private Component  getRow9()
     {
        return  Box.createVerticalStrut(10);
     }
     
     private void buildRow2(JComponent paneD) 
     {
    	 JLabel LabFrom=new JLabel("Od: ");
     	 setPrefferedMaxAndMinSize(LabFrom, 70, 70);
         paneD.add(LabFrom);               
         JComboBox ComboFrom=new JComboBox();
         for(int i=0;i<s.length;i++)
         {
        	 ComboFrom.addItem(s[i]); 
         }       
         ComboFrom.setPreferredSize(new Dimension(120, 23));
         ComboFrom.setBackground(Color.white);
         ComboFrom.addActionListener(new ActionListener()
 	    {
 	    	@Override
 	    	public void actionPerformed(ActionEvent e) 
 	    	{
 	    		switch(actionMaker)
 	    		{
 	    			case1: score.setValue();
 	    			//case2: score.setValue(Length(units, )) inaczej:
 	    		//score.setValue(L.countScore(prametry pozyskane z obecnych w tej klasie pol modyfikowanych przez usera)
 	    		// gdzie L to obiekt klasy Length
 	    			case3:
 	    			case4:
 	    			case5:
 	    			case6:
 	    		}
 	    	}
 	    	});
         paneD.add(ComboFrom);
     }
     
     private void buildRow4(JComponent paneD) 
     {
    	 JLabel labelV = new JLabel("Wartosc:");
         setPrefferedMaxAndMinSize(labelV, 120, 90);
         paneD.add(labelV);         
         JTextField value = new JTextField();
         value.setEditable(true);
         setPrefferedMaxAndMinSize(value, 300, 23);
         paneD.add(value);
         //domyslna wartosc to 1 bedzie i ograniczenie na wprowadzanie tylko liczb rzeczywistych dodatnich
     }
     
     private void buildRow6(JComponent paneD) 
     {
    	 JLabel LabTo=new JLabel("Na: ");
     	 setPrefferedMaxAndMinSize(LabTo, 70, 70);
         paneD.add(LabTo);               
         JComboBox ComboTo=new JComboBox();
         for(int i=0;i<s.length;i++)
         {
        	 ComboTo.addItem(s[i]); 
         } 
         ComboTo.setPreferredSize(new Dimension(120, 23));
         ComboTo.setBackground(Color.white);
         paneD.add(ComboTo);
         
     }
     
     private void buildRow8(JComponent paneD) 
     {
    	 JLabel labelS = new JLabel("Wynik:");
         setPrefferedMaxAndMinSize(labelS, 120, 90);
         paneD.add(labelS);         
         JTextField score = new JTextField();
         score.setEditable(false);// user can not edit the score
         setPrefferedMaxAndMinSize(score, 300, 23);
         paneD.add(score);
     }
     
       
    
 	//private void createView(/*parametry rozne dla roznych buttonow z Clienta, tablica stringow odpowiednia*/) 
     /* public void createView(String s[])
     {
    	
    	 paneD.add(getRow1());
         paneD.add(getRow2());
         paneD.add(getRow3());
         paneD.add(getRow4());
         paneD.add(getRow5());
         paneD.add(getRow6());
         paneD.add(getRow7());
         paneD.add(getRow8());
         
    	 JLabel LabFrom=new JLabel("From: ");
     	 setPrefferedMaxAndMinSize(LabFrom, 70, 70);
         paneD.add(LabFrom);               
         JComboBox ComboFrom=new JComboBox();
         for(int i=0;i<s.length;i++)
         {
        	 ComboFrom.addItem(s[i]); 
         }       
         ComboFrom.setPreferredSize(new Dimension(120, 23));
         ComboFrom.setBackground(Color.white);
         paneD.add(ComboFrom);
         
         JLabel labelV = new JLabel("Your value:");
         setPrefferedMaxAndMinSize(labelV, 120, 90);
         paneD.add(labelV);         
         JTextField value = new JTextField();
         value.setEditable(true);
         setPrefferedMaxAndMinSize(value, 300, 23);
         paneD.add(value);
         
         JLabel LabTo=new JLabel("To: ");
     	 setPrefferedMaxAndMinSize(LabTo, 70, 70);
         paneD.add(LabTo);               
         JComboBox ComboTo=new JComboBox();
         for(int i=0;i<s.length;i++)
         {
        	 ComboTo.addItem(s[i]); 
         } 
         ComboTo.setPreferredSize(new Dimension(120, 23));
         ComboTo.setBackground(Color.white);
         paneD.add(ComboTo);
         
         JLabel labelS = new JLabel("Score:");
         setPrefferedMaxAndMinSize(labelS, 120, 90);
         paneD.add(labelS);         
         JTextField score = new JTextField();
         score.setEditable(false);// user can not edit the score
         setPrefferedMaxAndMinSize(score, 300, 23);
         paneD.add(score);
         
	}*/
    
   
}
