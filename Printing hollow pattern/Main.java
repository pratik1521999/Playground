#include <stdio.h>
int main() {
	// Type your code here
	int n;
  scanf("%d", &n);
  for (int i=1;i<n+1;i++){
  	if(i==1||i==n){
    	for(int j=0;j<n;j++){
        	printf("*");
        }
      printf("\n");
    }else{
    	printf("*");
      	for(int j=0;j<n-2;j++){
        	printf(" ");
        }
      	printf("*\n");
    }
  }
}