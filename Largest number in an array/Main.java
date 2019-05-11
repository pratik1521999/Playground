#include<stdio.h>
int main()
{int n,max=0;
 scanf("%d",&n);
 int arr[n];
 for(int i=0;i<n;i++)
 {
   scanf("%d",&arr[i]);
 }
 
 for(int j=0;j<n;j++)
 {
   if(arr[j]>max)
   {
     max = arr[j] ;
   }
 }
 
 printf("%d",max);
 
 
  
  return 0;
}