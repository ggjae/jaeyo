#include <stdio.h>
int main()
{
	int c,d;
	while(c!=EOF){
		c=getchar();
		if(c!=' '){		
			putchar(c);
			printf("\n");	
		}
	}
	
}
