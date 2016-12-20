#include <stdio.h>
void squeeze()
{
    int b,c,d;
    d = 0;
	while (c != EOF) {
		if(c == ' '){
			if((c=getchar())==' '){
				continue;
			}
			else{
				putchar(c);
			}		
		}
		else if(c != ' '){
			d=0;
			c = getchar();
			putchar(c);
				
		}	
	}
}

int main()
{
	squeeze();
}

