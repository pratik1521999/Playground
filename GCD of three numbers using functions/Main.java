#include <stdio.h>
int gcd1(int num1,int num2,int num3)
{int gcd=1;
  for(int i=1;i<=num1;i++)
  {
    if(num1 % i == 0 && num2 %i == 0  && num3 % i == 0)
    {
      gcd = i;
      
    }
  }
 return gcd;
  
}
int main(){
	int num1,num2,num3,gcd;
    scanf("%d %d %d",&num1,&num2,&num3);
    gcd = gcd1(num1,num2,num3);
    printf("%d",gcd);
  	return 0;
}