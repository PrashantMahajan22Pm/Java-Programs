import java.util.*;

/*
 *   Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the Product Name");
   String str = sobj.nextLine();
 */

class InvertryClipper
{
  public static void main(String [] Arg)
  { 
   Scanner sobj = new Scanner(System.in);
   System.out.println("***CMC Inventery System***");
    Create_In Cobj = new Create_In();
   Cobj.CreateClipper("Cycle");
   Cobj.CreateClipper("BiCycle");
   Cobj.CreateClipper("Train");
   Cobj.CreateClipper("Bus");
   Cobj.CreateClipper("Bike");
   
    while(true)
    {
    System.out.println("\n 'a' for adding Inventry \t'R' for Remove Inventry \t 'G' for Display  Graph \t 'Q' for Quit");
    char ch = sobj.next().charAt(0);

    if(ch == 'a')
    {
      System.out.println("Enter the Code");
      int ICod = sobj.nextInt();
      System.out.println(" Add the Inventry");
      int Inv = sobj.nextInt();
      Cobj.Remove(ICod, Inv);
    }
    else if(ch == 'R')
    {
        System.out.println("Enter the Code");
      int ICod = sobj.nextInt();
      System.out.println(" Remove the Inventry");
      int Inv = sobj.nextInt();
      Cobj.Remove(ICod, Inv);
    }
    else if(ch == 'G')
    {
     Cobj.Display1();
      Cobj.Display();
    }
     else if(ch == 'Q')
     {
       break;
     }
    }
  }
}

class Node
{
 public int  Item_Code;
 public String Products;
 public int Inventery;
 public Node next;

 public Node( String str,int iCode, int Zero)
 {
    this.Products = str;
    this.Item_Code = iCode;
    this.Inventery = Zero;
    this.next = null;
 }
 }

 //////////new Class////////////

class Create_In
{
 public Node first;
 public int iCount;
 public int Code;
 private int iCnt;

 public Create_In()
 {
  this.first = null;
  this.iCount = 0;
  this. Code = 1;
  this.iCnt = 0; 

 }

 public int Count()
 {
    return this.iCount;
 }

 public void CreateClipper(String str)
 { 
  int aTemp = 0;
  
   Node newn = new Node(str,Code,aTemp);
   
   Code++;

   if(first == null)
   {
    first = newn;
   }
   else
   {
    Node temp = first;
   
   while(temp.next != null)
   {
    temp = temp.next;
    }
    temp.next = newn;
  }
    this.iCount++;
    System.out.println("Product is added "+newn.Products+" and its Code is "+newn.Item_Code);
 }


  public void Accept(int ICode, int Inv)
  { 
    int iCheck = 0;
    Node temp = first;
    if(Inv <= 0 || Inv >= 51)
    {
      System.out.println("Wrong Entry");
      return ;
    }
  
    for(int i= 1; i< ICode ; i++)
    {
    if(temp == null)
    {
      System.out.println("Temp is Null");
      return;
    }
    temp = temp.next;
  }
     iCheck =temp.Inventery + Inv;
     if(iCheck <= 50)
     {
     temp.Inventery = Inv;
     }
     else
     {
      System.out.println("Unable to add Inventry");
      return;
     }
  }

  public void Remove(int ICode,int Inv)
  {   
    
    int iCheck = 0;
    Node temp = first;
    if(Inv <= 0 || Inv >= 51)
    {
      System.out.println("Wrong Entry");
      return ;
    }
  
    for(int i= 1; i< ICode ; i++)
    {
    if(temp == null)
    {
      System.out.println("Temp is Null");
      return;
    }
    temp = temp.next;
  }
     iCheck =temp.Inventery - Inv;
     if(iCheck >=0 )
     {
     temp.Inventery = Inv;
     }
     else
     {
      System.out.println("Unable to Remove Inventry");
      return;
     }
  }
  
  public void Display1()
  {
      System.out.println("Products  of Clipper are : ");

        Node temp = first;

        while(temp!= null)
        {
            System.out.print("| "+temp.Products+" |-> ");
            temp = temp.next;
        }
        System.out.println("null");
  }

  public void Display()
  {
    int iCount = Count();
    Node temp = first;
    System.out.print("\nItem\t  Item_Code  Inventry  \t Chart \t \n");
   for(iCnt = 0; iCnt < iCount; iCnt++)
   {
     System.out.print(temp.Products+"\t\t"+temp.Item_Code+"\t"+temp.Inventery +"\t ");
     for(int i= 0; i<temp.Inventery; i++)
     {
      System.out.print("*");
     }
     temp = temp.next;  
     System.out.println("");
   }
  }
}

