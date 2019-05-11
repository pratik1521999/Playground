#include<stdio.h>
int sum1(int n)
{
  if(n <= 0) return;
  return (n + sum1(n-1));
}
int main() {
   int n,a;
   scanf("%d",&n);
   a = sum1(n);
   printf("%d",a);
  	return 0;
}