import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PizzaShop   extends JFrame 
{
	 private JCheckBox Green, Olives ,Muchroom, Cheese, Pepproni, Sauage;
	 private  JTextArea Resultts;
	 private ButtonGroup group2 ,  group ;
	 private JRadioButton Small, Medium, Large;
	 private JRadioButton Thin, Medu, Pan;
	 private JLabel Lab;
	 private JButton Process;
	 private CalculateButtonHandler  TRHandler;
	 
		  
	//  title in JLabel
	 public void paint(Graphics g)
	 {	   super.paint(g);
		   g.setColor(Color.red);
		   g.setFont(new Font("Serif" , Font.BOLD+Font.ITALIC, 30)); 
		   g.drawString(" Welcome to Home Stlye pizza Shop",100,90);
		   		
		// Topping
		g.setColor(Color.red);
	        g.drawRect(120, 105, 130 , 260);
	        g.setFont(new Font(getName(), Font.BOLD, 10));
		g.drawString(" Each Topping: $1.50",125, 120);
	       
		// Size
	        g.setColor(Color.red);
	        g.drawRect(255, 105,125 , 150);
	        g.setFont(new Font(getName(), Font.BOLD, 10));
		g.drawString(" Pizza Size",260, 120);	
	        
		//Type
	        g.setColor(Color.red);
	        g.drawRect(385, 105, 125, 150);
	        g.setFont(new Font(getName(), Font.BOLD, 10));
			g.drawString(" Pizza Type",390, 120);
			
		// Your order:
		g.setColor(Color.black);
		g.setFont(new Font(getName(), Font.BOLD, 15));
		g.drawString(" Your order :",100, 385);
	        }
		   
	
 	// modal shop 
    
    	public PizzaShop ()
    	{
    		//JFrame frame = new JFrame();
    		super("Pizza");
    		Container c = getContentPane();
    		c.setLayout(null);
    		c.setBackground(Color.lightGray);
    		
    	
    		
    	//CheckBox 
    		// boolean cbg = new CheckboxGroup(); 
    		Green = new JCheckBox("Green Pepper" );
    		Olives = new JCheckBox("Black Olives");
    	    Muchroom = new JCheckBox("Muchrooms");
    	    Cheese = new JCheckBox("Extra Cheese");
    	    Pepproni = new JCheckBox("Pepproni" );
    	    Sauage = new JCheckBox( "Sauage");
    		
    		
//        Green = new JCheckBox("Green Pepper");
//		Olives = new JCheckBox("Black Olives");
//	    Muchroom = new JCheckBox("Muchrooms");
//	    Cheese = new JCheckBox("Extra Cheese");
//	    Pepproni = new JCheckBox("Pepproni" );
//	    Sauage = new JCheckBox( "Sauage");
    		
//   
	    
	   // CalculateButtonHandler handler = new CalculateButtonHandler();
//	    Green.addActionListener(TRHandler);
//	    Olives.addActionListener(TRHandler);
//	    
	 // Button
	    Process = new JButton("Process Selection");
	    TRHandler= new CalculateButtonHandler();
	    Process.addActionListener(TRHandler);
	    
	    
	    // checkBox
//        CalculateButtonHandler handler = new CalculateButtonHandler();	    
//        Green.addActionListener(TRHandler);
//        Olives.addActionListener(TRHandler);
//        Muchroom.addActionListener(TRHandler);
//	    Cheese.addActionListener(TRHandler);
//        Pepproni.addActionListener(TRHandler);
//        Sauage.addActionListener(TRHandler);
//        
	    // Radio Button Pizza Size
	    Small = new JRadioButton("Small: $6.50");
	     Medium = new JRadioButton(" Madium: $8.50");
	     Large = new JRadioButton("Large: $10.00");
	
	    
//       Group Size
	    ButtonGroup Size = new ButtonGroup();
       Size.add(Small);
       Size.add(Medium);
       Size.add(Large);
	    
       
	    // Radio Button type
	    Thin = new JRadioButton("Thin Crust");
	    Medu= new JRadioButton("Thin Crust");
	    Pan = new JRadioButton ("Pan");
	    
//	     Group Types
	    ButtonGroup Types = new ButtonGroup();
	       Types.add(Thin);
	       Types.add(Medu);
	       Types.add(Pan);
	    
	   //  Text 
	    Resultts = new JTextArea();
	    Resultts.setFont(new Font("Courier",Font.PLAIN,12));
	   //   JButton button = new JButton("Process Selection");
//	 	// button.addAncestorListener(this);

	    
	    
	      
	  //   set Topping
	    Green.setSize (120, 30);
	    Olives.setSize (120, 30);
	    Muchroom.setSize (120, 30);
	    Cheese.setSize (120, 30);
	    Pepproni.setSize (120, 30);
	    Sauage.setSize (120, 30);
	    
	    // set size 
	    Small.setSize (120, 30);
	    Medium.setSize (120, 30);
	    Large.setSize (120, 30);
	    
	    // set Type
	    Thin.setSize (120, 30);
	    Medu.setSize (120, 30);
	    Pan.setSize (120, 30);
	    
	    // set Text area 
	  Resultts.setSize( 460, 150);
	// Lab.setSize(460, 150);  
	    
	  // set button
	  Process.setSize(220, 30);
	  
	     
	    // Location of Topping
	    Green.setLocation (120, 100);
	    Olives.setLocation (120, 140);
	    Muchroom.setLocation (120,180);
	    Cheese.setLocation (120, 220);
	    Pepproni.setLocation (120,260);
	    Sauage.setLocation (120, 300);
	   
	    // Location Size
	    Small.setLocation (250, 100);
	    Medium.setLocation (250,140);
	    Large.setLocation (250, 180);

	    
	    // Location Tupe
	    Thin.setLocation (380, 100);
	    Medu.setLocation (380, 140);
	    Pan.setLocation (380, 180);
    
	    // Location Text area 
	    Resultts.setLocation(100,370);
	//	Lab.setLocation(100, 350 );   
	    // Location button
	    Process.setLocation(290, 260);
	    
	    
	    // Place Topping
	    c.add (Green);
	    c.add (Olives);
	    c.add (Muchroom);
	    c.add (Cheese);
	    c.add (Pepproni);
	    c.add (Sauage);
	    
	    // pane Pizza Size
	  
	    c.add (Small);
	    c.add (Medium);
	    c.add (Large);
	    
	    // pane Pizza Type
	    c.add (Thin);
	    c.add (Medu);
	    c.add (Pan);
	    
	    //     text
	    c.add(Resultts);
	   // c.add(Lab);
	     
	    // pane button
	    c.add(Process);

	    ButtonGroup group = new ButtonGroup();
	  
	    group.add(Small);
	    group.add(Medium);
	    group.add(Large);
	    
	    
	    ButtonGroup group2 = new ButtonGroup();
	    
	    group2.add(Thin);
	    group2.add(Medu);
	    group2.add(Pan);
        
        
        
	    setSize(700, 600);
	    setVisible(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
        }// pizza Shop
    	private void DBill()
    	{
    		double m = 1.50;

    		 
    		
    	}
//    	double    m6 =1.50, m5= 1.50,m4 = 1.50,m3 = 1.50, m2=1.50,m1 = 1.50;
//		 double PS =6.50 ;
//		 double PM = 8.50;
//		 double PL = 10.00;
    	 private class CalculateButtonHandler implements ActionListener
    	{
    	
    		 public void actionPerformed(ActionEvent e){
    		//double    m7 ,m6 , m5, m4, m3, m2, m1;
//    		double PS, PM, PL;
    		//double m = 0;
    			 double M = 0;
    			 double PS =0 ;
    			 double PM = 0;
    			 double PL = 0;
    			 double T= 0;
    			// String Text ;
//      		   
      	if ( Green.isSelected() ) 
      	{	
      		 T +=1.50;   		
      		Resultts.append("Green , ");
      			T +=1.50;}
      	 if (Olives.isSelected()) 
      		     	 
      		{Resultts.append("Olives , ");
      	T +=1.50;} 
      	  if (	Muchroom.isSelected()) 
      	  {   Resultts.append("Muchroom , ");
      	T +=1.50;		}
      	  if (Cheese.isSelected())
      	  {  Resultts.append("Extra Cheese, ");
      	T +=1.50;	}
	   if(Pepproni.isSelected())
	   { Resultts.append("Pepproni , ");
	   T +=1.50;}
	   if (Sauage.isSelected())
	   {  Resultts.append("Sauage , ");
	   T +=1.50;}
      	  
      	   //Size
      	  if (Small.isSelected())
      	{  PS  +=6.50;
      	  	Resultts.append("\n" +"Pizza Size: Small " + PS );}
    	 if (Medium.isSelected())
    	 {	PM += 8.50;
    			 Resultts.append( "\n" +"Pizza Size: Medium  " + PM );}
    		 if (Large.isSelected())
    	{ PL += 10.00;
    			 Resultts.append("\n" + "Pizza Size: Large " + PL);	}
    		 	//Type
    		 if (Thin.isSelected())
    			 Resultts.append("\n"+"Pizza Type: Thin "  );
    		 if (Medu.isSelected())
    			 Resultts.append("\n" +"Pizza type: Thin Crust ");
    		 if (Pan.isSelected())
    			 Resultts.append("\n"+"Piaaz type: Pan ");
    		
    		 double we;
    		 we = T +PS +PM +PL;

    		 Resultts.append( "\n" + "Amount Due " + we+"\n");
    		 
    				    		 
    		
    		 }	
    	}
    	   
    	
  	
    	// main
    	public static void main(String[] args)
    	   {
    	        PizzaShop alc = new PizzaShop();
    	   }
    }// end of class
 
