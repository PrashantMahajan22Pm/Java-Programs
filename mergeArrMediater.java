
 class mergeArrMediater
 {
     public static void main(String [] arg)
     {
        int Arrx1 [] = {2,1};
        int Arrx2 [] = {4,5,3};
     
        MAMediater mobj1 = new MAMediater(Arrx1,Arrx2);
        mobj1.MergerAr();
        mobj1.Printer();
        mobj1.Seter();
        mobj1.Printer();
        mobj1.checker();

        int Ar1 [] = {1,2};
        int Ar2 [] = {5,3};
     
         System.out.println("Second array is ");
        MAMediater mobj2 = new MAMediater(Ar1,Ar2);
        mobj2.MergerAr();
        mobj2.Printer();
        mobj2.Seter();
        mobj2.Printer();
        mobj2.checker();

      
     }
 }

 class MAMediater
 {
    public int Arr1[];
    public int Arr2[];
  public int Merger [];
     public MAMediater(int X[] , int Y [])
     {
        Arr1 = X;
        Arr2 = Y;
        
     }

     public void MergerAr()
     {
        Merger = new int [Arr1.length + Arr2.length];
        int A = 0 ;
        int i = 0 ;
        for(; i< Arr1.length; i++)
        {
            Merger[A] = Arr1[i];
            A++;
        }
        for(i=0; i< Arr2.length; i++)
        {
            Merger[A] = Arr2[i];
            A++;
        }
     }
      
     public void Printer()
     {
        System.out.print(" Array is [ ");
        for(int i=0; i< Merger.length; i++)
        {
            System.out.print(Merger[i] +",");
        }
        System.out.print(" ] \n");
     }
  
     public void Seter()
      {
         int iStart = 0;
         int iEnd = Merger.length-1;
         int iTemp = 0;
       
         while (iStart < iEnd)
          {
           if(Merger[iStart] > Merger[iEnd])
           {
            iTemp = Merger[iStart];
            Merger[iStart] = Merger[iEnd];
            Merger[iEnd] = iTemp;
           }
            if(Merger[iStart] > Merger[iStart + 1])
           {
            iTemp = Merger[iStart + 1];
            Merger[iStart + 1] = Merger[iStart];
            Merger[iStart] = iTemp;
           }
            if(Merger[iEnd -1 ] > Merger[iEnd])
           {
            iTemp = Merger[iEnd - 1];
            Merger[iEnd - 1] = Merger[iEnd];
            Merger[iEnd] = iTemp;
           }

            
            iStart++;
            iEnd--; 
         }
        

      }
     public void checker()
     {
        boolean bCheck = false;
        if(Merger.length % 2 != 0)
        {
            bCheck = true;
        }
        if(bCheck == true)
            {
        System.out.println(" The mediater of array is "+ Merger[(Merger.length -1 )/2]);
           }
       else
        {
            int Mfirst = (Merger.length )/2 ;
            int Msecond = Mfirst-1;
            float MEdIA  = ((Merger[Mfirst] + Merger[Msecond]));
            System.out.println("MEdIA is "+MEdIA+" First is "+Merger[Mfirst]+" and second is "+Merger[Msecond]);
            System.out.println(" Mediater is "+ (MEdIA/2));
        }
           
        
     }
 }