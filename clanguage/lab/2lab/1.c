#include <stdio.h>

/* copy input to output; 2nd version */
int main() {
    int c;
	int d;
	d=0;
	while ((c = getchar()) != EOF){
	
		if (c == ' '){
			if (d==1){
				continue;
			} else{
				d = 1;
				putchar(c);	
			}
		}
		else{
			d=0;
			putchar(c);	
		}
	}
}
