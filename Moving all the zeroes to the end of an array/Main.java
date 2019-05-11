#include<stdio.h>
int main()
{
  
  int size,c=0,c1=0;
  int zero_arr[10];
  int not_zero[10];
  
  scanf("%d",&size);
  int arr[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  
  for(int j=0; j<size; j++)
  {
   if(arr[j]==0)
   {
     zero_arr[c1]=arr[j];
     c1++;
   }
    else
    {
      not_zero[c]=arr[j];
      c++;
    }
  }
  
  for(int x=0;x<c;x++)
  {
    printf("%d ",not_zero[x]);
  }
  for(int x=0;x<c1;x++)
  {
    printf("%d ",zero_arr[x]);
  }
  return 0;
}