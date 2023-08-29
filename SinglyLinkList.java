import java.util.*;

class Node
{
 public int data;
 public String Name;
 public Node next;

 public Node(int no,String str)
 {
  this.data = no;
  this.Name = str;
  this.next = null;
 }
}


class Singly
{
    public Node  first;
    public int iCount;

    public Singly()
    {
    this.first = null;
    this.iCount= 0;
    }

    public void Display()
    {
        System.out.println("Element of LinkedList is ");
     Node temp = first;

     while(temp != null)
     {
      System.out.println("Name is "+temp.Name+" It data Enrey is "+temp.data);
      temp= temp.next; 
    }
          System.out.println("null ");

    }

    public int Count()
    {
     return iCount;
    }

  public void InsertFirst(int no,String ch)
  {
   Node newn = new Node(no,ch);

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

  public void InsertLast(int no,String ch)
  {
    Node newn = new Node(no,ch);
   
   if(first == null)
   {
    first = newn;
   }
   else
   {
     Node  temp = first;
  
     while(temp.next != null)
     {
      temp = temp.next;
     }
     temp.next = newn;
  
   }
   iCount++;
  }

  public void InsertAtPos(int iPos,int iNo, String srr)
  {
    if(iPos > iCount + 1 || iPos < 1)
    {
     System.out.println("Invalid Entery ");
     return;
    }
    if(iPos == 1)
    {
     InsertFirst(iNo,srr);
    }
    else if(iPos == iCount + 1)
    {
     InsertLast(iNo,srr);
    }
    else
    {
     Node newn = new Node(iNo, srr);
     Node temp = first;

     for(int i=1; i < iPos - 1; i++)
     {
      temp = temp.next;
     }
     newn.next = temp.next;
     temp.next = newn;
     iCount++;
    }

  }

  public void DeleteFirst()
  {
    if( first != null)
    {
     first = first.next;
    }
    iCount--;
  }

  public void DeleteLast()
  {
    if( first == null)
    {
     return;
    }
    if (first.next == null)
    {
     first = null;
    }
    else
    {
     Node temp = first;
     while(temp.next.next != null)
     {
     temp= temp.next;
     }
     temp.next=null;
    }
    iCount--;
  }

  public void DeleteAtPos(int iPos)
  {
    if(iPos > iCount + 1 || iPos < 1)
    {
     System.out.println("Invalid Entry ");
     return;
    }
    if(iPos == 1)
    {
     DeleteFirst();
    }
    else if(iPos == iCount)
    {
    DeleteLast();
    }
    else
    {
    
     Node temp = first;

     for(int i=1; i < iPos - 1; i++)
     {
      temp = temp.next;
     }
     temp.next = temp.next.next;
     iCount--;
    }
  }

}

class SinglyLinkList {
    public static void main(String [] Arg )
    {
       
     Singly obj = new Singly();
     obj.InsertFirst(51,"Raghav");
     obj.InsertFirst(21,"Pitu");
     obj.InsertFirst(11,"Disco");

     obj.InsertLast(101,"Bosss");
     obj.InsertLast(111,"New Don");
     obj.InsertLast(121,"Best Player");

     obj.InsertAtPos(2,44,"Best One");
     obj.Display();

     System.out.println("Number of elements are : "+obj.Count()); 

     obj.DeleteAtPos(4);

     obj.Display();

     System.out.println("Number of elements are : "+obj.Count()); 

     obj.DeleteFirst();               
     obj.DeleteLast();

     obj.Display();

     System.out.println("Number of elements are : "+obj.Count()); 

  }
}



