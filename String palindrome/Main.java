#include<stdio.h>
#include<string.h>
int main()
{
  char arr[100];
  static int c = 0;
  gets(arr);
  int l = strlen(arr);
  int k = l-1;
  int i = 0 ;
  while(i<=k)
  {
    if(arr[i]!=arr[k])
    {
      c++;
      i++;
      k--;
    }
    else
    {
      i++;
      k--;
    }
  }
  
  if(c>0)
  {
    printf("%s is not a palindrome",arr);
  }
  else
  {
    printf("%s is a palindrome",arr);
  }
}