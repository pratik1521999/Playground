// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<string.h>
// Main function
int main()
{
  char arr[100];
  int alpha[26]={0};
  gets(arr);
  int l = strlen(arr);
  for(int i=0;i<l;i++)
  {
    if(arr[i]>='a' && arr[i]<='z')
    {
      int offset = arr[i] - 'a' ;
      alpha[offset]++;
    }
  }
  int ch = 'a';
  for(int j =0 ; j<26;j++)
  {
    if(alpha[j]!=0)
    {
      printf("%c",ch);
      printf("%d ",alpha[j]);
      ch++;
    }
    else
    {
      ch++;
    }
  }
  
  
  
   return 0;
}