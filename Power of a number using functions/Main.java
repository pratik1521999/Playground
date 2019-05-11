#include<stdio.h>
#include<math.h>
int power(int base,int expo)
{
  return pow(base , expo) ;
}
int main(){
    int base,expo,ans;
    scanf("%d %d",&base,&expo);
    ans = power(base,expo);
    printf("%d",ans);
  	return 0;
}