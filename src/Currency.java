import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Currency extends DetailedWindow
{
	private static final long serialVersionUID = 1L;

	protected void countScore()
    {
   	 
    }
}

/*
 panel.add(Box.createHorizontalStrut(30));//pozioma rozpórka - szerokoœæ wolna od brzegu
    	JLabel kindChooserLab=new JLabel(" Rodzaj funkcji: ");
    	setPrefferedMaxAndMinSize(kindChooserLab, 170, 70);
        panel.add(kindChooserLab);
        
      
        kindChooser=new JComboBox(new Object[]{"--","f(x)=a*sin(bx)=0","f(x)=a*cos(bx)=0","f(x)=a*x^2+b*x+c=0", "f(x)=a*x^3+b*x^2+c*x+d=0", "f(x)=a*x+b=0","Inna"} );
        kindChooser.setPreferredSize(new Dimension(70, 70));
        kindChooser.setBackground(Color.white);
        panel.add(kindChooser);
        
        kindChooser.addActionListener(new ActionListener()
        {
        	@Override
        	public void actionPerformed(ActionEvent e) 
        	{
        		
        		if((String)kindChooser.getSelectedItem()=="--")
        		{
        			letterA.setEnabled(false);
        			letterB.setEnabled(false);
        			letterC.setEnabled(false);
        			TextA.setEnabled(false);
        			TextB.setEnabled(false);
        			TextC.setEnabled(false);
        			TextA.setText("");//czyszczenie pól
        			TextB.setText("");
        			TextC.setText("");
        			numberLabel.setEnabled(false);
        			sp.setEnabled(false);
        			number.setEnabled(false);
        			buttonAdd.setEnabled(false);
        			buttonOK.setEnabled(false);
        		}
        		else
        		{
        			if((String)kindChooser.getSelectedItem()=="Inna")
            		{
        				letterA.setEnabled(false);
            			letterB.setEnabled(false);
            			letterC.setEnabled(false);
            			TextA.setEnabled(false);
            			TextB.setEnabled(false);
            			TextC.setEnabled(false);
            			TextA.setText("");
            			TextB.setText("");
            			TextC.setText("");
            			numberLabel.setEnabled(true);
            			sp.setEnabled(true);
            			number.setEnabled(true);
            			buttonAdd.setEnabled(true);
            			buttonOK.setEnabled(false);
            		}
            		else
            		{
            			if((String)kindChooser.getSelectedItem()=="f(x)=a*x^3+b*x^2+c*x+d=0")
            			{
            				letterA.setEnabled(true);
                			letterB.setEnabled(true);
                			letterC.setEnabled(true);
                			letterD.setEnabled(true);//d tylko przy szeœciennej siê podaje
                			TextA.setEnabled(true);
                			TextB.setEnabled(true);
                			TextC.setEnabled(true);
                			TextD.setEnabled(true);
                			TextA.setText("");
                			TextB.setText("");
                			TextC.setText("");
                			TextD.setText("");
                			numberLabel.setEnabled(false);
                			sp.setEnabled(false);
                			number.setEnabled(false);
                			buttonAdd.setEnabled(false);
                			buttonOK.setEnabled(true);
            			}
            			else
            			{
            				if((String)kindChooser.getSelectedItem()=="f(x)=a*x^2+b*x+c=0")
                			{
                				letterA.setEnabled(true);
                    			letterB.setEnabled(true);
                    			letterC.setEnabled(true);
                    			letterD.setEnabled(false);
                    			TextA.setEnabled(true);
                    			TextB.setEnabled(true);
                    			TextC.setEnabled(true);//c tylko przy kwadratowej siê podaje
                    			TextD.setEnabled(false);
                    			TextA.setText("");
                    			TextB.setText("");
                    			TextC.setText("");
                    			TextD.setText("");
                    			numberLabel.setEnabled(false);
                    			sp.setEnabled(false);
                    			number.setEnabled(false);
                    			buttonAdd.setEnabled(false);
                    			buttonOK.setEnabled(true);
                			}
                			else
                			{
                				letterA.setEnabled(true);
                    			letterB.setEnabled(true);
                    			letterC.setEnabled(false);
                    			letterD.setEnabled(false);
                    			TextA.setEnabled(true);
                    			TextB.setEnabled(true);
                    			TextC.setEnabled(false);
                    			TextD.setEnabled(false);
                    			TextA.setText("");
                    			TextB.setText("");
                    			TextC.setText("");
                    			TextD.setText("");
                    			numberLabel.setEnabled(false);
                    			sp.setEnabled(false);
                    			number.setEnabled(false);
                    			buttonAdd.setEnabled(false);
                    			buttonOK.setEnabled(true);
                			} 
            			}
            			
            			
            			        			
            		}
        		}
        		
        	}
        	});
        
        panel.add(Box.createHorizontalStrut(30));
 */
