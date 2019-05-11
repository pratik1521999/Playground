#include <stdio.h>

int main(){
	int n;
	scanf("%d",&n);
	
	for(int i=1, k=0 ;i<=n;++i)
	{
		for(int j=1;j<=n-i;j++)
		{ 
		  printf(" ");
		}
		  while(k< 2*i-1)
		  {
		  	 printf("*");
		  	k++;
		  }
		  k=0;
		
		   
			
			
		
		printf("\n");
	}

	return 0;
}