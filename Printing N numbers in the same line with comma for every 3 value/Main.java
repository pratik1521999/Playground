#include<stdio.h>
int main()
{
	int n;
    int c=0;
    scanf("%d",&n);
    for(int num = 1 ; num <= n ; num++) 
      {
		printf("%d",num);
        c =c+1;
        if(c==3)
        {
          printf(",");
          c=0;
        }
        
	  }
	return 0;
}