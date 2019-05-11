#include<stdio.h>
#include<string.h>
char res[100];
static int k =0;
void reverse(char str[100],int start,int end)
{
	for(int i = start ;i<=end ; i++)
	{
		res[k] = str[i];
		k++;
	}
	res[k]= ' ';
	k++;
}
int main()
{
	char s1[100];
	gets(s1);
	int  l = strlen(s1);
	int c = 0;
	for(int j = l-1 ;j >=0 ;j--)
	{
		c++;
		if(s1[j]==' ')
		{
			reverse(s1 , j+1 ,j+c-1);
			c = 0;
		}
		if(j==0)
		{
		  reverse(s1 , j ,j+c-1);
			c = 0;	
		}
	}
	
	printf("%s",res);
	
    
	
}