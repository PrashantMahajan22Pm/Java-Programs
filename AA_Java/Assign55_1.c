#include<stdio.h>

 int CountWhitw(char *str)
 {
  int iSum = 0;
  if(*str != '\0')
  { 
   return iSum;
  }
 else{
    
   str++;
    CountWhitw(str);
     if(*str == ' ')
   {
   iSum++;
   }
  }
   
  return iSum;
 }
int main()
{
char crr[40];

printf("Enter the String ");
scanf("%[^\n]",&crr);
fflush(stdout);
printf("%s",crr);
printf("\ntotal charachter is %d ",CountWhitw(crr));
    return 0;
}