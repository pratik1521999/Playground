#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,b;
  scanf("%d",&n);
  int arr[10]={0};
  int i=0;
  int c;
  while(n>0)
  {
    b=n%10;
    
    arr[i]=b;
    n=n/10;
    i++;
    
  }
  int sum =  arr[i-2];
  printf("%d",sum);
  
}