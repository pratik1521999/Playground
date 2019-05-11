#include <stdio.h>
int main() {
    int n,c=0;
  scanf("%d",&n);
	for(int i=1;i<=2*n;i++)
    {
      if(i%2!=0)
      {if(c<=n)
      {
        printf("%d\n",i);
      }
      }
    }
	return 0;
}