 
 import java.util.Scanner;

 class elementSearchInArray
 {
     public static void main(String [] arg)
     {
  Scanner sobj = new Scanner(System.in);
  int numx[] = {3,2,2,3};
 
  int valx = 3;

  Solution solobj = new Solution(numx);

  int iRes = solobj.removeElement(valx);

  solobj.print(iRes);

  // second value for checking 
  int num2 [] = {0,1,2,2,3,0,4,2};
  int valx2 = 2;
 
  Solution solobj2 = new Solution(num2);
  
  iRes = solobj2.removeElement(valx2);

  solobj2.print(iRes);
     
     }
 }

 class Solution {
   private int[] nums ;
    public Solution(int x [])
    {
        nums = x;
    }
    public int removeElement( int val) {
        int iAns = 0;
   
  for(int i = 0; i < nums.length; i++)
    {
       if(nums[i] != val )
       {
           nums[iAns] = nums [i];
        iAns++;
         } 
       }
    return iAns;
    }

    public void print(int size)
       {
  System.out.println("Size of array  is "+size);
     System.out.print("Array is [ ");
  for(int i = 0; i < size; i++)
    {
      System.out.print(this.nums[i]+",");
      }
      System.out.print(" ]\n");
    }
  }