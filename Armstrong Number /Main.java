#include <stdio.h>
#include<math.h>
int main() {
  int sum=0,num,b;
  scanf("%d",&num);
  int num1=num;
	while(num > 0)
    {
       int b =(num % 10);
      int c = (b * b) * b ;
      sum = sum + c ;
      
      
      
      num = num /10;
      
    }
  
  
  if(sum==num1)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
    
	return 0;
}