#include <stdio.h>
int main()
{
   int l ,e ;
  
  scanf("%d",&l);
   int arr[l];
  for(int k=0;k<l;k++)
  {
    scanf("%d",&arr[k]);
  }
  
  scanf("%d",&e);
  
  
   
 
   
   
  for(int i=0;i<l;i++)
  {
    for(int j=0;j<l-1;j++)
    {
      if(arr[j]<arr[j+1])
      {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp ;
      }
    }
  }
  
  printf("%d",arr[e-1]);
  
   return 0;
}