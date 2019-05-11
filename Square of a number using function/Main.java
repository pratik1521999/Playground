#include<stdio.h>
int square_1(int n)
{
  return n*n;
}
int main() {
   int n;
   scanf("%d",&n);
   int a = square_1(n);
   printf("%d",a);
   
   return 0;
}