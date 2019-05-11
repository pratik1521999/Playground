#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  int num[10]={0} ;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(int i=0;i<n;i++)
  {
    int offset = arr[i];
    num[offset]++;
  }
  
  for(int j=1;j<=n;j++)
  {
    if(num[j]==0)
    {
      printf("%d",j);
    }
  }
  return 0;
}