#include<stdio.h>
int findprime(int num)
{int c = 0;
  
  for(int j=1;j<=num;j++)
  {
    if(num % j == 0 )
    {
      c = c+1;
    }
  }
   if(c==2)
   {
     return num;
     
   }
  else
  {
    return 0;
  }
  
}
int main(){
    int n;
   scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    if(findprime(i)> 0)
    {
      printf("%d\n",findprime(i));
      
    }
  }
    return 0;
}