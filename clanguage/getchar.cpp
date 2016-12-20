#include <stdio.h>

/* copy input to output; 2nd version */
int main() {
    int c;
    char b;
    char a;
	
	while ((c = getchar()) != EOF){
		a = c;
		if (a == ' '){
			if (b == ' '){
				continue;
			}
		}
		b = c;
		putchar(c);
	}	
}
