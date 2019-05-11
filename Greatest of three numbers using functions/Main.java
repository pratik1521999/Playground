#include <stdio.h>
int greatest1(int num1,int num2,int num3)
{
  if(num1 > num2  && num1 > num3 )
  {
    return num1;
  }
  else
  {
    if(num2 > num1 && num2 > num3)
    {
      return num2;
    }
    else
    {
      return num3;
    }
  }
}
int main(){
	int num1,num2,num3,greatest;
    scanf("%d %d %d",&num1,&num2,&num3);
    greatest = greatest1(num1,num2,num3);
    printf("%d",greatest);
  	return 0;
}