 
 import java.awt.*;
 import java.awt.event.*;
import java.util.Calendar;
 import java.util.Calendar;

class AWTEXP1 extends Frame implements ActionListener{
    TextField tf;
    AWTEXP1 ()
    {
        
        // Create Componets
        tf = new TextField();
        tf.setBounds(60,50,100,20);
        Button ButtoN = new Button(" Date_Checker");
        ButtoN.setBounds(100,120,80,30);

        // register listner

        ButtoN.addActionListener(this); // passing currunt instance

        // add add compponents and set size,layOut and visibility
        add(ButtoN);
        add(tf);

        setSize(300,300);
        setLayout(null);

         setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
     Calendar cal=Calendar.getInstance();
    tf.setText(cal.get(Calendar.DATE)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.YEAR));
    }

   public static void main(String [] Arg)
   {
    
    new AWTEXP1();
   
   }
}
