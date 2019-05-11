#include<stdio.h>
int main()
{
  int num;
  char arr[6][10]={"Zero","One","Two","Three","Four","Five"};
  
  scanf("%d",&num);
  if(num>1 && num<5)
  {
     printf("%s",arr[num]);
  }
  else
  {
    printf("Invalid");
  }
  return 0;
}