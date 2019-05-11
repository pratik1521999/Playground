#include <stdio.h>
int factorial(int n){
   if(n>1)
   {
     return  (n *factorial( n-1));
   }
}
int main() {
  int sum=0,num,b,num1=0;
 
  scanf("%d",&num);
   num1 = num ;
	while(num > 0)
    {
       b = num % 10;
      sum = sum + factorial(b);
      num = num / 10;
    }
  
 
  if(sum == num1)
  {
    printf("Yes");
  }
  else
  {
     printf("No");
  }
  
	return 0;
}