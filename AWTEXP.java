  
  //  we can print Daily today_Fast
  
  import java.awt.*;
   
  // extending Frame class to our class AWTExample


  class AWTEXP {
    public static void main(String []  Arg)
    {
  AWTExample1 aobj = new AWTExample1();
    }
 }

 class AWTExample1 extends Frame
  {
   public AWTExample1()
   {
  //  creating a button

  Frame f = new Frame();

  Label lb = new Label("Employee ID");

  Button b = new Button("EXP");

  TextField tf = new TextField();


  // setting button position on screen 
  lb.setBounds(20,80,80,30);
  tf.setBounds(20,100,80,30);
  b.setBounds(100,100,80,30);

  

 //adding butoon into frame
  f.add(b);
  f.add(tf);
  f.add(lb);
 
  // frame size 300 width and 300 height
  f.setSize(400,300);

  // setting the tittle of Frame
  f.setTitle("Employee info" );

  // no layout manager
  f.setLayout(null);

  // now frame will be visible , by default it is not visible
  f.setVisible(true);

   }
   }
  
 
