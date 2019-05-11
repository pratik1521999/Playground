#include<stdio.h>
void main()
{
int i,j,n,k;
scanf("%d",&n);
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(i%2)
{
if(j<n)
printf("%d",i);
else{
k=i;
printf("%d",++k);
}
}
else{
if(j==1)
{
k=i;
printf("%d",++k);
}
else
printf("%d",i);
}
}
printf("\n");
  
  
}
  
}
