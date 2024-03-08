



class nodeCenter
 {
 public static void main( String [] arg)
 {
    singlyInput sobj = new singlyInput();
      
    sobj.InsertFirst(5);
    sobj.InsertFirst(4);
    sobj.InsertFirst(3);
    sobj.InsertFirst(2);
    sobj.InsertFirst(1);
    
    System.out.println(" Middle number is : "+sobj.MiddleChecker());

    singlyInput sobj2 = new singlyInput();
      
    sobj2.InsertFirst(6);
    sobj2.InsertFirst(5);
    sobj2.InsertFirst(4);
    sobj2.InsertFirst(3);
    sobj2.InsertFirst(2);
    sobj2.InsertFirst(1);
    
    System.out.println(" Middle number is : "+sobj2.MiddleChecker());

 }  

}


class Node
{
    public int data;
    public Node next;

    public Node (int no)
    {
       this.data = no;
       this.next = null;
    }
}


class singlyInput
{
    public Node first;
    public int iCount;

  public singlyInput() 
   {
      this.first = null;
      this.iCount = 0;  
    }

    public void Display ()
    {
        System.out.println("Element of link list are : ");
        Node temp = first;

        while(temp != null)
        {
            System.out.println(" | "+temp.data+" | -> ");
            temp = temp.next;
        }
         System.out.println(" null ");
    }  

    public int Count()
    {
        return iCount;
    }

  public void InsertFirst(int no)
    {
       Node newn = new Node (no);
       
       if(first == null)
       {
         first = newn;
       }
       else
       {
        newn.next = first;
        first = newn;
       }
       iCount++;
    }

    public int MiddleChecker() 
    {
        int iMiddle = 0;
     Node ntemp = first;
     int iCount = Count();
 
     if(iCount % 2 != 0)
     {
        System.out.println(" Icount is "+iCount);
      for(int i=1; i < (iCount+1)/2; i++)
      {
        ntemp = ntemp.next;
      }
      iMiddle = ntemp.data;
      
    }
     else 
     {
        for(int i=1; i < iCount/2; i++)
        {
          ntemp = ntemp.next;
        }
        ntemp = ntemp.next;
        iMiddle = ntemp.data;
         
        
     }
     return iMiddle;
    }


}

