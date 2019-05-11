#include <stdio.h>
int main() {
    int n,m;
  scanf("%d",&n);
  m = n;
  for(int i=1;i<=n;i++)
  {
    for(int j=m;j>=1;j--)
    {
      printf("%d",j);
    }
    printf("\n");
    m--;
  }
	return 0;
}